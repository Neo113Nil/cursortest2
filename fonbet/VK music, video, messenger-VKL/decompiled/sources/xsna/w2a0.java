package xsna;

import android.graphics.Rect;
import android.view.View;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.vk.auth.suspicious_auth.SuspiciousAuthComponentImpl;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.messagetemplates.impl.common.TemplateArgs;
import com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardState;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.sharing.im_engine_impl.di.SharingImEngineScopedComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2a0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ w2a0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                String[] strArr = PostViewFragment.T0;
                return new jgg();
            case 2:
                qcy<Object>[] qcyVarArr = PostingComponentImpl.j;
                t6g0 t6g0Var = t6g0.b;
                return t6g0.c();
            case 3:
                ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 4:
                return new m9x0();
            case 5:
                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                DecodeHintType decodeHintType = DecodeHintType.POSSIBLE_FORMATS;
                EnumSet noneOf = EnumSet.noneOf(BarcodeFormat.class);
                noneOf.addAll(p7l.e);
                noneOf.addAll(p7l.d);
                noneOf.addAll(p7l.g);
                noneOf.addAll(p7l.b);
                noneOf.addAll(p7l.c);
                noneOf.addAll(p7l.f);
                enumMap.put((EnumMap) decodeHintType, (DecodeHintType) noneOf);
                return enumMap;
            case 6:
                return new e3a();
            case 7:
                qcy<Object>[] qcyVarArr2 = SharingImEngineScopedComponentImpl.g;
                return new wbj0();
            case 8:
                return new Rect();
            case 9:
                StoriesFeatures storiesFeatures = StoriesFeatures.SAFE_UPDATE;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 10:
                nr4.a().getClass();
                return Integer.valueOf(o0m0.a());
            case 11:
                return new osl0();
            case 12:
                qcy<Object>[] qcyVarArr3 = SuspiciousAuthComponentImpl.b;
                return new bln0();
            case 13:
                return new TemplatesKeyboardState(new TemplateArgs(null, null, null, null, null, 31, null), EmptyList.b, null, 4, null);
            case 14:
                int i = VideoMinimizableDiscoveryFragment.p1;
                return s3q0.a;
            case 15:
                return Boolean.valueOf(fxc0.B().J().L1());
            case 16:
                List<Class<? extends View>> list = VkFormField.C;
                return new int[]{R.attr.formItemStateError};
            default:
                return (ScheduledExecutorService) jfv0.n.getValue();
        }
    }
}
