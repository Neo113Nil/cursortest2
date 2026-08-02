package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import defpackage.ayh0;
import defpackage.dsh0;
import defpackage.fl6;
import defpackage.hl6;
import defpackage.ny61;
import defpackage.sgh0;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Deprecated
/* loaded from: classes10.dex */
class BrowserActionsFallbackMenuUi implements AdapterView.OnItemClickListener {
    private static final String TAG = "BrowserActionskMenuUi";
    private BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
    final Context mContext;
    private final List<fl6> mMenuItems;
    hl6 mMenuUiListener;
    final Uri mUri;

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$2, reason: invalid class name */
    public class AnonymousClass2 implements DialogInterface.OnShowListener {
        final /* synthetic */ View val$view;

        public AnonymousClass2(View view) {
            this.val$view = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            BrowserActionsFallbackMenuUi.this.getClass();
            Log.e(BrowserActionsFallbackMenuUi.TAG, "Cannot trigger menu item listener, it is null");
        }
    }

    public BrowserActionsFallbackMenuUi(Context context, Uri uri, List<fl6> list) {
        this.mContext = context;
        this.mUri = uri;
        this.mMenuItems = buildFallbackMenuItemList(list);
    }

    private Runnable buildCopyAction() {
        return new a(this);
    }

    private List<fl6> buildFallbackMenuItemList(List<fl6> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fl6(this.mContext.getString(ayh0.fallback_menu_item_open_in_browser), buildOpenInBrowserAction()));
        arrayList.add(new fl6(buildCopyAction(), this.mContext.getString(ayh0.fallback_menu_item_copy_link)));
        arrayList.add(new fl6(this.mContext.getString(ayh0.fallback_menu_item_share_link), buildShareAction()));
        arrayList.addAll(list);
        return arrayList;
    }

    private PendingIntent buildOpenInBrowserAction() {
        return PendingIntent.getActivity(this.mContext, 0, new Intent("android.intent.action.VIEW", this.mUri), SelfTester_JCP.DECRYPT_CBC);
    }

    private PendingIntent buildShareAction() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.mUri.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.mContext, 0, intent, SelfTester_JCP.DECRYPT_CBC);
    }

    private BrowserActionsFallbackMenuView initMenuView(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(sgh0.browser_actions_menu_view);
        final TextView textView = (TextView) view.findViewById(sgh0.browser_actions_header_text);
        textView.setText(this.mUri.toString());
        textView.setOnClickListener(new View.OnClickListener() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuUi.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int maxLines = textView.getMaxLines();
                TextView textView2 = textView;
                if (maxLines == Integer.MAX_VALUE) {
                    textView2.setMaxLines(1);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                } else {
                    textView2.setMaxLines(Integer.MAX_VALUE);
                    textView.setEllipsize(null);
                }
            }
        });
        ListView listView = (ListView) view.findViewById(sgh0.browser_actions_menu_items);
        listView.setAdapter((ListAdapter) new BrowserActionsFallbackMenuAdapter(this.mMenuItems, this.mContext));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    public void displayMenu() {
        View inflate = LayoutInflater.from(this.mContext).inflate(dsh0.browser_actions_context_menu_page, (ViewGroup) null);
        BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = new BrowserActionsFallbackMenuDialog(this.mContext, initMenuView(inflate));
        this.mBrowserActionsDialog = browserActionsFallbackMenuDialog;
        browserActionsFallbackMenuDialog.setContentView(inflate);
        this.mBrowserActionsDialog.show();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        PendingIntent pendingIntent = this.mMenuItems.get(i).b;
        if (pendingIntent == null) {
            ny61.r("Can't call getAction on BrowserActionItem with null action.");
            return;
        }
        try {
        } catch (PendingIntent.CanceledException e) {
            Log.e(TAG, "Failed to send custom item action", e);
        }
        if (pendingIntent == null) {
            throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
        }
        pendingIntent.send();
        BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = this.mBrowserActionsDialog;
        if (browserActionsFallbackMenuDialog == null) {
            Log.e(TAG, "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            browserActionsFallbackMenuDialog.dismiss();
        }
    }

    public void setMenuUiListener(hl6 hl6Var) {
    }
}
