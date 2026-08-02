package com.yandex.messaging.internal.view.timeline;

import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import defpackage.dmt0;
import defpackage.evu0;
import defpackage.oxe0;
import defpackage.oyh0;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tls;
import defpackage.vlg0;
import defpackage.xmt0;
import defpackage.ymt0;
import defpackage.zmt0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006#"}, d2 = {"Lcom/yandex/messaging/internal/view/timeline/QuoteTextSelectionCallback;", "Landroid/view/ActionMode$Callback;", "Landroid/widget/TextView;", "textView", "Ldmt0;", "spanTransformer", "Lkotlin/Function1;", "", "Lzy11;", "onTextSelected", "Lkotlin/Function0;", "onQuoteLimitExceeded", "onDismissed", "<init>", "(Landroid/widget/TextView;Ldmt0;Ltls;Lsls;Lsls;)V", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/widget/TextView;", "Ldmt0;", "Ltls;", "Lsls;", "Companion", "vlg0", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class QuoteTextSelectionCallback implements ActionMode.Callback {
    public static final int $stable = 8;
    public static final vlg0 Companion = new vlg0();
    private static final int ITEM_ID_QUOTE = 1;
    public static final int MAX_QUOTE_LENGTH = 1024;
    private final sls onDismissed;
    private final sls onQuoteLimitExceeded;
    private final tls onTextSelected;
    private final dmt0 spanTransformer;
    private final TextView textView;

    public QuoteTextSelectionCallback(TextView textView, dmt0 dmt0Var, tls tlsVar, sls slsVar, sls slsVar2) {
        this.textView = textView;
        this.spanTransformer = dmt0Var;
        this.onTextSelected = tlsVar;
        this.onQuoteLimitExceeded = slsVar;
        this.onDismissed = slsVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDestroyActionMode$lambda$1(QuoteTextSelectionCallback quoteTextSelectionCallback) {
        quoteTextSelectionCallback.onDismissed.invoke();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        boolean z;
        String obj;
        boolean z2;
        xmt0 xmt0Var;
        boolean z3 = true;
        if (item.getItemId() != 1) {
            return false;
        }
        int selectionStart = this.textView.getSelectionStart();
        if (selectionStart < 0) {
            selectionStart = 0;
        }
        int selectionEnd = this.textView.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        if (selectionStart >= selectionEnd) {
            return true;
        }
        if (selectionEnd - selectionStart > 1024) {
            this.onQuoteLimitExceeded.invoke();
            return true;
        }
        CharSequence text = this.textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            int min = Math.min(selectionEnd, spanned.length());
            if (selectionStart >= min) {
                obj = "";
                z = true;
            } else {
                String substring = spanned.toString().substring(selectionStart, min);
                Object[] spans = spanned.getSpans(selectionStart, min, CharacterStyle.class);
                ArrayList arrayList = new ArrayList();
                int length = spans.length;
                int i = 0;
                while (i < length) {
                    CharacterStyle characterStyle = (CharacterStyle) spans[i];
                    int max = Math.max(spanned.getSpanStart(characterStyle), selectionStart) - selectionStart;
                    int min2 = Math.min(spanned.getSpanEnd(characterStyle), min) - selectionStart;
                    if (max >= min2) {
                        z2 = z3;
                        xmt0Var = null;
                    } else if (characterStyle instanceof URLSpan) {
                        z2 = z3;
                        xmt0Var = new xmt0(max, min2, "[", oyr.p("](", ((URLSpan) characterStyle).getURL(), Extension.C_BRAKE));
                    } else {
                        z2 = z3;
                        String a = dmt0.a(characterStyle);
                        xmt0Var = a != null ? new xmt0(max, min2, a, a) : null;
                    }
                    if (xmt0Var != null) {
                        arrayList.add(xmt0Var);
                    }
                    i++;
                    z3 = z2;
                }
                z = z3;
                if (arrayList.isEmpty()) {
                    obj = substring;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Integer valueOf = Integer.valueOf(((xmt0) next).a);
                        Object obj2 = linkedHashMap.get(valueOf);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(valueOf, obj2);
                        }
                        ((List) obj2).add(next);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Integer valueOf2 = Integer.valueOf(((xmt0) next2).b);
                        Object obj3 = linkedHashMap2.get(valueOf2);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap2.put(valueOf2, obj3);
                        }
                        ((List) obj3).add(next2);
                    }
                    int length2 = substring.length();
                    Iterator it3 = arrayList.iterator();
                    int i2 = 0;
                    while (it3.hasNext()) {
                        xmt0 xmt0Var2 = (xmt0) it3.next();
                        i2 += xmt0Var2.d.length() + xmt0Var2.c.length();
                    }
                    StringBuilder sb = new StringBuilder(length2 + i2);
                    int length3 = substring.length();
                    if (length3 >= 0) {
                        int i3 = 0;
                        while (true) {
                            List list = (List) linkedHashMap2.get(Integer.valueOf(i3));
                            if (list != null) {
                                Iterator it4 = kotlin.collections.a.x0(list, new ymt0()).iterator();
                                while (it4.hasNext()) {
                                    sb.append(((xmt0) it4.next()).d);
                                }
                            }
                            List list2 = (List) linkedHashMap.get(Integer.valueOf(i3));
                            if (list2 != null) {
                                Iterator it5 = kotlin.collections.a.x0(list2, new zmt0()).iterator();
                                while (it5.hasNext()) {
                                    sb.append(((xmt0) it5.next()).c);
                                }
                            }
                            if (i3 < substring.length()) {
                                sb.append(substring.charAt(i3));
                            }
                            if (i3 == length3) {
                                break;
                            }
                            i3++;
                        }
                    }
                    obj = sb.toString();
                }
            }
        } else {
            z = true;
            obj = this.textView.getText().subSequence(selectionStart, selectionEnd).toString();
        }
        String obj4 = evu0.k0(obj).toString();
        if (obj4.length() <= 0) {
            return z;
        }
        this.onTextSelected.invoke(obj4);
        mode.finish();
        return z;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        menu.add(0, 1, 0, this.textView.getContext().getString(oyh0.menu_quote));
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode mode) {
        this.textView.post(new oxe0(16, this));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        int spanStart;
        CharSequence text = this.textView.getText();
        Object obj = null;
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return false;
        }
        Object[] spans = spannable.getSpans(0, spannable.length(), ImageSpan.class);
        int length = spans.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj2 = spans[i];
            if (spannable.getSpanEnd((ImageSpan) obj2) == spannable.length()) {
                obj = obj2;
                break;
            }
            i++;
        }
        ImageSpan imageSpan = (ImageSpan) obj;
        if (imageSpan == null || this.textView.getSelectionEnd() <= (spanStart = spannable.getSpanStart(imageSpan))) {
            return false;
        }
        int selectionStart = this.textView.getSelectionStart();
        if (selectionStart > spanStart) {
            selectionStart = spanStart;
        }
        Selection.setSelection(spannable, selectionStart, spanStart);
        return true;
    }
}
