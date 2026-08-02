package xsna;

import android.util.SparseIntArray;
import com.google.android.material.shape.a;
import com.vk.antispam.di.AntispamComponentImpl;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.catalog2.registry.impl.app.di.CatalogRegistryComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.voip.ui.members.VoipDataProvider;
import xsna.bbv0;
import xsna.ds60;
import xsna.zsc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class yv2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ yv2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AntispamComponentImpl.b;
                return new dw2();
            case 1:
                bpn0 bpn0Var = AppsPickerFragment.V;
                return new ykg();
            case 2:
                PrivateFiles privateFiles = e8r.a;
                PrivateSubdir privateSubdir = PrivateSubdir.IM;
                privateFiles.getClass();
                b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                return b.a;
            case 3:
                return new zi50();
            case 4:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            case 5:
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider != null) {
                    return voipDataProvider;
                }
                return null;
            case 6:
                qcy<Object>[] qcyVarArr2 = CatalogRegistryComponentImpl.c;
                return new xia(new vda());
            case 7:
                return "unpinChannel: ";
            case 8:
                bbv0.g.getClass();
                bbv0.a.f().d.c();
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return new ugj0();
            case 10:
                return new ne6();
            case 11:
                return new s290();
            case 12:
                return s3q0.a;
            case 13:
                return Preference.f("connect_yclients_reviews_storage");
            case 14:
                m9n m9nVar = m9n.b;
                return ((StoriesComponent) m9n.c.getValue()).b();
            case 15:
                return new gwh0(null);
            case 16:
                return new zwv();
            case 17:
                return new com.vk.movika.sdk.base.hooks.q(0);
            case 18:
                return new k19();
            case 19:
                return new xf3();
            case 20:
                return new SparseIntArray();
            case 21:
                return Preference.f("video_multitrack_onboarding");
            case 22:
                return CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.GlobalSearchTab;
            case 23:
                return new com.vk.music.track.a();
            case 24:
                a.C0123a c0123a = new a.C0123a();
                c0123a.c(cn70.b(16));
                return c0123a.a();
            case 25:
                return new p4r();
            case 26:
                int i = PhotoVideoAttachActivity.g0;
                return s3q0.a;
            case 27:
                return s3q0.a;
            case 28:
                t6g0 t6g0Var = t6g0.b;
                return t6g0.c();
            default:
                return e43.l(zsc0.a.C4196a.b, new tsc0(ds60.a.C2747a.b), new tsc0(ds60.a.b.b));
        }
    }
}
