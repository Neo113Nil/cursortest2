package xsna;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: ContextMenuDelegate.kt */
/* loaded from: classes3.dex */
public final class qnj implements xnj, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context b;
    public final WindowManager c;
    public WeakReference<View> d = new WeakReference<>(null);
    public ViewGroup e;

    public qnj(Context context) {
        this.b = context;
        this.c = (WindowManager) context.getSystemService("window");
    }

    public final Pair<Integer, String> a(int i) {
        return new Pair<>(Integer.valueOf(i), this.b.getString(i));
    }

    public final void b(View view) {
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.c.removeView(view);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.d.get();
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            viewGroup = null;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.y = view.getPaddingTop() + (znk0.y(view).top - ((int) (this.b.getResources().getDisplayMetrics().density * 52)));
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        if (viewGroup2.isAttachedToWindow()) {
            ViewGroup viewGroup3 = this.e;
            this.c.updateViewLayout(viewGroup3 != null ? viewGroup3 : null, layoutParams);
        }
    }

    @Override // xsna.xnj
    public final boolean showContextMenuForChild(View view, float f, float f2) {
        ClipData clipData;
        CharSequence charSequence;
        ClipData.Item itemAt;
        if (!(view instanceof EditText)) {
            return false;
        }
        this.d = new WeakReference<>(view);
        EditText editText = (EditText) view;
        if (editText.getSelectionEnd() - editText.getSelectionStart() != editText.getText().length() && f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int offsetForPosition = editText.getOffsetForPosition(f, f2);
            String obj = editText.getText().toString();
            int O = drm0.O(offsetForPosition, 4, obj, " ") + 1;
            int K = drm0.K(offsetForPosition, 4, obj, " ", false);
            int max = Math.max(0, O);
            if (K < 0) {
                K = obj.length();
            }
            editText.setSelection(max, K);
        }
        view.requestFocus();
        TextView textView = (TextView) view;
        ArrayList arrayList = new ArrayList();
        int selectionEnd = textView.getSelectionEnd() - textView.getSelectionStart();
        if (selectionEnd > 0) {
            arrayList.add(a(R.string.cut));
            arrayList.add(a(R.string.copy));
        }
        Context context = this.b;
        try {
            clipData = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        } catch (Throwable unused) {
            clipData = null;
        }
        if (clipData == null || (itemAt = clipData.getItemAt(0)) == null || (charSequence = itemAt.getText()) == null) {
            charSequence = "";
        }
        if (charSequence.length() > 0) {
            arrayList.add(a(R.string.paste));
        }
        if (textView.getText().length() > 0 && selectionEnd < textView.getText().length()) {
            arrayList.add(a(R.string.selectAll));
        }
        onj onjVar = new onj(this, view, f, f2);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(com.vkontakte.android.R.layout.photo_viewer_context_menu_layout, (ViewGroup) null, false);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(com.vkontakte.android.R.id.menu_container);
        EditText editText2 = (EditText) viewGroup.findViewById(com.vkontakte.android.R.id.proxy_edit_text);
        editText2.setText(editText.getText());
        editText2.setSelection(editText.getSelectionStart(), editText.getSelectionEnd());
        editText2.addTextChangedListener(new pnj(editText, editText2, this));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            TextView textView2 = (TextView) layoutInflater.inflate(com.vkontakte.android.R.layout.photo_viewer_context_item, viewGroup2, false);
            textView2.setText((CharSequence) pair.j());
            textView2.setOnClickListener(new yee(onjVar, viewGroup, pair, 1));
            viewGroup2.addView(textView2);
        }
        this.e = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this);
        ViewGroup viewGroup3 = this.e;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        viewGroup3.setOnKeyListener(new kvt0(new com.vk.movika.sdk.base.logic.processor.actions.i(this, 25)));
        ViewGroup viewGroup4 = this.e;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        viewGroup4.setOnTouchListener(new bvs(new bu1(this, 22), 3));
        ViewGroup viewGroup5 = this.e;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        viewGroup5.requestFocus();
        ViewGroup viewGroup6 = this.e;
        ViewGroup viewGroup7 = viewGroup6 != null ? viewGroup6 : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 262176, 1);
        layoutParams.softInputMode = 1;
        layoutParams.gravity = 8388659;
        layoutParams.x = (int) (context.getResources().getDisplayMetrics().density * 8);
        layoutParams.y = view.getPaddingTop() + (znk0.y(view).top - ((int) (context.getResources().getDisplayMetrics().density * 52)));
        this.c.addView(viewGroup7, layoutParams);
        return true;
    }
}
