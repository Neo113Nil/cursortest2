package xsna;

import java.lang.reflect.Field;

/* compiled from: MusicSticker.kt */
/* loaded from: classes6.dex */
public final class w750 {
    public static final bpn0 a = new bpn0(new yv2(24));
    public static final bpn0 b = new bpn0(new bv0(25));

    public static int a(int i, String str, Object obj) {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        int l = n8g.l(-16777216, i);
        declaredField.setInt(obj, l);
        return l;
    }
}
