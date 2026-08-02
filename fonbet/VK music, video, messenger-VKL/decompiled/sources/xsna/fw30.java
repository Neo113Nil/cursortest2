package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw30;

/* compiled from: MsgSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class fw30 extends FunctionReferenceImpl implements wzs<dw30.a, wpp<Long, Dialog>, Pair<? extends dw30.a, ? extends ipm>> {
    @Override // xsna.wzs
    public final Pair<? extends dw30.a, ? extends ipm> invoke(dw30.a aVar, wpp<Long, Dialog> wppVar) {
        dw30.a aVar2 = aVar;
        ((dw30) this.receiver).getClass();
        return new Pair<>(aVar2, new ipm(wppVar, new ProfilesInfo(aVar2.b())));
    }
}
