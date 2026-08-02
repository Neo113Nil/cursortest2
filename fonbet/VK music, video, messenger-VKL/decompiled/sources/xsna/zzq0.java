package xsna;

import android.graphics.Color;
import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsByVideoExtendedResponseDto;
import com.vk.common.api.generated.GsonHolder;
import com.vk.common.api.generated.SingleRootResponseDto;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.voip.OKVoipEngine;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import xsna.l5x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class zzq0 implements io.reactivex.rxjava3.functions.l, b03, f03, io.reactivex.rxjava3.core.s, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ zzq0(int i) {
        this.b = i;
    }

    public static void a(int i, int i2, int i3, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return SubscribeStatus.NO_DATA;
            default:
                return ((l5x0.b) obj).a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, UsersUserFullDto.class).getType()).getType())).a();
            default:
                return (UxpollsGetResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, UxpollsGetResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.o20.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetAlbumsByVideoExtendedResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final m4x0 m4x0Var = new m4x0(rVar);
        rVar.onNext(OKVoipEngine.b.getMediaOptionsForCurrentUser());
        OKVoipEngine.k.o.a.add(m4x0Var);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.w3x0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                OKVoipEngine.b.getClass();
                OKVoipEngine.k.o.a.remove(m4x0.this);
            }
        });
    }

    public /* synthetic */ zzq0(k4x0 k4x0Var) {
        this.b = 5;
    }
}
