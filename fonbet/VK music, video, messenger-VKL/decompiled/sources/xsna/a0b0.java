package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.audiomsg.player.Speed;

/* compiled from: PlayerConfig.kt */
/* loaded from: classes.dex */
public final class a0b0 {
    public final Context a;
    public final bpn0 b = new bpn0(new oxv(this, 8));

    public a0b0(Context context) {
        this.a = context;
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.b.getValue();
    }

    public final Speed b() {
        Speed speed;
        Speed.a aVar = Speed.Companion;
        int i = a().getInt("speed", 1);
        aVar.getClass();
        Speed[] values = Speed.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                speed = null;
                break;
            }
            speed = values[i2];
            if (speed.h() == i) {
                break;
            }
            i2++;
        }
        if (speed != null) {
            return speed;
        }
        throw new IllegalArgumentException(lhg.a(i, "Unknown id: "));
    }
}
