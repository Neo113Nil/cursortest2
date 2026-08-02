package xsna;

import android.content.Context;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.messages.MsgTextFormatItem;
import com.vk.textformat.format_span.FormatLinkSpan;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import xsna.w9z;

/* compiled from: FormattingActionModeCallback.kt */
/* loaded from: classes6.dex */
public final class e9s extends ActionMode.Callback2 {
    public final tp1 a;
    public EditText b;
    public ActionMode.Callback c;

    public e9s(tp1 tp1Var) {
        this.a = tp1Var;
    }

    public static boolean b(EditText editText) {
        Editable text;
        if (editText != null && (text = editText.getText()) != null) {
            for (Object obj : text.getSpans(editText.getSelectionStart(), editText.getSelectionEnd(), pvu0.class)) {
                if (!(((pvu0) obj) instanceof ovu0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(EditText editText) {
        this.b = editText;
        this.c = editText.getCustomSelectionActionModeCallback();
        editText.setCustomSelectionActionModeCallback(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0184, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0184 A[EDGE_INSN: B:206:0x0184->B:41:0x0184 BREAK  A[LOOP:0: B:28:0x00f5->B:39:0x00f5], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24, types: [xsna.d9s] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Editable text;
        String obj;
        Collection collection;
        List<MsgTextFormatItem> u0;
        Object obj2;
        int i;
        MsgTextFormatItem zb;
        String obj3;
        int itemId = menuItem.getItemId();
        String str = itemId == R.id.menu_action_format_bold ? TtmlNode.BOLD : itemId == R.id.menu_action_format_italics ? TtmlNode.ITALIC : itemId == R.id.menu_action_format_underline ? TtmlNode.UNDERLINE : itemId == R.id.menu_action_format_link ? "url" : itemId == R.id.menu_action_format_clear ? "clear" : null;
        final EditText editText = this.b;
        if (str == null || editText == null) {
            ActionMode.Callback callback = this.c;
            if (callback != null) {
                return callback.onActionItemClicked(actionMode, menuItem);
            }
            return false;
        }
        Editable text2 = editText.getText();
        if (text2 == null || drm0.N(text2) || !editText.hasSelection()) {
            return false;
        }
        final int selectionStart = editText.getSelectionStart();
        final int selectionEnd = editText.getSelectionEnd() - editText.getSelectionStart();
        int i2 = 1;
        if (str.equals("url")) {
            Editable text3 = editText.getText();
            String substring = (text3 == null || (obj3 = text3.toString()) == null) ? "" : obj3.substring(Math.min(editText.getSelectionStart(), editText.getSelectionEnd()), Math.max(editText.getSelectionStart(), editText.getSelectionEnd()));
            Context context = editText.getContext();
            FormatLinkSpan formatLinkSpan = (FormatLinkSpan) rl3.O(editText.getText().getSpans(editText.getSelectionStart(), editText.getSelectionEnd(), FormatLinkSpan.class));
            new w9z.a(context, substring, formatLinkSpan != null ? formatLinkSpan.getURL() : null, new izs() { // from class: xsna.d9s
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x00c8 A[EDGE_INSN: B:11:0x00c8->B:12:0x00c8 BREAK  A[LOOP:0: B:2:0x0041->B:162:0x0092], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:161:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:178:0x00c8 A[EDGE_INSN: B:178:0x00c8->B:12:0x00c8 BREAK  A[LOOP:0: B:2:0x0041->B:162:0x0092], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:179:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList, java.util.Collection] */
                /* JADX WARN: Type inference failed for: r1v16 */
                /* JADX WARN: Type inference failed for: r1v18, types: [java.util.List] */
                @Override // xsna.izs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj4) {
                    Editable text4;
                    String obj5;
                    Collection collection2;
                    List<MsgTextFormatItem> u02;
                    Object obj6;
                    int i3;
                    MsgTextFormatItem zb2;
                    MsgTextFormatItem zb3;
                    yho0 yho0Var = (yho0) ((q040) e9s.this.a.c).a.getValue();
                    yho0Var.getClass();
                    EditText editText2 = editText;
                    List<MsgTextFormatItem> list = xho0.a(editText2.getEditableText()).c;
                    Editable text5 = editText2.getText();
                    MsgTextFormatItem msgTextFormatItem = new MsgTextFormatItem(selectionStart, selectionEnd, "url", (String) obj4);
                    Matcher matcher = ((Pattern) t420.a.getValue()).matcher(text5);
                    int i4 = 0;
                    while (true) {
                        int i5 = msgTextFormatItem.b;
                        int i6 = msgTextFormatItem.c;
                        if (!matcher.find()) {
                            break;
                        }
                        int start = matcher.start() - i4;
                        int length = matcher.group().length() - 1;
                        int end = matcher.end() - i4;
                        int i7 = start + 1;
                        k9x q = swe0.q(i7, end);
                        int i8 = q.b;
                        int i9 = q.c;
                        if ((i8 > i5 || i5 > i9) && (i8 > (i3 = i5 + i6) || i3 > i9)) {
                            i4 += length;
                            int i10 = -length;
                            if (start >= i5) {
                                if (start >= i5 && start < i3) {
                                    int i11 = i6 + i10;
                                    Integer valueOf = Integer.valueOf(i11);
                                    if (i11 <= 0) {
                                        valueOf = null;
                                    }
                                    if (valueOf != null) {
                                        zb2 = MsgTextFormatItem.zb(msgTextFormatItem, 0, valueOf.intValue(), null, 13);
                                    } else {
                                        msgTextFormatItem = null;
                                    }
                                }
                                if (msgTextFormatItem != null) {
                                    break;
                                }
                            } else {
                                int i12 = i5 + i10;
                                if (i12 < 0) {
                                    i12 = 0;
                                }
                                zb2 = MsgTextFormatItem.zb(msgTextFormatItem, i12, 0, null, 14);
                            }
                            msgTextFormatItem = zb2;
                            if (msgTextFormatItem != null) {
                            }
                        } else {
                            if (i5 < start) {
                                zb3 = MsgTextFormatItem.zb(msgTextFormatItem, 0, start - i5, null, 13);
                            } else {
                                int i13 = i5 + i6;
                                if (i13 <= end) {
                                    msgTextFormatItem = null;
                                    if (msgTextFormatItem != null) {
                                        break;
                                    }
                                } else {
                                    zb3 = MsgTextFormatItem.zb(msgTextFormatItem, i7, i13 - end, null, 12);
                                }
                            }
                            msgTextFormatItem = zb3;
                            if (msgTextFormatItem != null) {
                            }
                        }
                    }
                    msgTextFormatItem = null;
                    if (msgTextFormatItem != null) {
                        String str2 = msgTextFormatItem.e;
                        int i14 = msgTextFormatItem.b;
                        int i15 = msgTextFormatItem.c;
                        String str3 = msgTextFormatItem.d;
                        if (epx.f(str3, "clear")) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj7 : list) {
                                MsgTextFormatItem msgTextFormatItem2 = (MsgTextFormatItem) obj7;
                                if (!epx.f(msgTextFormatItem2.d, "url")) {
                                    int i16 = msgTextFormatItem2.b;
                                    if (msgTextFormatItem2.c + i16 >= i14 && i16 <= i14 + i15) {
                                        arrayList.add(obj7);
                                    }
                                }
                            }
                            u02 = rdi.g(list);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                MsgTextFormatItem msgTextFormatItem3 = (MsgTextFormatItem) it.next();
                                u02.remove(msgTextFormatItem3);
                                int i17 = msgTextFormatItem3.b;
                                int i18 = msgTextFormatItem3.c;
                                if (i17 < i14) {
                                    int i19 = msgTextFormatItem3.b;
                                    u02.add(new MsgTextFormatItem(i19, i14 - i19, msgTextFormatItem3.d, null, 8, null));
                                }
                                int i20 = i17 + i18;
                                int i21 = i14 + i15;
                                if (i20 > i21) {
                                    u02.add(new MsgTextFormatItem(i21, i20 - i21, msgTextFormatItem3.d, null, 8, null));
                                }
                            }
                        } else {
                            List<MsgTextFormatItem> list2 = list;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj8 : list2) {
                                if (epx.f(((MsgTextFormatItem) obj8).d, str3)) {
                                    arrayList2.add(obj8);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                u02 = j5g.v0(msgTextFormatItem, list);
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj9 : list2) {
                                    if (!epx.f(((MsgTextFormatItem) obj9).d, str3)) {
                                        arrayList3.add(obj9);
                                    }
                                }
                                if (epx.f(str3, "url")) {
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        MsgTextFormatItem msgTextFormatItem4 = (MsgTextFormatItem) next;
                                        if (Math.max(i14, msgTextFormatItem4.b) < Math.min(i14 + i15, msgTextFormatItem4.b + msgTextFormatItem4.c)) {
                                            arrayList4.add(next);
                                        }
                                    }
                                    ?? arrayList5 = new ArrayList();
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        Object next2 = it3.next();
                                        if (!arrayList4.contains((MsgTextFormatItem) next2)) {
                                            arrayList5.add(next2);
                                        }
                                    }
                                    if (str2 != null) {
                                        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                                        Iterator it4 = arrayList4.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(MsgTextFormatItem.zb((MsgTextFormatItem) it4.next(), 0, 0, str2, 7));
                                        }
                                        arrayList5 = w65.n(j5g.v0(msgTextFormatItem, j5g.u0(arrayList6, arrayList5)));
                                    }
                                    u02 = j5g.u0((Iterable) arrayList5, arrayList3);
                                } else {
                                    if (!arrayList2.isEmpty()) {
                                        Iterator it5 = arrayList2.iterator();
                                        while (it5.hasNext()) {
                                            MsgTextFormatItem msgTextFormatItem5 = (MsgTextFormatItem) it5.next();
                                            int i22 = msgTextFormatItem5.b;
                                            if (i22 <= i14) {
                                                int i23 = i22 + msgTextFormatItem5.c;
                                                int i24 = i14 + i15;
                                                if (i23 >= i24) {
                                                    Iterator it6 = arrayList2.iterator();
                                                    while (true) {
                                                        if (!it6.hasNext()) {
                                                            obj6 = null;
                                                            break;
                                                        }
                                                        obj6 = it6.next();
                                                        MsgTextFormatItem msgTextFormatItem6 = (MsgTextFormatItem) obj6;
                                                        int i25 = msgTextFormatItem6.b;
                                                        if (i25 <= i14 && i25 + msgTextFormatItem6.c >= i24) {
                                                            break;
                                                        }
                                                    }
                                                    MsgTextFormatItem msgTextFormatItem7 = (MsgTextFormatItem) obj6;
                                                    collection2 = arrayList2;
                                                    if (msgTextFormatItem7 != null) {
                                                        int i26 = msgTextFormatItem7.c;
                                                        int i27 = msgTextFormatItem7.b;
                                                        ArrayList arrayList7 = new ArrayList(arrayList2);
                                                        arrayList7.remove(msgTextFormatItem7);
                                                        if (i27 < i14) {
                                                            int i28 = msgTextFormatItem7.b;
                                                            arrayList7.add(new MsgTextFormatItem(i28, i14 - i28, msgTextFormatItem7.d, null, 8, null));
                                                        }
                                                        int i29 = i27 + i26;
                                                        if (i29 > i24) {
                                                            arrayList7.add(new MsgTextFormatItem(i24, i29 - i24, msgTextFormatItem7.d, null, 8, null));
                                                        }
                                                        collection2 = w65.n(arrayList7);
                                                    }
                                                    u02 = j5g.u0(collection2, arrayList3);
                                                }
                                            }
                                        }
                                    }
                                    collection2 = w65.n(j5g.v0(msgTextFormatItem, arrayList2));
                                    u02 = j5g.u0(collection2, arrayList3);
                                }
                            }
                        }
                        list = u02;
                    }
                    MsgTextFormat msgTextFormat = new MsgTextFormat(0, list, 1, null);
                    Editable text6 = editText2.getText();
                    if (text6 != null && text6.length() != 0 && (text4 = editText2.getText()) != null && (obj5 = text4.toString()) != null) {
                        CharSequence a = yho0Var.a.a(obj5, msgTextFormat);
                        int selectionEnd2 = editText2.getSelectionEnd();
                        editText2.setText(a);
                        if (selectionEnd2 != -1) {
                            editText2.setSelection(Math.min(selectionEnd2, a.length()));
                        }
                    }
                    return s3q0.a;
                }
            }).I0("LinkModalBottomSheet");
            return true;
        }
        yho0 yho0Var = (yho0) ((q040) this.a.c).a.getValue();
        yho0Var.getClass();
        List<MsgTextFormatItem> list = xho0.a(editText.getEditableText()).c;
        Editable text4 = editText.getText();
        MsgTextFormatItem msgTextFormatItem = new MsgTextFormatItem(selectionStart, selectionEnd, str, null);
        Matcher matcher = ((Pattern) t420.a.getValue()).matcher(text4);
        int i3 = 0;
        while (true) {
            int i4 = msgTextFormatItem.b;
            int i5 = msgTextFormatItem.c;
            if (!matcher.find()) {
                break;
            }
            int start = matcher.start() - i3;
            int length = matcher.group().length() - i2;
            int end = matcher.end() - i3;
            int i6 = start + 1;
            k9x q = swe0.q(i6, end);
            Matcher matcher2 = matcher;
            int i7 = q.b;
            int i8 = q.c;
            int i9 = i3;
            if ((i7 > i4 || i4 > i8) && (i7 > (i = i4 + i5) || i > i8)) {
                int i10 = i9 + length;
                int i11 = -length;
                if (start < i4) {
                    int i12 = i11 + i4;
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    zb = MsgTextFormatItem.zb(msgTextFormatItem, i12, 0, null, 14);
                } else {
                    if (start >= i4 && start < i) {
                        int i13 = i5 + i11;
                        Integer valueOf = Integer.valueOf(i13);
                        if (i13 <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            zb = MsgTextFormatItem.zb(msgTextFormatItem, 0, valueOf.intValue(), null, 13);
                        } else {
                            msgTextFormatItem = null;
                        }
                    }
                    if (msgTextFormatItem != null) {
                        break;
                    }
                    i3 = i10;
                    i2 = 1;
                    matcher = matcher2;
                }
                msgTextFormatItem = zb;
                if (msgTextFormatItem != null) {
                }
            } else {
                if (i4 < start) {
                    msgTextFormatItem = MsgTextFormatItem.zb(msgTextFormatItem, 0, start - i4, null, 13);
                } else {
                    int i14 = i4 + i5;
                    msgTextFormatItem = i14 <= end ? null : MsgTextFormatItem.zb(msgTextFormatItem, i6, i14 - end, null, 12);
                }
                if (msgTextFormatItem == null) {
                    break;
                }
                matcher = matcher2;
                i3 = i9;
                i2 = 1;
            }
        }
        if (msgTextFormatItem != null) {
            String str2 = msgTextFormatItem.e;
            int i15 = msgTextFormatItem.b;
            int i16 = msgTextFormatItem.c;
            String str3 = msgTextFormatItem.d;
            if (epx.f(str3, "clear")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    MsgTextFormatItem msgTextFormatItem2 = (MsgTextFormatItem) obj4;
                    if (!epx.f(msgTextFormatItem2.d, "url")) {
                        int i17 = msgTextFormatItem2.b;
                        if (msgTextFormatItem2.c + i17 >= i15 && i17 <= i15 + i16) {
                            arrayList.add(obj4);
                        }
                    }
                }
                u0 = rdi.g(list);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MsgTextFormatItem msgTextFormatItem3 = (MsgTextFormatItem) it.next();
                    u0.remove(msgTextFormatItem3);
                    int i18 = msgTextFormatItem3.b;
                    int i19 = msgTextFormatItem3.c;
                    if (i18 < i15) {
                        int i20 = msgTextFormatItem3.b;
                        u0.add(new MsgTextFormatItem(i20, i15 - i20, msgTextFormatItem3.d, null, 8, null));
                    }
                    int i21 = i18 + i19;
                    int i22 = i15 + i16;
                    if (i21 > i22) {
                        u0.add(new MsgTextFormatItem(i22, i21 - i22, msgTextFormatItem3.d, null, 8, null));
                    }
                }
            } else {
                List<MsgTextFormatItem> list2 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    if (epx.f(((MsgTextFormatItem) obj5).d, str3)) {
                        arrayList2.add(obj5);
                    }
                }
                if (arrayList2.isEmpty()) {
                    u0 = j5g.v0(msgTextFormatItem, list);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : list2) {
                        if (!epx.f(((MsgTextFormatItem) obj6).d, str3)) {
                            arrayList3.add(obj6);
                        }
                    }
                    if (epx.f(str3, "url")) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            MsgTextFormatItem msgTextFormatItem4 = (MsgTextFormatItem) next;
                            if (Math.max(i15, msgTextFormatItem4.b) < Math.min(i15 + i16, msgTextFormatItem4.b + msgTextFormatItem4.c)) {
                                arrayList4.add(next);
                            }
                        }
                        ?? arrayList5 = new ArrayList();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (!arrayList4.contains((MsgTextFormatItem) next2)) {
                                arrayList5.add(next2);
                            }
                        }
                        if (str2 != null) {
                            ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(MsgTextFormatItem.zb((MsgTextFormatItem) it4.next(), 0, 0, str2, 7));
                            }
                            arrayList5 = w65.n(j5g.v0(msgTextFormatItem, j5g.u0(arrayList6, arrayList5)));
                        }
                        u0 = j5g.u0((Iterable) arrayList5, arrayList3);
                    } else {
                        if (!arrayList2.isEmpty()) {
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                MsgTextFormatItem msgTextFormatItem5 = (MsgTextFormatItem) it5.next();
                                int i23 = msgTextFormatItem5.b;
                                if (i23 <= i15) {
                                    int i24 = i23 + msgTextFormatItem5.c;
                                    int i25 = i15 + i16;
                                    if (i24 >= i25) {
                                        Iterator it6 = arrayList2.iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = it6.next();
                                            MsgTextFormatItem msgTextFormatItem6 = (MsgTextFormatItem) obj2;
                                            int i26 = msgTextFormatItem6.b;
                                            if (i26 <= i15 && i26 + msgTextFormatItem6.c >= i25) {
                                                break;
                                            }
                                        }
                                        MsgTextFormatItem msgTextFormatItem7 = (MsgTextFormatItem) obj2;
                                        collection = arrayList2;
                                        if (msgTextFormatItem7 != null) {
                                            int i27 = msgTextFormatItem7.c;
                                            int i28 = msgTextFormatItem7.b;
                                            ArrayList arrayList7 = new ArrayList(arrayList2);
                                            arrayList7.remove(msgTextFormatItem7);
                                            if (i28 < i15) {
                                                int i29 = msgTextFormatItem7.b;
                                                arrayList7.add(new MsgTextFormatItem(i29, i15 - i29, msgTextFormatItem7.d, null, 8, null));
                                            }
                                            int i30 = i28 + i27;
                                            if (i30 > i25) {
                                                arrayList7.add(new MsgTextFormatItem(i25, i30 - i25, msgTextFormatItem7.d, null, 8, null));
                                            }
                                            collection = w65.n(arrayList7);
                                        }
                                        u0 = j5g.u0(collection, arrayList3);
                                    }
                                }
                            }
                        }
                        collection = w65.n(j5g.v0(msgTextFormatItem, arrayList2));
                        u0 = j5g.u0(collection, arrayList3);
                    }
                }
            }
            list = u0;
        }
        MsgTextFormat msgTextFormat = new MsgTextFormat(0, list, 1, null);
        Editable text5 = editText.getText();
        if (text5 != null && text5.length() != 0 && (text = editText.getText()) != null && (obj = text.toString()) != null) {
            CharSequence a = yho0Var.a.a(obj, msgTextFormat);
            int selectionEnd2 = editText.getSelectionEnd();
            editText.setText(a);
            if (selectionEnd2 != -1) {
                editText.setSelection(Math.min(selectionEnd2, a.length()));
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ActionMode.Callback callback = this.c;
        if (callback != null) {
            callback.onCreateActionMode(actionMode, menu);
        }
        EditText editText = this.b;
        if (editText == null || (context = editText.getContext()) == null) {
            return false;
        }
        for (Pair pair : e43.l(new Pair(Integer.valueOf(R.id.menu_action_format_bold), Integer.valueOf(R.string.vkim_write_bar_msg_menu_bold)), new Pair(Integer.valueOf(R.id.menu_action_format_italics), Integer.valueOf(R.string.vkim_write_bar_msg_menu_italics)), new Pair(Integer.valueOf(R.id.menu_action_format_underline), Integer.valueOf(R.string.vkim_write_bar_msg_menu_underline)), new Pair(Integer.valueOf(R.id.menu_action_format_link), Integer.valueOf(R.string.vkim_write_bar_msg_menu_link)))) {
            menu.add(0, ((Number) pair.d()).intValue(), 0, context.getString(((Number) pair.g()).intValue())).setShowAsAction(1);
        }
        if (b(this.b)) {
            menu.add(0, R.id.menu_action_format_clear, 0, context.getString(R.string.vkim_write_bar_msg_menu_clear)).setShowAsAction(1);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ActionMode.Callback callback = this.c;
        if (callback != null) {
            callback.onDestroyActionMode(actionMode);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ActionMode.Callback callback = this.c;
        if (callback != null) {
            callback.onPrepareActionMode(actionMode, menu);
        }
        EditText editText = this.b;
        if (editText != null && (context = editText.getContext()) != null && b(this.b)) {
            int i = 0;
            while (true) {
                if (!(i < menu.size())) {
                    menu.add(0, R.id.menu_action_format_clear, 0, context.getString(R.string.vkim_write_bar_msg_menu_clear)).setShowAsAction(1);
                    return true;
                }
                int i2 = i + 1;
                MenuItem item = menu.getItem(i);
                if (item == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (item.getItemId() == R.id.menu_action_format_clear) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }
}
