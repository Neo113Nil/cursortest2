package defpackage;

import android.text.TextPaint;
import androidx.emoji2.emojipicker.EmojiPickerView;
import androidx.emoji2.text.b;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class cy11 {
    public static final TextPaint a = new TextPaint();
    public static final List b = scc.g("⚕️", "♀️", "♂️", "♟️", "♾️");

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (r3.l() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (((defpackage.m920) r3.y).b.b() > 2147483647) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String str) {
        boolean z;
        EmojiPickerView.Companion.getClass();
        z = EmojiPickerView.emojiCompatLoaded;
        if (z) {
            ftn a2 = ftn.a();
            d6z.y("Not initialized yet", a2.f());
            b bVar = (b) a2.d.a;
            lun lunVar = new lun((m920) bVar.b.w, bVar.d, bVar.e);
            int length = str.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int codePointAt = Character.codePointAt(str, i);
                int a3 = lunVar.a(codePointAt);
                jp11 jp11Var = ((m920) lunVar.y).b;
                if (a3 == 1) {
                    i += Character.charCount(codePointAt);
                    i3 = 0;
                } else if (a3 == 2) {
                    i += Character.charCount(codePointAt);
                } else if (a3 == 3) {
                    jp11Var = ((m920) lunVar.z).b;
                    if (jp11Var.b() <= 2147483647) {
                        i2++;
                    }
                }
                if (jp11Var != null && jp11Var.b() <= 2147483647) {
                    i3++;
                }
            }
            if (i2 == 0) {
                if (lunVar.a == 2) {
                    if (((m920) lunVar.y).b != null) {
                        if (lunVar.c <= 1) {
                        }
                    }
                }
            }
        }
        TextPaint textPaint = a;
        int i4 = la90.a;
        String str2 = null;
        String str3 = textPaint.hasGlyph(str) ? str : null;
        if (str3 != null) {
            str2 = str3;
        } else if (b.contains(str)) {
            String v = cvu0.v(str, "️", "", false);
            if (textPaint.hasGlyph(v)) {
                str2 = v;
            }
        }
        return str2 != null;
    }
}
