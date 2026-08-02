package xsna;

import android.text.Editable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.messages.MsgTextFormatItem;
import com.vk.textformat.format_span.FormatLinkSpan;
import com.vk.textformat.format_span.FormatStyleSpan;
import com.vk.textformat.format_span.FormatUnderlineSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;

/* compiled from: TextFormatExtractor.kt */
/* loaded from: classes6.dex */
public final class xho0 {
    public static MsgTextFormat a(Editable editable) {
        ArrayList<FormatStyleSpan> arrayList;
        ArrayList<Object> arrayList2;
        ArrayList<FormatLinkSpan> arrayList3;
        List list;
        if (editable == null) {
            return MsgTextFormat.d;
        }
        ArrayList<MsgTextFormatItem> arrayList4 = new ArrayList();
        pvu0[] pvu0VarArr = (pvu0[]) editable.getSpans(0, editable.length(), FormatStyleSpan.class);
        if (pvu0VarArr != null) {
            arrayList = new ArrayList();
            for (pvu0 pvu0Var : pvu0VarArr) {
                int spanStart = editable.getSpanStart(pvu0Var);
                int spanEnd = editable.getSpanEnd(pvu0Var);
                if (spanStart != -1 && spanEnd != -1 && spanEnd - spanStart > 0) {
                    arrayList.add(pvu0Var);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (FormatStyleSpan formatStyleSpan : arrayList) {
                int spanStart2 = editable.getSpanStart(formatStyleSpan);
                int spanEnd2 = editable.getSpanEnd(formatStyleSpan);
                int style = formatStyleSpan.getStyle();
                if (style == 1) {
                    arrayList4.add(new MsgTextFormatItem(spanStart2, spanEnd2 - spanStart2, TtmlNode.BOLD, null, 8, null));
                } else if (style == 2) {
                    arrayList4.add(new MsgTextFormatItem(spanStart2, spanEnd2 - spanStart2, TtmlNode.ITALIC, null, 8, null));
                }
            }
        }
        pvu0[] pvu0VarArr2 = (pvu0[]) editable.getSpans(0, editable.length(), FormatUnderlineSpan.class);
        if (pvu0VarArr2 != null) {
            arrayList2 = new ArrayList();
            for (pvu0 pvu0Var2 : pvu0VarArr2) {
                int spanStart3 = editable.getSpanStart(pvu0Var2);
                int spanEnd3 = editable.getSpanEnd(pvu0Var2);
                if (spanStart3 != -1 && spanEnd3 != -1 && spanEnd3 - spanStart3 > 0) {
                    arrayList2.add(pvu0Var2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            for (Object obj : arrayList2) {
                int spanStart4 = editable.getSpanStart(obj);
                arrayList4.add(new MsgTextFormatItem(spanStart4, editable.getSpanEnd(obj) - spanStart4, TtmlNode.UNDERLINE, null, 8, null));
            }
        }
        pvu0[] pvu0VarArr3 = (pvu0[]) editable.getSpans(0, editable.length(), FormatLinkSpan.class);
        if (pvu0VarArr3 != null) {
            arrayList3 = new ArrayList();
            for (pvu0 pvu0Var3 : pvu0VarArr3) {
                int spanStart5 = editable.getSpanStart(pvu0Var3);
                int spanEnd4 = editable.getSpanEnd(pvu0Var3);
                if (spanStart5 != -1 && spanEnd4 != -1 && spanEnd4 - spanStart5 > 0) {
                    arrayList3.add(pvu0Var3);
                }
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            for (FormatLinkSpan formatLinkSpan : arrayList3) {
                int spanStart6 = editable.getSpanStart(formatLinkSpan);
                arrayList4.add(new MsgTextFormatItem(spanStart6, editable.getSpanEnd(formatLinkSpan) - spanStart6, "url", formatLinkSpan.getURL()));
            }
        }
        bpn0 bpn0Var = t420.a;
        if (arrayList4.isEmpty()) {
            list = EmptyList.b;
        } else {
            Matcher matcher = ((Pattern) t420.a.getValue()).matcher(editable);
            int i = 0;
            while (matcher.find()) {
                int start = matcher.start() - i;
                int length = matcher.group().length() - 1;
                i += length;
                int i2 = -length;
                if (i2 != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (MsgTextFormatItem msgTextFormatItem : arrayList4) {
                        int i3 = msgTextFormatItem.b;
                        int i4 = msgTextFormatItem.c;
                        if (start < i3) {
                            int i5 = i3 + i2;
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            msgTextFormatItem = MsgTextFormatItem.zb(msgTextFormatItem, i5, 0, null, 14);
                        } else if (start >= i3 && start < i3 + i4) {
                            int i6 = i4 + i2;
                            Integer valueOf = Integer.valueOf(i6);
                            if (i6 <= 0) {
                                valueOf = null;
                            }
                            msgTextFormatItem = valueOf != null ? MsgTextFormatItem.zb(msgTextFormatItem, 0, valueOf.intValue(), null, 13) : null;
                        }
                        if (msgTextFormatItem != null) {
                            arrayList5.add(msgTextFormatItem);
                        }
                    }
                    arrayList4 = arrayList5;
                }
            }
            list = arrayList4;
        }
        return new MsgTextFormat(1, (List<MsgTextFormatItem>) list);
    }
}
