package xsna;

import com.vk.im.engine.internal.sync.longpoll.LongPollStateComposingPolicy;
import com.vk.im.engine.models.ImBgSyncState;
import java.util.LinkedHashMap;

/* compiled from: BgSyncStateComposerImpl.kt */
/* loaded from: classes2.dex */
public final class oy6 implements ny6 {
    public final LongPollStateComposingPolicy a;
    public final esp b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: BgSyncStateComposerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImBgSyncState.values().length];
            try {
                iArr[ImBgSyncState.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImBgSyncState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImBgSyncState.REFRESHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImBgSyncState.REFRESHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImBgSyncState.CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public oy6(LinkedHashMap linkedHashMap, LongPollStateComposingPolicy longPollStateComposingPolicy, esp espVar) {
        this.a = longPollStateComposingPolicy;
        this.b = espVar;
    }

    @Override // xsna.ny6
    public final void a() {
        this.c.dispose();
        ixv ixvVar = ixv.c;
        esp espVar = this.b;
        espVar.c.onNext(ixvVar);
        espVar.b.dispose();
    }
}
