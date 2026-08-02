package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.audiomsg.player.Speed;
import com.vk.audiomsg.player.trackplayer.oggtrackplayer.PlayState;

/* compiled from: PlayerState.kt */
/* loaded from: classes.dex */
public final class i4b0 {
    public final a a;
    public final b b;

    /* compiled from: PlayerState.kt */
    public static final class a {
        public ur4 a;
        public boolean b;
        public PlayState c;
        public float d;
        public float e;
        public Speed f;
        public SpeakerType g;
        public boolean h;

        public a() {
            PlayState playState = PlayState.STOP;
            Speed speed = Speed.X1;
            SpeakerType speakerType = SpeakerType.OUTER;
            this.a = null;
            this.b = false;
            this.c = playState;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = 1.0f;
            this.f = speed;
            this.g = speakerType;
            this.h = false;
        }

        public final void a(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
        }
    }

    /* compiled from: PlayerState.kt */
    public static final class b {
        public PlayState a;
        public Float b;
        public Float c;
        public Speed d;
        public SpeakerType e;
    }

    public i4b0() {
        a aVar = new a();
        b bVar = new b();
        bVar.a = null;
        bVar.b = null;
        bVar.c = null;
        bVar.d = null;
        bVar.e = null;
        this.a = aVar;
        this.b = bVar;
    }
}
