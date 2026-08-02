package xsna;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.a;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.a;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.kte;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hue implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hue(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        ?? r5 = 0;
        us2 a = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = (GroupsGetByIdObjectResponseDto) obj2;
                ((kue) obj3).e.getClass();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    String str = "";
                    if (!it.hasNext()) {
                        List<GroupsGroupFullDto> d = groupsGetByIdObjectResponseDto.d();
                        if (d != null) {
                            List<GroupsGroupFullDto> list2 = d;
                            r5 = new ArrayList(c5g.u(list2, 10));
                            for (GroupsGroupFullDto groupsGroupFullDto : list2) {
                                UserId e = fkq0.e(fkq0.a(groupsGroupFullDto.P0()));
                                String y1 = groupsGroupFullDto.y1();
                                if (y1 == null) {
                                    y1 = "";
                                }
                                String V1 = groupsGroupFullDto.V1();
                                if (V1 == null) {
                                    V1 = "";
                                }
                                r5.add(new kte.a(e, y1, V1));
                            }
                        }
                        if (r5 == 0) {
                            r5 = EmptyList.b;
                        }
                        break;
                    } else {
                        UsersUserFullDto usersUserFullDto = (UsersUserFullDto) it.next();
                        UserId s1 = usersUserFullDto.s1();
                        String a2 = rq.a(usersUserFullDto, new StringBuilder(), ' ');
                        String r2 = usersUserFullDto.r2();
                        if (r2 != null) {
                            str = r2;
                        }
                        arrayList.add(new kte.a(s1, a2, str));
                    }
                }
            case 1:
                EditText editText = (EditText) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                editText.setInputType(16);
                editText.setHint("example: test-api.vk.com");
                editText.setText((String) obj3);
                break;
            case 2:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                ((DzenArticleFragment) obj3).eo(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((axq) obj3).g(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((ymr) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                View view = ((GeoPostsFragment) obj3).b0;
                if (view != null) {
                    view.setVisibility(booleanValue ? 0 : 8);
                }
                break;
            case 6:
                giy giyVar = (giy) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1817919587, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.KidsAudioBookBigPlayerControls.Content.<anonymous> (KidsAudioBookBigPlayerControls.kt:38)");
                    }
                    giyVar.b(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 7:
                ModalPostDonutFragment modalPostDonutFragment = (ModalPostDonutFragment) obj3;
                Integer num = (Integer) obj2;
                int i2 = ModalPostDonutFragment.W;
                xn50.a.c(modalPostDonutFragment, new a.c((List) obj));
                if (num != null) {
                    ?? parentFragment = modalPostDonutFragment.getParentFragment();
                    wsn0 wsn0Var = parentFragment instanceof wsn0 ? (wsn0) parentFragment : null;
                    if (wsn0Var != null) {
                        wsn0Var.qd(num.intValue());
                    }
                }
                break;
            case 8:
                vm30 vm30Var = (vm30) obj3;
                TextView textView = (TextView) obj;
                kkm kkmVar = (kkm) obj2;
                kkm kkmVar2 = vm30Var.d;
                TextView textView2 = vm30Var.v;
                if (kkmVar2.a.c.d()) {
                    Context context = textView.getContext();
                    e3m.a aVar2 = e3m.a;
                    textView2.setBackground(m33.a(R.drawable.bg_im_system_msg, context));
                    textView2.setTextColor(textView.getContext().getColor(R.color.vk_white));
                } else {
                    textView2.setBackgroundResource(dhr0.b0(R.attr.im_bg_sticky_date));
                    textView2.setTextColor(kkmVar.f(R.attr.vk_ui_vkontakte_im_service_message_text));
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr2 = MusicDownloadsSettingsFragment.P;
                ((MusicDownloadsSettingsFragment) obj3).eo(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 10:
                OnboardingPromoFragment onboardingPromoFragment = (OnboardingPromoFragment) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr3 = OnboardingPromoFragment.Q;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1905959288, intValue2, -1, "com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment.onCreateView.<anonymous>.<anonymous> (OnboardingPromoFragment.kt:104)");
                    }
                    onboardingPromoFragment.eo(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                oki0.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 12:
                ohm0 ohm0Var = (ohm0) obj3;
                bim0 bim0Var = (bim0) obj2;
                int i3 = bim0Var.c;
                int i4 = bim0Var.d;
                int i5 = bim0Var.e;
                int i6 = bim0Var.f;
                List<shm0> list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (shm0 shm0Var : list3) {
                    znk0 znk0Var = ohm0Var.d;
                    rhm0 rhm0Var = shm0Var.e;
                    znk0Var.getClass();
                    arrayList2.add(znk0.G(rhm0Var));
                }
                VKList vKList = new VKList(arrayList2);
                vKList.o(i3);
                vKList.l(vKList.size() < i3);
                break;
            case 13:
                DonutVideoUiModel.PreviewBadge previewBadge = (DonutVideoUiModel.PreviewBadge) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                aVar4.K(1396278242);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1396278242, intValue3, -1, "com.vk.catalog.mvi.block.video.impl.video.stackedlist.VideosStackedListViewStateMapper.getPreview.<anonymous>.<anonymous> (VideosStackedListViewStateMapper.kt:151)");
                }
                DonutPriceTemplate donutPriceTemplate = previewBadge.c;
                if (donutPriceTemplate == null) {
                    aVar4.K(-233110844);
                } else {
                    aVar4.K(1793595613);
                    a = z1o.a(donutPriceTemplate, null, aVar4, 1);
                }
                aVar4.j();
                if (a == null) {
                    aVar4.K(1793597725);
                    a = ws2.b(previewBadge.b, aVar4, 0);
                    aVar4.j();
                } else {
                    aVar4.K(1793595028);
                    aVar4.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                break;
            case 14:
                ((Integer) obj2).getClass();
                x7u0.a((Alert$Button) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-206982849, intValue4, -1, "com.vk.core.compose.component.datetime.VkTimePickerDialog.<anonymous>.<anonymous> (VkDateTimePicker.kt:131)");
                    }
                    boolean J = aVar5.J(dateTimePickerState);
                    Object x = aVar5.x();
                    if (J || x == a.C0011a.a) {
                        x = new vpn0(dateTimePickerState, 15);
                        aVar5.R(x);
                    }
                    bqv0.e((gzs) x, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hue(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
