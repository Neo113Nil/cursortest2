package xsna;

import com.vk.music.view.vkmix.models.MusicMixMood;
import java.util.List;

/* compiled from: MusicMixStateConfig.kt */
/* loaded from: classes3.dex */
public final class fo40 {
    public static final List<fo40> f;
    public final MusicMixMood a;
    public final String b;
    public final bo40 c;
    public final ao40 d;
    public final do40 e;

    static {
        fo40 fo40Var = new fo40(MusicMixMood.Idle, "Idle", bo40.d, ao40.c, do40.c);
        MusicMixMood musicMixMood = MusicMixMood.Play;
        bo40 bo40Var = bo40.e;
        ao40 ao40Var = ao40.d;
        do40 do40Var = do40.d;
        f = e43.l(fo40Var, new fo40(musicMixMood, "Play", bo40Var, ao40Var, do40Var), new fo40(MusicMixMood.MyMix, "MyMix", bo40.l, ao40Var, do40Var), new fo40(MusicMixMood.Love, "Love", bo40.f, ao40Var, do40.e), new fo40(MusicMixMood.Active, "Active", bo40.g, ao40Var, do40.f), new fo40(MusicMixMood.Joy, "Joy", bo40.h, ao40Var, do40.g), new fo40(MusicMixMood.Sad, "Sad", bo40.i, ao40Var, do40.h), new fo40(MusicMixMood.Calm, "Calm", bo40.j, ao40Var, do40.i), new fo40(MusicMixMood.NewYear, "NewYear", bo40.k, ao40Var, do40.j), new fo40(MusicMixMood.Novelty, "Novelty", bo40.m, ao40Var, do40Var), new fo40(MusicMixMood.Unfamiliar, "Unfamiliar", bo40.n, ao40Var, do40Var), new fo40(MusicMixMood.Familiar, "Familiar", bo40.o, ao40Var, do40Var));
    }

    public fo40(MusicMixMood musicMixMood, String str, bo40 bo40Var, ao40 ao40Var, do40 do40Var) {
        this.a = musicMixMood;
        this.b = str;
        this.c = bo40Var;
        this.d = ao40Var;
        this.e = do40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo40)) {
            return false;
        }
        fo40 fo40Var = (fo40) obj;
        return this.a == fo40Var.a && epx.f(this.b, fo40Var.b) && epx.f(this.c, fo40Var.c) && epx.f(this.d, fo40Var.d) && epx.f(this.e, fo40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "MusicMixStateConfig(mood=" + this.a + ", title=" + this.b + ", palette=" + this.c + ", circle=" + this.d + ", shape=" + this.e + ')';
    }
}
