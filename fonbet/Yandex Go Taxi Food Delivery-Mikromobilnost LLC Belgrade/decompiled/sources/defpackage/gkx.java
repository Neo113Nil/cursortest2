package defpackage;

import android.view.KeyCharacterMap;

/* loaded from: classes4.dex */
public class gkx {
    public int a = 0;

    public final Character a(int i) {
        char c = (char) i;
        int i2 = Integer.MIN_VALUE & i;
        int i3 = this.a;
        if (i2 != 0) {
            int i4 = i & Integer.MAX_VALUE;
            if (i3 != 0) {
                this.a = KeyCharacterMap.getDeadChar(i3, i4);
            } else {
                this.a = i4;
            }
        } else if (i3 != 0) {
            int deadChar = KeyCharacterMap.getDeadChar(i3, i);
            if (deadChar > 0) {
                c = (char) deadChar;
            }
            this.a = 0;
        }
        return Character.valueOf(c);
    }
}
