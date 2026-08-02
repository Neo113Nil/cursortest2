package xsna;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.vk.api.generated.apps.dto.AppsActionForMessengerDto;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsGetAttachPickerListResponseDto;
import com.vk.api.generated.apps.dto.AppsGetAttachPickerListTypeDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class o82 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o82(AppsGetAttachPickerListTypeDto appsGetAttachPickerListTypeDto, boolean z, PickerItem.e eVar) {
        this.b = 1;
        this.d = appsGetAttachPickerListTypeDto;
        this.c = z;
        this.e = eVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SurfaceTexture surfaceTexture;
        PickerItem.b bVar;
        PickerItem.c cVar;
        PickerItem.d dVar;
        int i = this.b;
        int i2 = 4;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                f82 f82Var = (f82) obj3;
                izs izsVar = (izs) obj2;
                TextureView textureView = (TextureView) obj;
                if (!q9x.b(0L, 0L) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                    surfaceTexture.setDefaultBufferSize((int) 0, (int) 0);
                }
                f82Var.getClass();
                if (textureView.getSurfaceTextureListener() != f82Var) {
                    izsVar.invoke(f82Var);
                    textureView.setSurfaceTextureListener(f82Var);
                }
                textureView.setOpaque(z);
                textureView.setTransform(null);
                return s3q0.a;
            case 1:
                PickerItem.e eVar = (PickerItem.e) obj2;
                AppsGetAttachPickerListResponseDto appsGetAttachPickerListResponseDto = (AppsGetAttachPickerListResponseDto) obj;
                bpn0 bpn0Var = AppsPickerFragment.V;
                List<AppsActionForMessengerDto> e = appsGetAttachPickerListResponseDto.e();
                List<AppsActionForMessengerDto> d = appsGetAttachPickerListResponseDto.d();
                LinkedHashMap linkedHashMap = PickerItem.a;
                PickerItem.b bVar2 = new PickerItem.b(PickerItem.ItemId.BlockSendHeader.h(), R.string.vk_picker_add_to_chat);
                int i3 = AppsPickerFragment.a.$EnumSwitchMapping$1[((AppsGetAttachPickerListTypeDto) obj3).ordinal()];
                if (i3 == 1) {
                    bVar = new PickerItem.b(PickerItem.ItemId.BlockOpenHeader.h(), R.string.vk_picker_add_from_game);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new PickerItem.b(PickerItem.ItemId.BlockOpenHeader.h(), R.string.vk_picker_add_from_service);
                }
                Collection l = z ? e43.l(eVar, new PickerItem.g(PickerItem.ItemId.BannerSeparator.h())) : EmptyList.b;
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                for (Object obj4 : e) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        e43.t();
                        throw null;
                    }
                    AppsActionForMessengerDto appsActionForMessengerDto = (AppsActionForMessengerDto) obj4;
                    AppsAppDto f = appsActionForMessengerDto.f();
                    if (f == null) {
                        dVar = null;
                    } else {
                        ((ykg) AppsPickerFragment.V.getValue()).getClass();
                        WebApiApplication c = ykg.c(f);
                        dVar = new PickerItem.d(i4, c.d.b, appsActionForMessengerDto.e(), c.c, appsActionForMessengerDto, c);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                    i4 = i5;
                }
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                for (Object obj5 : d) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        e43.t();
                        throw null;
                    }
                    AppsActionForMessengerDto appsActionForMessengerDto2 = (AppsActionForMessengerDto) obj5;
                    int size = arrayList.size() + i6;
                    AppsAppDto f2 = appsActionForMessengerDto2.f();
                    if (f2 == null) {
                        cVar = null;
                    } else {
                        ((ykg) AppsPickerFragment.V.getValue()).getClass();
                        WebApiApplication c2 = ykg.c(f2);
                        cVar = new PickerItem.c(size, c2.d.b, appsActionForMessengerDto2.e(), c2.c, c2);
                    }
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                    i6 = i7;
                }
                boolean z2 = (arrayList.isEmpty() || arrayList2.isEmpty()) ? false : true;
                return j5g.u0(arrayList2, j5g.u0(z2 ? Collections.singletonList(bVar) : EmptyList.b, j5g.u0(arrayList, j5g.u0(z2 ? Collections.singletonList(bVar2) : EmptyList.b, l))));
            case 2:
                nmk0 nmk0Var = (nmk0) obj3;
                String str = (String) obj2;
                it80 it80Var = (it80) obj;
                if (!it80Var.a()) {
                    it80.b.getClass();
                    return io.reactivex.rxjava3.core.q.T(it80.a.a());
                }
                tfx tfxVar = new tfx("video.getCurrentBookmakerAdState", new alb0(9), new sqe0(5));
                tfx.o(tfxVar, "video", str, 0, 0, 12);
                tfxVar.j("is_live", z);
                dz2 x = yfb.x(tfxVar);
                ahn.D(x);
                return new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.l0(x, null, 3).U(new k6c0(new sux(28), 5)), new aad0(new n9w(27), i2)).U(new uxb0(new mmk0(nmk0Var, it80Var, z), i2));
            default:
                vmq0 vmq0Var = (vmq0) obj3;
                j15 j15Var = (j15) obj2;
                if (z) {
                    wmq0.B(vmq0Var, j15Var, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    wmq0.B(vmq0Var, j15Var, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ o82(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    public /* synthetic */ o82(j15 j15Var, vmq0 vmq0Var, boolean z) {
        this.b = 3;
        this.c = z;
        this.d = vmq0Var;
        this.e = j15Var;
    }
}
