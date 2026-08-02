package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.core.preference.Preference;
import com.vk.libvideo.ui.VideoHideView;
import com.vk.newsfeed.impl.di.PostingSettingsComponentImpl;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.k840;
import xsna.p2i0;
import xsna.rwm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qc00 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qc00(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        p2i0 a;
        switch (this.b) {
            case 0:
                return new xop();
            case 1:
                return k840.a.c();
            case 2:
                return new com.vk.music.track.a();
            case 3:
                Set<String> set = MusicTrackCellVh.A;
                return new com.vk.music.track.a();
            case 4:
                return new hqp();
            case 5:
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                return new AtomicReference("news");
            case 6:
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_DISCLAIMER_REPOSITION;
                smbAdFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbAdFeatures));
            case 7:
                qcy<Object>[] qcyVarArr2 = PostingSettingsComponentImpl.d;
                return new amc0(new zqu(), new es());
            case 8:
                return Integer.valueOf(xne0.j);
            case 9:
                return new clg0();
            case 10:
                return new u1r0();
            case 11:
                return Preference.f("studilka_remote_config");
            case 12:
                int i = rwm0.g;
                dhr0.a.getClass();
                return rwm0.a.a(dhr0.s());
            case 13:
                qcy<Object>[] qcyVarArr3 = SuggestedPostsFragment.r0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 14:
                List<String> list = p2i0.b;
                a = p2i0.a.a(p2i0.b);
                RegexOption regexOption = RegexOption.IGNORE_CASE;
                a.b(new Regex("(\\[(?:10005|10018),\\d+,\\d+,\\d+,\\d+,)(\"(?:\\\\\"|[^\"])*\")", regexOption), new wql0(4));
                a.b(new Regex("(\\[10004,\\d+,\\d+,\\d+,\\d+,\\d+,)(\"(?:\\\\\"|[^\"])*\")", regexOption), new wo40(18));
                a.b(new Regex("\"(source_message)\":(\"(?:\\\\\"|[^\"])*\")", regexOption), new acc0(13));
                return a;
            case 15:
                return new com.vk.avatar.impl.border.item.path.b();
            case 16:
                return new StringBuffer();
            case 17:
                int i2 = VideoCatalogRootVh.M0;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_OFFLINE_REFINEMENT_BUGS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 18:
                int i3 = VideoHideView.A;
                return s3q0.a;
            case 19:
                return new ucg0();
            case 20:
                return s3q0.a;
            case 21:
                iyk0 iyk0Var = phv0.a;
                return null;
            case 22:
                throw new IllegalStateException("Not provided");
            case 23:
                return Boolean.valueOf(com.vk.voip.ui.actions.feature.b.b());
            default:
                return s3q0.a;
        }
    }
}
