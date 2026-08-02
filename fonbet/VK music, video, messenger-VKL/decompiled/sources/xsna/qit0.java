package xsna;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.actions.menu.fragments.CallParticipantSettingsFragment;
import com.vk.voip.ui.menu.feature.VoipCallMainMenuComponentProvider;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.text.Regex;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qit0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qit0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Regex regex = com.vk.core.files.a.a;
                PrivateFiles privateFiles = e8r.a;
                PrivateSubdir privateSubdir = PrivateSubdir.STORIES_TEMP;
                String str = com.vk.core.files.a.w() + "_music";
                privateFiles.getClass();
                File e = PrivateFiles.e(privateFiles, privateSubdir, str, "mp3", 24);
                nbr.k((File) obj, e, false, 6);
                break;
            case 1:
                break;
            case 2:
                qgi0.n((tgi0) obj, 0);
                break;
            case 3:
                break;
            case 4:
                u59 u59Var = ((xcw0.x) obj).a;
                CallParticipantSettingsFragment callParticipantSettingsFragment = new CallParticipantSettingsFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("call_main_menu", new VoipCallMainMenuComponentProvider(u59Var));
                callParticipantSettingsFragment.setArguments(bundle);
                u59Var.c(callParticipantSettingsFragment, false);
                break;
            case 5:
                L.f("VoipEffectStarterImpl", "Error during mask request", (Throwable) obj);
                break;
            case 6:
                xt2 xt2Var = (xt2) obj;
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                String str2 = xt2Var.b;
                cVar.getClass();
                OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
                oKVoipEngine.getClass();
                OKVoipEngine.x().g(str2);
                String str3 = xt2Var.a;
                oKVoipEngine.getClass();
                io70 x = OKVoipEngine.x();
                x.d.invoke(new com.vk.movika.sdk.base.ui.i(21, x, str3));
                break;
            default:
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).J()) {
                    cvk.u(R.string.access_error, false);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qit0(lcw0 lcw0Var) {
        this.b = 4;
    }
}
