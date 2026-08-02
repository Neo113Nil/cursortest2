package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.tags.dto.TagsAddResponseDto;
import com.vk.api.generated.wall.dto.WallConvertLinkDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.network.kbh.state.NetworkState;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.wwv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bjl0 implements b03, f03, io.reactivex.rxjava3.core.s, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ bjl0(int i) {
        this.b = i;
    }

    public static int a(frv0 frv0Var, int i, int i2) {
        return (frv0Var.hashCode() + i) * i2;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.mx.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, TagsAddResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, Integer.class).getType()).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, WallConvertLinkDto.class).getType()).getType());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.q560, xsna.vwv0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final ?? r0 = new q560() { // from class: xsna.vwv0
            @Override // xsna.q560
            public final void a(NetworkState networkState) {
                int i = wwv0.a.$EnumSwitchMapping$0[networkState.ordinal()];
                int i2 = 1;
                if (i == 1) {
                    i2 = 0;
                } else if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 2;
                }
                io.reactivex.rxjava3.core.r rVar2 = io.reactivex.rxjava3.core.r.this;
                if (rVar2.h()) {
                    return;
                }
                rVar2.onNext(Integer.valueOf(i2));
            }
        };
        d6q0.c(r0);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.twv0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                d6q0.g(vwv0.this);
            }
        });
    }
}
