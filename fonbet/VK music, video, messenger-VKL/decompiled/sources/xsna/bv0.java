package xsna;

import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.vk.catalog2.registry.impl.app.di.CatalogRegistryComponentImpl;
import com.vk.clips.tool.view.nps.internal.EdgesAwareNestedVerticalRecyclerView;
import com.vk.clips.upload.vk.ui.impl.ClipsUploadUiVkComponentBase;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.donut.privacy.di.DonutPrivacyComponentImpl;
import com.vk.importcontacts.impl.di.ImportContactsComponentImpl;
import com.vk.log.L;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.VoipFeatures;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bv0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bv0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        b.d j;
        JSONObject g;
        switch (this.b) {
            case 0:
                return new lc0();
            case 1:
                vx2.a.getClass();
                return vx2.b();
            case 2:
                return lyd.g();
            case 3:
                int i = BoardTopicsFragment.S0;
                return new hi7();
            case 4:
                qcy<Object>[] qcyVarArr = CatalogRegistryComponentImpl.c;
                return new p3a();
            case 5:
                return "deleteChannel: ";
            case 6:
                return Long.valueOf(System.currentTimeMillis());
            case 7:
                ComFeatures comFeatures = ComFeatures.COM_PROFILE_FROM_CLIPS_SWIPE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 8:
                qcy<Object>[] qcyVarArr2 = ClipsUploadUiVkComponentBase.d;
                return new paf(new raf());
            case 9:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                return new yif0();
            case 10:
                return new ucg0();
            case 11:
                return s3q0.a;
            case 12:
                Collator collator = Collator.getInstance(new Locale("ru"));
                collator.setStrength(0);
                return collator;
            case 13:
                FeedFeatures feedFeatures = FeedFeatures.DISCOVER_OZON_CLIP;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 14:
                m9n m9nVar = m9n.b;
                return ((StoriesComponent) m9n.c.getValue()).w3();
            case 15:
                return new lu();
            case 16:
                qcy<Object>[] qcyVarArr3 = DonutPrivacyComponentImpl.b;
                return new e2o();
            case 17:
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) Math.floor(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE * Resources.getSystem().getDisplayMetrics().density));
                layoutParams.gravity = 8388629;
                return layoutParams;
            case 18:
                VoipFeatures voipFeatures = VoipFeatures.BAD_NETWORK_INDICATOR;
                voipFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(voipFeatures));
            case 19:
                int i2 = EdgesAwareNestedVerticalRecyclerView.e;
                return new Handler(Looper.getMainLooper());
            case 20:
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                SaFeatures saFeatures = SaFeatures.SA_GAMES_CATALOG_PERFORMANCE;
                return Boolean.valueOf(bVar.a(saFeatures) && (j = bVar.j(saFeatures.getKey(), false)) != null && (g = j.g()) != null && g.optBoolean("cache", true));
            case 21:
                int i3 = GroupDialogsScreenFragment.e0;
                return g2v.c().m();
            case 22:
                qcy<Object>[] qcyVarArr4 = ImportContactsComponentImpl.b;
                return new pqw();
            case 23:
                return new com.vk.movika.sdk.base.hooks.i();
            case 24:
                return new rk30();
            case 25:
                MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable((com.google.android.material.shape.a) w750.a.getValue());
                materialShapeDrawable.setShadowColor(-16777216);
                try {
                    Field declaredField = MaterialShapeDrawable.class.getDeclaredField("shadowRenderer");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(materialShapeDrawable);
                    int a = w750.a(18, "shadowStartColor", obj);
                    w750.a(9, "shadowMiddleColor", obj);
                    w750.a(0, "shadowEndColor", obj);
                    Field declaredField2 = obj.getClass().getDeclaredField("shadowPaint");
                    declaredField2.setAccessible(true);
                    ((Paint) declaredField2.get(obj)).setColor(a);
                } catch (Throwable th) {
                    L.i(th);
                }
                materialShapeDrawable.setShadowCompatibilityMode(2);
                materialShapeDrawable.setShadowVerticalOffset(cn70.b(16));
                materialShapeDrawable.setElevation(cn70.b(16));
                return materialShapeDrawable;
            case 26:
                return Boolean.valueOf(MusicFeatures.AUDIO_REWORK_PLAYER_ADS.h());
            case 27:
                return Boolean.valueOf(MusicFeatures.AUDIO_NEW_DOWNLOADED_FILTERS.h());
            case 28:
                return new fx80();
            default:
                return Calendar.getInstance();
        }
    }
}
