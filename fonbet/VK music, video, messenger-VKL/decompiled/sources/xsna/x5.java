package xsna;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import com.vk.camera.editor.common.di.CommonEditorComponentImpl;
import com.vk.clips.coauthors.di.stub.ClipsCoauthorsComponentStub;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.regex.Pattern;
import xsna.nxz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x5 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ x5(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator(' ');
                return new DecimalFormat("###,###", decimalFormatSymbols);
            case 1:
                return s3q0.a;
            case 2:
                return new jl80();
            case 3:
                return s3q0.a;
            case 4:
                return new y97();
            case 5:
                return new v8l0(new zq70(), new u8l0());
            case 6:
                return "expandChannelRecommendations: ";
            case 7:
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr = ClipsCoauthorsComponentStub.d;
                return new ClipsCoauthorsComponentStub.b();
            case 9:
                return new eaf0();
            case 10:
                qcy<Object>[] qcyVarArr2 = CommonEditorComponentImpl.h;
                return new jhw();
            case 11:
                return new com.vk.profile.community.impl.ui.events.f(new zqu());
            case 12:
                t6g0 t6g0Var = t6g0.b;
                return t6g0.c();
            case 13:
                return s3q0.a;
            case 14:
                h6v0 h6v0Var = h6v0.a;
                h6v0.b(!((Boolean) ((zak0) h6v0.c).getValue()).booleanValue());
                return s3q0.a;
            case 15:
                Serializer.c<Dialog> cVar = Dialog.CREATOR;
                ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
                imFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(imFeatures));
            case 16:
                return new Handler(Looper.getMainLooper());
            case 17:
                return new pco(0);
            case 18:
                return s3q0.a;
            case 19:
                return "flush: append file will be flushed";
            case 20:
                return new x1w0();
            case 21:
                return Pattern.compile("\\[(event#[a-z0-9_]+)\\|([^]]+)]");
            case 22:
                sex0 sex0Var = e370.l;
                Object obj = null;
                if (sex0Var == null) {
                    sex0Var = null;
                }
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                sex0Var.getClass();
                try {
                    obj = oxz.e(context).a();
                } catch (Throwable unused) {
                }
                String str = nxz.q;
                return nxz.b.b((Location) obj);
            case 23:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 24:
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                com.vk.core.view.shimmer.a aVar = new com.vk.core.view.shimmer.a();
                Shimmer.c cVar2 = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
                abg0 abg0Var = dhr0.t;
                cVar2.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
                cVar2.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
                aVar.b(((Shimmer.c) cVar2.d()).a());
                return aVar;
            case 27:
                return Boolean.valueOf(MusicFeatures.CATALOG_GENERAL_SECTION_CACHE.h());
            case 28:
                return new lw40();
            default:
                return s3q0.a;
        }
    }
}
