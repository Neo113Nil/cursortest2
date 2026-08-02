package com.yandex.go.user_profile.main_menu.profile.repository;

import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment$PlateColor$LinearGradient;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment$PlateColor$Solid;
import com.yandex.go.user_profile.fullscreen.models.e;
import com.yandex.go.user_profile.fullscreen.models.f;
import defpackage.avj0;
import defpackage.fes0;
import defpackage.kdc;
import defpackage.q5z;
import defpackage.scc;
import defpackage.u600;
import defpackage.ufu;
import defpackage.usg0;
import defpackage.v600;
import defpackage.w511;
import defpackage.w600;
import defpackage.zls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class MainMenuUserProfileStatusRepository$getStatusBackgroundStateFlow$1 extends AdaptedFunctionReference implements zls {
    public MainMenuUserProfileStatusRepository$getStatusBackgroundStateFlow$1(d dVar) {
        super(3, dVar, d.class, "takeBackgroundColor", "takeBackgroundColor(Ljava/lang/String;Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment;)Lcom/yandex/go/user_profile/main_menu/profile/presentation/MainMenuUserProfileUiState$StatusPlateBackground;", 4);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserProfileExperiment userProfileExperiment = (UserProfileExperiment) obj2;
        d dVar = (d) this.receiver;
        dVar.getClass();
        f d = d.d(userProfileExperiment, (String) obj);
        if (d == null) {
            d = d.d(userProfileExperiment, "fallback_status");
        }
        if (d instanceof UserProfileExperiment$PlateColor$Solid) {
            kdc b = ((ufu) dVar.e).b(((UserProfileExperiment$PlateColor$Solid) d).a);
            if (b != null) {
                return new w600(b);
            }
        } else if (d instanceof UserProfileExperiment$PlateColor$LinearGradient) {
            UserProfileExperiment$PlateColor$LinearGradient userProfileExperiment$PlateColor$LinearGradient = (UserProfileExperiment$PlateColor$LinearGradient) d;
            List list = userProfileExperiment$PlateColor$LinearGradient.a;
            List list2 = userProfileExperiment$PlateColor$LinearGradient.b;
            if (!list.isEmpty() && list.size() == list2.size()) {
                int[] iArr = new int[list.size()];
                int i = 0;
                for (Object obj4 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    Integer S = q5z.S((String) obj4);
                    if (S != null) {
                        iArr[i] = S.intValue();
                        i = i2;
                    }
                }
                final fes0 fes0Var = new fes0(iArr, kotlin.collections.a.G0(list2), userProfileExperiment$PlateColor$LinearGradient.c);
                float[] fArr = new float[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    fArr[i3] = ((avj0) dVar.f).b(usg0.profile_status_corners);
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: com.yandex.go.user_profile.main_menu.profile.repository.MainMenuUserProfileStatusRepository$parseLinearGradient$2
                    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                    public Shader resize(int width, int height) {
                        fes0.this.a(width, height);
                        return fes0.this.b();
                    }
                });
                return new u600(shapeDrawable);
            }
        } else if (!(d instanceof e) && d != null) {
            w511.b();
            return null;
        }
        return v600.a;
    }
}
