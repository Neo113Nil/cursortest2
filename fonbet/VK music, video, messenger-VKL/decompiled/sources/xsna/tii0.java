package xsna;

import com.vk.sharing.core.view.TargetSendActionView;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dji0;
import xsna.nii0;
import xsna.yii0;

/* compiled from: SendStoryUsersFeature.kt */
/* loaded from: classes16.dex */
public final class tii0 extends wk50<fji0, eji0, nii0, yii0> {
    public final StoryMultiData f;
    public final f4z g;
    public final HashMap<Long, io.reactivex.rxjava3.disposables.c> h;

    /* compiled from: SendStoryUsersFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TargetSendActionView.State.values().length];
            try {
                iArr[TargetSendActionView.State.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetSendActionView.State.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetSendActionView.State.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tii0(StoryMultiData storyMultiData) {
        super(new nii0.e(r1, ""), new zii0(new eji0("", r1, false, false)));
        EmptyList emptyList = EmptyList.b;
        this.f = storyMultiData;
        this.g = new f4z();
        this.h = new HashMap<>();
    }

    @Override // xsna.wk50
    public final void N(eji0 eji0Var, nii0 nii0Var) {
        nii0 nii0Var2 = nii0Var;
        String str = eji0Var.c;
        if (nii0Var2 instanceof nii0.e) {
            nii0.e eVar = (nii0.e) nii0Var2;
            if (epx.f(str, eVar.c)) {
                T(new yii0.c(eVar.b));
                return;
            }
            return;
        }
        boolean z = nii0Var2 instanceof nii0.f;
        f4z f4zVar = this.g;
        if (z) {
            String str2 = ((nii0.f) nii0Var2).b;
            if (epx.f(str, str2)) {
                return;
            }
            T(new yii0.d(str2));
            f4zVar.b(new dji0.d(str2));
            return;
        }
        if (!(nii0Var2 instanceof nii0.i)) {
            if (nii0Var2 instanceof nii0.h) {
                long j = ((nii0.h) nii0Var2).b;
                T(new yii0.e(j, TargetSendActionView.State.OPEN));
                f4zVar.b(new dji0.e(this.f, j));
                return;
            }
            if (nii0Var2 instanceof nii0.d) {
                f4zVar.b(dji0.b.a);
                return;
            }
            if (nii0Var2 instanceof nii0.b) {
                T(yii0.b.b);
                return;
            }
            if (nii0Var2 instanceof nii0.a) {
                T(yii0.a.b);
                return;
            } else if (nii0Var2 instanceof nii0.g) {
                f4zVar.b(new dji0.c(((nii0.g) nii0Var2).b));
                return;
            } else {
                if (!(nii0Var2 instanceof nii0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(dji0.a.a);
                return;
            }
        }
        nii0.i iVar = (nii0.i) nii0Var2;
        TargetSendActionView.State state = iVar.c;
        long j2 = iVar.b;
        T(new yii0.e(j2, state));
        int i = a.$EnumSwitchMapping$0[state.ordinal()];
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        HashMap<Long, io.reactivex.rxjava3.disposables.c> hashMap = this.h;
        if (i == 1) {
            io.reactivex.rxjava3.disposables.c cVar = hashMap.get(Long.valueOf(j2));
            if (cVar != null) {
                bVar.a(cVar);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.x.t(3500L, TimeUnit.MILLISECONDS).m(asu0.a.d()).subscribe(new ow40(new eci0(1, this, iVar), 16), new pw40(new js00(9, this, iVar), 9));
        hashMap.put(Long.valueOf(j2), subscribe);
        hg1.e(bVar, subscribe);
    }
}
