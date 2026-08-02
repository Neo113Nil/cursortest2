package xsna;

import android.graphics.Paint;
import android.graphics.RectF;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.sdk.shared.upload.badge.UploadBadgeComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.view.components.cell.VkCell;
import com.vk.ecomm.storefrontservices.impl.di.StorefrontServicesComponentImpl;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.managed_groups.impl.ManagedGroupsInnerComponent;
import com.vk.music.playlist.di.MusicPlaylistComponentImpl;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import xsna.bfz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class la0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ la0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return new p4r();
            case 1:
                VideoFeatures videoFeatures = VideoFeatures.USE_EXTENDED_BROKEN_SOURCE_MARKER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 2:
                return new liw(liw.a());
            case 3:
                StoriesFeatures storiesFeatures = StoriesFeatures.VERTICALIZATION;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 4:
                int i = ChannelFragment.a1;
                return new p8s0(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNEL);
            case 5:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(-1);
                paint.setStyle(Paint.Style.FILL);
                return paint;
            case 6:
                return new qdd();
            case 7:
                int i2 = ClipsEntryPointsFragment.i0;
                return s3q0.a;
            case 8:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return rl3.y0(new ContactsViews[]{ContactsViews.SELECTION_PREVIEW, ContactsViews.USERS, ContactsViews.EMPTY});
            case 9:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 10:
                return s3q0.a;
            case 11:
                return new RectF();
            case 12:
                return s3q0.a;
            case 13:
                return new f8w(bfz.a.b.a);
            case 14:
                return new Regex("sportmailru\\.(m\\.)?(vk\\.(com|ru))");
            case 15:
                qcy<Object>[] qcyVarArr = ManagedGroupsInnerComponent.c;
                return i2w.a();
            case 16:
                return vtk0.a(Boolean.FALSE);
            case 17:
                qcy<Object>[] qcyVarArr2 = MusicPlaylistComponentImpl.a;
                return new z050();
            case 18:
                return "passkey";
            case 19:
                return new a390();
            case 20:
                return new ytu(cn70.a() * 2.0f, cn70.a() * 0.5f);
            case 21:
                b = e8r.a.b(r2, PrivateSubdir.MSG_REACTION_ASSETS.h(), true);
                return b.a;
            case 22:
                qcy<Object>[] qcyVarArr3 = StorefrontServicesComponentImpl.b;
                return new com.vk.ecomm.storefrontservices.impl.a();
            case 23:
                return ((StoriesComponent) ((k7m) m7m.f(wxl0.b)).a(fpf0.a(StoriesComponent.class))).eb();
            case 24:
                qcy<Object>[] qcyVarArr4 = UploadBadgeComponentImpl.b;
                return new ConcurrentHashMap();
            case 25:
                return gsi0.b();
            case 26:
                return new u1r0();
            case 27:
                return VkCell.Left.Main.Companion.serializer();
            default:
                throw null;
        }
    }
}
