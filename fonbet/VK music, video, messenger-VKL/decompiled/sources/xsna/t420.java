package xsna;

import com.vk.dto.messages.MsgTextFormatItem;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;

/* compiled from: MentionsHelper.kt */
/* loaded from: classes6.dex */
public final class t420 {
    public static final bpn0 a = new bpn0(new hy2(18));

    public static List a(CharSequence charSequence, List list) {
        if (list.isEmpty()) {
            return EmptyList.b;
        }
        Matcher matcher = ((Pattern) a.getValue()).matcher(charSequence);
        while (matcher.find()) {
            int start = matcher.start();
            int length = matcher.group().length() - 1;
            if (length != 0) {
                ArrayList arrayList = new ArrayList();
                for (MsgTextFormatItem msgTextFormatItem : list) {
                    int i = msgTextFormatItem.b;
                    if (start < i) {
                        int i2 = i + length;
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        msgTextFormatItem = MsgTextFormatItem.zb(msgTextFormatItem, i2, 0, null, 14);
                    } else if (start >= i) {
                        int i3 = msgTextFormatItem.c;
                        if (start < i + i3) {
                            int i4 = i3 + length;
                            Integer valueOf = Integer.valueOf(i4);
                            if (i4 <= 0) {
                                valueOf = null;
                            }
                            msgTextFormatItem = valueOf != null ? MsgTextFormatItem.zb(msgTextFormatItem, 0, valueOf.intValue(), null, 13) : null;
                        }
                    }
                    if (msgTextFormatItem != null) {
                        arrayList.add(msgTextFormatItem);
                    }
                }
                list = arrayList;
            }
        }
        return list;
    }
}
