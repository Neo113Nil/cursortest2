package xsna;

import android.graphics.Matrix;
import android.os.SystemClock;
import com.vk.badges.di.BadgesComponentImpl;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.newsfeed.impl.newsfeed_section.presentation.base.fragment.NewsfeedSectionFragment;
import com.vk.profile.community.catalog.impl.di.CommunitiesCatalogComponentImpl;
import com.vk.superapp.vibration.js.bridge.impl.di.JsVibrationDelegateComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SmbFeatures;
import com.vk.toggle.features.SoccomFeatures;
import java.util.Calendar;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i13 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ i13(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        b.d j;
        JSONObject g;
        switch (this.b) {
            case 0:
                int i = j13.a;
                return cql.a;
            case 1:
                qcy<Object>[] qcyVarArr = BadgesComponentImpl.b;
                return new pz5();
            case 2:
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                return Pattern.compile(".*/room/.*");
            case 5:
                return new f8c();
            case 6:
                return new uft0();
            case 7:
                ChatFragment.d dVar = ChatFragment.w1;
                return Boolean.valueOf(o25.b(o25.a()));
            case 8:
                iyk0 iyk0Var = u7g.a;
                return Boolean.TRUE;
            case 9:
                qcy<Object>[] qcyVarArr2 = CommunitiesCatalogComponentImpl.b;
                return new hog();
            case 10:
                int i2 = ExploreFragment.h0;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 11:
                int i3 = GamesCatalogFragment.i0;
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                SaFeatures saFeatures = SaFeatures.SA_GAMES_CATALOG_PERFORMANCE;
                boolean z = false;
                if (bVar.a(saFeatures) && (j = bVar.j(saFeatures.getKey(), false)) != null && (g = j.g()) != null && g.optBoolean("compose_optimizations", true)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                return new Matrix();
            case 13:
                return new jwx(2, 8);
            case 14:
                return new d5w(EmptyList.b, jgp.b, EmptySet.b, false, false, false, false, null, false);
            case 15:
                return s3q0.a;
            case 16:
                qcy<Object>[] qcyVarArr3 = JsVibrationDelegateComponentImpl.b;
                return new m6y();
            case 17:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 18:
                return s3q0.a;
            case 19:
                return Calendar.getInstance();
            case 20:
                FeedFeatures feedFeatures = FeedFeatures.FRESH_TIMER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 21:
                int i4 = NewsfeedSectionFragment.V;
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 22:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 23:
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_CARD_PARAMS;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 24:
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 25:
                frf0.g.b.clear();
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                return new s290();
            case 28:
                qcy<Object>[] qcyVarArr4 = StoryEditorExtDepsComponentImpl.r;
                return new kql0();
            default:
                return s3q0.a;
        }
    }
}
