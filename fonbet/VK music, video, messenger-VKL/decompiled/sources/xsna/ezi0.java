package xsna;

import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.models.typing.ComposingType;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.ij20;

/* compiled from: SetUserActivityCmd.kt */
/* loaded from: classes2.dex */
public final class ezi0 extends le6<s3q0> {
    public static final b d = new b();
    public static final LinkedHashMap e = new LinkedHashMap();
    public static final LinkedHashMap f = new LinkedHashMap();
    public final a b;
    public final a c;

    /* compiled from: SetUserActivityCmd.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final ComposingType c;

        public a(long j, long j2, ComposingType composingType) {
            this.a = j;
            this.b = j2;
            this.c = composingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "ActivityRequestData(time=" + this.a + ", peerId=" + this.b + ", composingType=" + this.c + ')';
        }
    }

    /* compiled from: SetUserActivityCmd.kt */
    public static final class b {

        /* compiled from: SetUserActivityCmd.kt */
        public static final class a {
            public final long a;
            public final long b;

            public a(long j, long j2) {
                this.a = j;
                this.b = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Chat(ownerId=");
                sb.append(this.a);
                sb.append(", dialogId=");
                return vu5.a(')', this.b, sb);
            }
        }

        public final synchronized void a(lzv lzvVar, long j, long j2, ComposingType composingType) {
            try {
                a aVar = new a(j, j2);
                ezi0 b = b(aVar, composingType);
                if (b == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = ezi0.f;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(aVar);
                if (cVar != null) {
                    cVar.dispose();
                }
                linkedHashMap.put(aVar, itg0.n(lzvVar.b(this, b)));
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized ezi0 b(a aVar, ComposingType composingType) {
            try {
                LinkedHashMap linkedHashMap = ezi0.e;
                a aVar2 = (a) linkedHashMap.get(aVar);
                long j = aVar2 != null ? aVar2.a : 0L;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - j < 5000) {
                    return null;
                }
                a aVar3 = new a(currentTimeMillis, aVar.b, composingType);
                linkedHashMap.put(aVar, aVar3);
                return new ezi0(aVar2, aVar3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: SetUserActivityCmd.kt */
    public static final class c extends RuntimeException {
        private final String errorMsg;

        public c(String str) {
            this.errorMsg = str;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Unexpected flood control: " + this.errorMsg;
        }
    }

    /* compiled from: SetUserActivityCmd.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposingType.values().length];
            try {
                iArr[ComposingType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposingType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposingType.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComposingType.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ComposingType.FILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ComposingType.VIDEO_MSG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ezi0(a aVar, a aVar2) {
        this.b = aVar;
        this.c = aVar2;
    }

    public static void f(w2w w2wVar, a aVar) {
        String str;
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.i = false;
        aVar2.c = "messages.setActivity";
        aVar2.f.put("peer_id", Long.valueOf(aVar.b).toString());
        switch (d.$EnumSwitchMapping$0[aVar.c.ordinal()]) {
            case 1:
                str = "typing";
                break;
            case 2:
                str = "audiomessage";
                break;
            case 3:
                str = "photo";
                break;
            case 4:
                str = "video";
                break;
            case 5:
                str = X3.i.b;
                break;
            case 6:
                str = "videomessage";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        aVar2.b("type", str);
        Peer Q0 = w2wVar.Q0();
        Q0.getClass();
        if (Q0.Ab(Peer.Type.GROUP)) {
            aVar2.f.put("group_id", Long.valueOf(w2wVar.Q0().d).toString());
        }
        bz2.h(new ij20(aVar2));
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        a aVar = this.c;
        try {
            f(w2wVar, aVar);
        } catch (VKApiExecutionException e2) {
            int s = e2.s();
            if (s == 9) {
                com.vk.metrics.eventtracking.b.a.a(new c(xqm0.g("\n            Previous Activity Request Data: " + this.b + "\n            Current Activity Request Data: " + aVar + ",\n            Original exception: " + e2 + "\n            ")));
                throw e2;
            }
            if (s != 15) {
                if (s != 917) {
                    throw e2;
                }
                com.vk.metrics.eventtracking.b.a.a(e2);
                throw new ApiAccessDeniedException(e2);
            }
            w2wVar.e1(this, new pc80(aVar.b, e2));
        } catch (IOException e3) {
            if (e3 instanceof InterruptedIOException) {
                throw e3;
            }
        } catch (InterruptedException e4) {
            throw e4;
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezi0)) {
            return false;
        }
        ezi0 ezi0Var = (ezi0) obj;
        return epx.f(this.b, ezi0Var.b) && epx.f(this.c, ezi0Var.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        a aVar = this.b;
        return this.c.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "SetUserActivityCmd(previousRequestData=" + this.b + ", currentRequestData=" + this.c + ')';
    }
}
