package one.video.player.tracks;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.er10;
import xsna.zrp;

/* compiled from: Track.kt */
/* loaded from: classes8.dex */
public abstract class Track {
    public final Type a;
    public final String b;
    public final er10 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Track.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type AUDIO;
        public static final Type TEXT;
        public static final Type VIDEO;

        static {
            Type type = new Type(SignalingProtocol.MEDIA_OPTION_AUDIO, 0);
            AUDIO = type;
            Type type2 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = type2;
            Type type3 = new Type("TEXT", 2);
            TEXT = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Track(Type type, String str, er10 er10Var) {
        this.a = type;
        this.b = str;
        this.c = er10Var;
    }
}
