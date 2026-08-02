package defpackage;

import com.yandex.div.internal.widget.DivViewGroup;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class hpl {
    public float a = 0.0f;
    public float b = 0.0f;
    public int c = 0;

    public final void a(float f, int i, int i2) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0;
        switch (i) {
            case 1:
            case 16:
                this.a = f / 2.0f;
                break;
            case 3:
            case 48:
                break;
            case 5:
            case 80:
                this.a = f;
                break;
            case 16777216:
            case SelfTester_JCP.IMITA /* 268435456 */:
                DivViewGroup.Companion.getClass();
                float f2 = f / (i2 * 2);
                this.a = f2;
                this.b = f2 * 2.0f;
                this.c = (int) (f2 / 2.0f);
                break;
            case SelfTester_JCP.DECRYPT_CFB /* 33554432 */:
            case 536870912:
                DivViewGroup.Companion.getClass();
                this.b = i2 != 1 ? f / (i2 - 1) : 0.0f;
                break;
            case SelfTester_JCP.DECRYPT_CBC /* 67108864 */:
            case 1073741824:
                DivViewGroup.Companion.getClass();
                float f3 = f / (i2 + 1);
                this.a = f3;
                this.b = f3;
                this.c = (int) (f3 / 2.0f);
                break;
            default:
                ny61.r(oyr.i(i, "Invalid gravity is set: "));
                break;
        }
    }
}
