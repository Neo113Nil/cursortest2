package xsna;

import androidx.preference.Preference;
import com.vk.voip.VoipService;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.io.File;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;
import xsna.zhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class s1j0 implements Preference.c, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(int i, int i2, int i3, int i4) {
        mjw0 mjw0Var = (mjw0) this.c;
        qiu qiuVar = mjw0Var.h;
        qiuVar.d = i2;
        qiuVar.b();
        mjw0Var.e.b(i2, i4);
        mjw0Var.f.d5(i2, i4);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (it80) ((l140) obj2).invoke(obj);
            case 2:
            case 12:
            case 13:
            default:
                return (Boolean) ((lbt0) obj2).invoke(obj);
            case 3:
                return (Boolean) ((l140) obj2).invoke(obj);
            case 4:
                return (File) ((defpackage.v) obj2).invoke(obj);
            case 5:
                return (ffe0) ((l140) obj2).invoke(obj);
            case 6:
                return (Boolean) ((l140) obj2).invoke(obj);
            case 7:
                return (Pair) ((l140) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((ie90) obj2).invoke(obj);
            case 9:
                return (Pair) ((egt0) obj2).invoke(obj);
            case 10:
                return (boa0) ((wom) obj2).invoke(obj);
            case 11:
                return (VoipActionsFeatureState.i) ((qcw0) obj2).invoke(obj);
            case 14:
                return (it80) ((lbt0) obj2).invoke(obj);
            case 15:
                Object obj3 = VoipService.q;
                return (s3q0) ((qcw0) obj2).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
        androidx.appcompat.app.d[] dVarArr = new androidx.appcompat.app.d[1];
        settingsGeneralFragment.m0.b(new io.reactivex.rxjava3.internal.operators.completable.e(new gwi0(settingsGeneralFragment, dVarArr, preference, 1)).h(new yyo(dVarArr, 3)).subscribe());
        return true;
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        StereoRoomManagerAdaptersKt.requestPromotion$lambda$0((StereoRoomManager) this.c, bVar);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (giw0) ((zhw0.d) this.c).invoke(obj, obj2);
    }
}
