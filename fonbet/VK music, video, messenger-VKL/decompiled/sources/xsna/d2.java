package xsna;

import com.vk.catalog2.feature.music.holders.view.a;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.comments.impl.di.CommentsComponentImpl;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.mytarget.di.AdsSdkComponentImpl;
import com.vk.profile.community.api.component.CommunityComponentStub;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.text.Regex;
import xsna.ds60;
import xsna.gfb0;
import xsna.rpq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ d2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new y1();
            case 1:
                return Calendar.getInstance();
            case 2:
                qcy<Object>[] qcyVarArr = AdsSdkComponentImpl.e;
                return new s5g0();
            case 3:
                return new mzr0();
            case 4:
                return Integer.valueOf(an10.b(iah0.f().density));
            case 5:
                return s3q0.a;
            case 6:
                return new knp0();
            case 7:
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                return new n5e();
            case 8:
                return new pbr();
            case 9:
                qcy<Object>[] qcyVarArr3 = CommentsComponentImpl.g;
                return new geg();
            case 10:
                ComFeatures comFeatures = ComFeatures.COM_COMMUNITY_ADDRESSES_FIX;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 11:
                qcy<Object>[] qcyVarArr4 = CommunityComponentStub.c;
                return new w4h();
            case 12:
                pqo pqoVar = hfj.a;
                return Float.valueOf(1.0f);
            case 13:
                return s3q0.a;
            case 14:
                return e43.l(rpq.c.a.b, new rpq.a.C3621a(ds60.a.C2747a.b), new rpq.a.C3621a(ds60.a.b.b), rpq.a.b.b);
            case 15:
                return new ec70();
            case 16:
                return new gko(R.drawable.vk_icon_lego_plus_28);
            case 17:
                return "#doStartBgSync starting...";
            case 18:
                zdw zdwVar = i7o0.b;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                a1w a1wVar = zdwVar.b;
                a1wVar.getClass();
                return a1wVar.r().h;
            case 19:
                return new x7w(xo9.x(0L, com.vk.im.engine.models.im_item.b.b, 1L), 0L, 0L);
            case 20:
                return new Regex("/clip([-0-9]+)_([0-9]+)");
            case 21:
                return new dvz();
            case 22:
                return new zy10();
            case 23:
                return new a.C0522a(new c4r(17));
            case 24:
                return new czm();
            case 25:
                FeedFeatures feedFeatures = FeedFeatures.CLEAR_STACK_INACTIVE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 26:
                return s3q0.a;
            case 27:
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList.add(gfb0.a.c.a);
                }
                return arrayList;
            case 28:
                Regex regex = com.vk.core.files.a.a;
                return new File(e43.a.getFilesDir(), "attach_arranger_cache.dat");
            default:
                return ((CommunityStrikesComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(CommunityStrikesComponent.class))).ge();
        }
    }
}
