package xsna;

import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.broadcast.VoipBroadcastException;
import com.vk.voip.dto.call_member.CallMember;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.webrtc.record.RecordType;

/* compiled from: BroadcastManagerImpl.kt */
/* loaded from: classes11.dex */
public final class ih8 implements RecordEventListener {
    public final y45 b;
    public final bh8 c;
    public final tk90 d;
    public final ReentrantLock e = new ReentrantLock(true);
    public final AtomicReference<a> f = new AtomicReference<>(null);

    /* compiled from: BroadcastManagerImpl.kt */
    /* loaded from: classes7.dex */
    public static abstract class a {

        /* compiled from: BroadcastManagerImpl.kt */
        /* renamed from: xsna.ih8$a$a, reason: collision with other inner class name */
        public static final class C3055a extends a {
            public static final C3055a a = new C3055a();
        }

        /* compiled from: BroadcastManagerImpl.kt */
        public static final class b extends a {
            public final VoipBroadcastException a;

            public b(VoipBroadcastException voipBroadcastException) {
                this.a = voipBroadcastException;
            }

            public final Throwable a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.a + ')';
            }
        }
    }

    /* compiled from: BroadcastManagerImpl.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecordType.values().length];
            try {
                iArr[RecordType.NOTHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecordType.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecordType.STREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BroadcastManagerImpl.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<whr0, s3q0> {
        public c(Object obj) {
            super(1, obj, bh8.class, "onBroadcastFinished", "onBroadcastFinished(Lcom/vk/voip/dto/VKUser;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(whr0 whr0Var) {
            ((bh8) this.receiver).g(whr0Var);
            return s3q0.a;
        }
    }

    public ih8(y45 y45Var, bh8 bh8Var, tk90 tk90Var, zfl zflVar) {
        this.b = y45Var;
        this.c = bh8Var;
        this.d = tk90Var;
    }

    public static hd8 d(RecordDescription recordDescription) {
        int i = b.$EnumSwitchMapping$0[recordDescription.getType().ordinal()];
        com.vk.voip.dto.RecordType recordType = i != 1 ? i != 2 ? i != 3 ? com.vk.voip.dto.RecordType.NOTHING : com.vk.voip.dto.RecordType.STREAM : com.vk.voip.dto.RecordType.RECORD : com.vk.voip.dto.RecordType.NOTHING;
        if (recordType == com.vk.voip.dto.RecordType.NOTHING) {
            return null;
        }
        String externalMovieId = recordDescription.getExternalMovieId();
        String externalOwnerId = recordDescription.getExternalOwnerId();
        if (externalMovieId != null && !drm0.N(externalMovieId) && externalOwnerId != null && !drm0.N(externalOwnerId)) {
            return new hd8(externalMovieId, externalOwnerId, String.valueOf(recordDescription.getMovieId()), mnh0.E(recordDescription.getInitiator()), recordDescription.getStart(), recordType);
        }
        L.f("BroadcastManagerImpl", "Broadcast info is illegal", new IllegalStateException(y57.a("Illegal external movie params format: id=", externalMovieId, ", ownerId=", externalOwnerId)));
        return null;
    }

    public final hd8 a() {
        RecordManager recordManager;
        RecordDescription recordDescription;
        OKVoipEngine.b.getClass();
        Conversation z = OKVoipEngine.z();
        if (z == null || (recordManager = z.getRecordManager()) == null || (recordDescription = recordManager.getRecordDescription()) == null) {
            return null;
        }
        return d(recordDescription);
    }

    public final hd8 b(String str, String str2, String str3, boolean z) {
        RecordManager recordManager;
        AtomicReference<a> atomicReference = this.f;
        StringBuilder a2 = xe9.a("startBroadcast: id=", str, ", ownerId=", str2, ", streamId=");
        a2.append(str3);
        L.A("BroadcastManagerImpl", a2.toString());
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (a() != null) {
                throw new IllegalStateException("Another active broadcast is running");
            }
            atomicReference.set(null);
            OKVoipEngine.b.getClass();
            Conversation z2 = OKVoipEngine.z();
            if (z2 != null && (recordManager = z2.getRecordManager()) != null) {
                RecordManager.startRecord$default(recordManager, new RecordManager.StartParams.Builder().isStream(z).withMovieId(Long.valueOf(Long.parseLong(str3))).build(), null, null, 6, null);
            }
            a aVar = atomicReference.get();
            while (aVar == null) {
                Thread.sleep(50L);
                aVar = atomicReference.get();
            }
            atomicReference.set(null);
            if (!(aVar instanceof a.C3055a)) {
                if (aVar instanceof a.b) {
                    throw ((a.b) aVar).a();
                }
                throw new NoWhenBranchMatchedException();
            }
            hd8 a3 = a();
            if (a3 == null) {
                throw new IllegalStateException("Broadcast not found after signal of success broadcast");
            }
            reentrantLock.unlock();
            return a3;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c() {
        RecordManager recordManager;
        AtomicReference<a> atomicReference = this.f;
        L.A("BroadcastManagerImpl", "stopBroadcast");
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (a() == null) {
                reentrantLock.unlock();
                return;
            }
            atomicReference.set(null);
            OKVoipEngine.b.getClass();
            Conversation z = OKVoipEngine.z();
            if (z != null && (recordManager = z.getRecordManager()) != null) {
                RecordManager.stopRecord$default(recordManager, new RecordManager.StopParams(null, false, null, null, 15, null), null, null, 6, null);
            }
            a aVar = atomicReference.get();
            while (aVar == null) {
                Thread.sleep(50L);
                aVar = atomicReference.get();
            }
            atomicReference.set(null);
            a.b bVar = aVar instanceof a.b ? (a.b) aVar : null;
            Throwable a2 = bVar != null ? bVar.a() : null;
            if (a2 != null) {
                if (!(a2 instanceof VoipBroadcastException)) {
                    throw a2;
                }
                if (((VoipBroadcastException) a2).d() != 2) {
                    throw a2;
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordDataChanged() {
        RecordManager recordManager;
        OKVoipEngine.b.getClass();
        Conversation z = OKVoipEngine.z();
        L.A("onrecordDescriptionChanged: data = " + ((z == null || (recordManager = z.getRecordManager()) == null) ? null : recordManager.getRecordDescription()));
        this.c.e(a());
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordError(String str) {
        L.A(go9.b("onRecordError: ", str));
        int i = epx.f(str, "already-recording") ? 1 : epx.f(str, "not-recording") ? 2 : 0;
        if (str == null) {
            str = "";
        }
        this.f.set(new a.b(new VoipBroadcastException(i, str)));
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordStarted() {
        RecordManager recordManager;
        OKVoipEngine.b.getClass();
        Conversation z = OKVoipEngine.z();
        L.A("onRecordStarted: data = " + ((z == null || (recordManager = z.getRecordManager()) == null) ? null : recordManager.getRecordDescription()));
        this.f.set(a.C3055a.a);
        this.c.e(a());
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordStopped(ConversationParticipant conversationParticipant) {
        RecordManager recordManager;
        Conversation conversation = (Conversation) this.b.invoke();
        RecordDescription recordDescription = (conversation == null || (recordManager = conversation.getRecordManager()) == null) ? null : recordManager.getRecordDescription();
        CallMember a2 = tk90.a(this.d, conversationParticipant);
        bh8 bh8Var = this.c;
        if (a2 != null) {
            cnw0 cnw0Var = OKVoipEngine.v;
            (cnw0Var != null ? cnw0Var : null).c(a2.a().Ab()).subscribe(new bg1(new c(bh8Var), 7));
        }
        L.A("onRecordStopped: data = " + recordDescription);
        this.f.set(a.C3055a.a);
        bh8Var.e(a());
    }
}
