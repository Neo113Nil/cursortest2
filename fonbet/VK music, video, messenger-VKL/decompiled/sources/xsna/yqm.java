package xsna;

import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.im.ui.components.dialogs_header.vc.HeaderInfo;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DialogsHeaderComponentDelegate.kt */
/* loaded from: classes2.dex */
public final class yqm {
    public final a1w a;
    public final j8i b;
    public final zqm c;
    public boolean d;
    public ImBgSyncState e = ImBgSyncState.DISCONNECTED;
    public final com.vk.im.engine.reporters.syncstate.a f;

    /* compiled from: DialogsHeaderComponentDelegate.kt */
    public final class a implements io.reactivex.rxjava3.functions.f<p680> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(p680 p680Var) {
            yqm.this.a();
        }
    }

    /* compiled from: DialogsHeaderComponentDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImBgSyncState.values().length];
            try {
                iArr[ImBgSyncState.REFRESHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImBgSyncState.REFRESHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImBgSyncState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImBgSyncState.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImBgSyncState.CONNECTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DialogsHeaderComponentDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ImBgSyncState, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ImBgSyncState imBgSyncState) {
            ImBgSyncState imBgSyncState2 = imBgSyncState;
            yqm yqmVar = (yqm) this.receiver;
            yqmVar.e = imBgSyncState2;
            yqmVar.f.a(com.vk.im.engine.reporters.syncstate.b.a(imBgSyncState2));
            yqmVar.a();
            return s3q0.a;
        }
    }

    public yqm(a1w a1wVar, j8i j8iVar, zqm zqmVar) {
        this.a = a1wVar;
        this.b = j8iVar;
        this.c = zqmVar;
        LongPollType longPollType = LongPollType.MESSAGES;
        ImSyncStateStatReporter.Target target = ImSyncStateStatReporter.Target.DIALOG_LIST;
        fr frVar = new fr(12);
        this.f = new com.vk.im.engine.reporters.syncstate.a(a1wVar, frVar, new com.vk.im.engine.reporters.syncstate.c(frVar), new j8(27), longPollType, target);
    }

    public final void a() {
        HeaderInfo headerInfo;
        int i = b.$EnumSwitchMapping$0[this.e.ordinal()];
        if (i == 1) {
            headerInfo = HeaderInfo.REFRESHING;
        } else if (i == 2 || i == 3) {
            headerInfo = this.d ? HeaderInfo.REFRESHING : HeaderInfo.CONNECTED;
        } else if (i == 4 || i == 5) {
            r6m.a.getClass();
            headerInfo = r6m.j() ? HeaderInfo.CONNECTING : HeaderInfo.WAIT_FOR_NETWORK;
        } else {
            headerInfo = HeaderInfo.CONNECTING;
        }
        this.c.c(headerInfo);
    }

    public final void b() {
        a1w a1wVar = this.a;
        io.reactivex.rxjava3.disposables.c subscribe = a1wVar.l.a().b0(p680.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new a());
        j8i j8iVar = this.b;
        j8iVar.I0(subscribe);
        j8iVar.I0(new io.reactivex.rxjava3.internal.operators.observable.y(a1wVar.l.a().b0(u180.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new nu0(new la2(24), 19)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new cz(new c(1, this, yqm.class, "setBgSyncStateAndInvalidate", "setBgSyncStateAndInvalidate(Lcom/vk/im/engine/models/ImBgSyncState;)V", 0), 20)));
        cau0 cau0Var = a1wVar.r().h;
        this.c.a(0, false, false);
    }
}
