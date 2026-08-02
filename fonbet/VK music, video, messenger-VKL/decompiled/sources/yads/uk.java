package yads;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.X3;
import java.nio.charset.Charset;
import java.util.Arrays;
import xsna.emb;

/* loaded from: classes10.dex */
public final class uk {
    public static final uk c = new uk(8, new int[]{2});
    public static final uk d = new uk(8, new int[]{2, 5, 6});
    public static final yn2 e;
    public final int[] a;
    public final int b;

    static {
        t51 a = new t51(4).a(5, 6).a(17, 6).a(7, 6).a(18, 6).a(6, 8).a(8, 8).a(14, 8);
        e = yn2.a(a.b, a.a);
    }

    public uk(int i, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public static uk a(Context context) {
        Intent a = xsna.fp.a("android.media.action.HDMI_AUDIO_PLUG", context, null);
        int i = mc3.a;
        if (i >= 17) {
            byte[] decode = Base64.decode("QW1hem9u", 0);
            Charset charset = emb.b;
            String str = new String(decode, charset);
            String str2 = mc3.c;
            if ((str.equals(str2) || new String(Base64.decode("WGlhb21p", 0), charset).equals(str2)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        if (i >= 29 && (mc3.d(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return new uk(8, tk.a());
        }
        if (a == null || a.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return c;
        }
        return new uk(a.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), a.getIntArrayExtra("android.media.extra.ENCODINGS"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk)) {
            return false;
        }
        uk ukVar = (uk) obj;
        return Arrays.equals(this.a, ukVar.a) && this.b == ukVar.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + X3.j.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r7 != 5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(nx0 nx0Var) {
        int a;
        String str = nx0Var.m;
        str.getClass();
        int b = iu1.b(str, nx0Var.j);
        yn2 yn2Var = e;
        if (!yn2Var.containsKey(Integer.valueOf(b))) {
            return null;
        }
        int i = 6;
        if (b == 18 && Arrays.binarySearch(this.a, 18) < 0) {
            b = 6;
        } else if (b == 8 && Arrays.binarySearch(this.a, 8) < 0) {
            b = 7;
        }
        if (Arrays.binarySearch(this.a, b) < 0) {
            return null;
        }
        int i2 = nx0Var.z;
        if (i2 != -1 && b != 18) {
            if (i2 > this.b) {
                return null;
            }
        } else {
            int i3 = nx0Var.A;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (mc3.a >= 29) {
                i2 = tk.a(b, i3);
            } else {
                Object obj = yn2Var.get(Integer.valueOf(b));
                i2 = ((Integer) (obj != null ? obj : 0)).intValue();
            }
        }
        int i4 = mc3.a;
        if (i4 <= 28) {
            if (i2 == 7) {
                i = 8;
            } else if (i2 != 3) {
                if (i2 != 4) {
                }
            }
            if (i4 <= 26 && ql2.d.a().equals(mc3.b) && i == 1) {
                i = 2;
            }
            a = mc3.a(i);
            if (a != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(b), Integer.valueOf(a));
        }
        i = i2;
        if (i4 <= 26) {
            i = 2;
        }
        a = mc3.a(i);
        if (a != 0) {
        }
    }
}
