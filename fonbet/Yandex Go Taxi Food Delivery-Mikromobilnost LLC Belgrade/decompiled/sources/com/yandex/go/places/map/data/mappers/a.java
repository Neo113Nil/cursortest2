package com.yandex.go.places.map.data.mappers;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.places.map.data.mappers.a;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.MediaDto$VideoMediaDto;
import com.yandex.go.places.models.data.entities.network.c0;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$OrganizationPreviewPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$SocialPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$UniversalPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$PinWarDefaultPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalMPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalSPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.places.models.data.entities.network.map.u;
import com.yandex.go.places.models.data.mappers.f;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.mapkit.geometry.Point;
import defpackage.bo00;
import defpackage.bvf0;
import defpackage.cav;
import defpackage.co00;
import defpackage.cwa1;
import defpackage.dbv;
import defpackage.do00;
import defpackage.eo00;
import defpackage.evu0;
import defpackage.fo00;
import defpackage.fr;
import defpackage.gn00;
import defpackage.hbc0;
import defpackage.hn00;
import defpackage.i3y;
import defpackage.io00;
import defpackage.ixy0;
import defpackage.je10;
import defpackage.jn00;
import defpackage.jo00;
import defpackage.jxy0;
import defpackage.k7v;
import defpackage.me11;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ofc0;
import defpackage.on00;
import defpackage.pav;
import defpackage.pdc;
import defpackage.pn00;
import defpackage.qoh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.vn00;
import defpackage.xn00;
import defpackage.zn00;
import defpackage.zwy0;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final pav b;
    public final dbv c;
    public final jxy0 d;
    public final je10 e;
    public final pdc f;
    public final f g;
    public final c h;
    public final ofc0 i;
    public final com.yandex.go.places.impl.data.repositories.a j;
    public final com.yandex.go.places.impl.data.providers.a k;
    public final i3y l;
    public final i3y m;
    public final i3y n;
    public final i3y o;
    public final i3y p;
    public final i3y q;
    public final i3y r;
    public final i3y s;
    public final i3y t;
    public final i3y u;
    public final i3y v;
    public final i3y w;

    public a(Context context, pav pavVar, dbv dbvVar, jxy0 jxy0Var, je10 je10Var, pdc pdcVar, f fVar, c cVar, ofc0 ofc0Var, com.yandex.go.places.impl.data.repositories.a aVar, com.yandex.go.places.impl.data.providers.a aVar2) {
        this.a = context;
        this.b = pavVar;
        this.c = dbvVar;
        this.d = jxy0Var;
        this.e = je10Var;
        this.f = pdcVar;
        this.g = fVar;
        this.h = cVar;
        this.i = ofc0Var;
        this.j = aVar;
        this.k = aVar2;
        final int i = 0;
        this.l = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i2 = i;
                a aVar3 = this.b;
                switch (i2) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i2 = 5;
        this.m = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i2;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i3 = 6;
        this.n = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i3;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i4 = 7;
        this.o = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i4;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i5 = 8;
        this.p = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i5;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i6 = 9;
        this.q = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i6;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i7 = 10;
        this.r = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i7;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i8 = 11;
        this.s = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i8;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i9 = 1;
        this.t = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i9;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i10 = 2;
        this.u = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i10;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i11 = 3;
        this.v = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i11;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i12 = 4;
        this.w = kotlin.a.a(new sls(this) { // from class: nn00
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i12;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(eug0.discovery_map_pin_image_icon_size, aVar3.a);
                        break;
                    case 1:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_width, aVar3.a);
                        break;
                    case 2:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_image_height, aVar3.a);
                        break;
                    case 3:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_l_badge_image_size, aVar3.a);
                        break;
                    case 4:
                        r = tje.r(eug0.discovery_map_pin_war_style_supermap_m_image_size, aVar3.a);
                        break;
                    case 5:
                        r = tje.r(eug0.discovery_map_pin_war_pin_s, aVar3.a);
                        break;
                    case 6:
                        r = tje.r(eug0.discovery_map_pin_war_pin_selected, aVar3.a);
                        break;
                    case 7:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m, aVar3.a);
                        break;
                    case 8:
                        r = tje.r(eug0.discovery_map_pin_war_pin_m_small, aVar3.a);
                        break;
                    case 9:
                        r = tje.r(eug0.discovery_map_pin_war_badge_m, aVar3.a);
                        break;
                    case 10:
                        r = tje.r(eug0.discovery_map_pin_war_badge_l, aVar3.a);
                        break;
                    default:
                        r = tje.r(eug0.discovery_map_pin_war_style_l_overlay_icon_size, aVar3.a);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, tse tseVar, MapObjectItemDto$OrganizationPreviewPinDto mapObjectItemDto$OrganizationPreviewPinDto, hbc0 hbc0Var, me11 me11Var, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapOrganizationPreviewPin$1 mapObjectItemMapper$mapOrganizationPreviewPin$1;
        int i;
        me11 me11Var2;
        tse tseVar2;
        MapObjectItemDto$OrganizationPreviewPinDto mapObjectItemDto$OrganizationPreviewPinDto2;
        noh nohVar;
        fo00 fo00Var;
        fo00 fo00Var2;
        noh nohVar2;
        fo00 fo00Var3;
        MapObjectItemDto$OrganizationPreviewPinDto mapObjectItemDto$OrganizationPreviewPinDto3;
        me11 me11Var3;
        noh nohVar3;
        noh nohVar4;
        Bitmap bitmap;
        Bitmap bitmap2;
        fo00 fo00Var4;
        zwy0 zwy0Var;
        double doubleValue;
        Object k;
        Point point;
        zwy0 zwy0Var2;
        fr frVar;
        String str;
        fr frVar2;
        Bitmap bitmap3;
        aVar.getClass();
        i3y i3yVar = aVar.l;
        if (continuationImpl instanceof MapObjectItemMapper$mapOrganizationPreviewPin$1) {
            mapObjectItemMapper$mapOrganizationPreviewPin$1 = (MapObjectItemMapper$mapOrganizationPreviewPin$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapOrganizationPreviewPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapOrganizationPreviewPin$1.label = i2 - Integer.MIN_VALUE;
                MapObjectItemMapper$mapOrganizationPreviewPin$1 mapObjectItemMapper$mapOrganizationPreviewPin$12 = mapObjectItemMapper$mapOrganizationPreviewPin$1;
                Object obj = mapObjectItemMapper$mapOrganizationPreviewPin$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapOrganizationPreviewPin$12.label;
                if (i != 0) {
                    b.b(obj);
                    qoh h = tje.h(tseVar, null, null, new MapObjectItemMapper$mapOrganizationPreviewPin$iconLabelSelectedDeferred$1(mapObjectItemDto$OrganizationPreviewPinDto, aVar, hbc0Var, null), 3);
                    MapObjectPinStyleDto$PinWarDefaultPinStyleDto mapObjectPinStyleDto$PinWarDefaultPinStyleDto = mapObjectItemDto$OrganizationPreviewPinDto.f;
                    if (mapObjectPinStyleDto$PinWarDefaultPinStyleDto != null) {
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$0 = tseVar;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1 = mapObjectItemDto$OrganizationPreviewPinDto;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$2 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3 = me11Var;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4 = h;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.label = 1;
                        obj = bvf0.n(new MapObjectItemMapper$mapPinStyle$2(mapObjectPinStyleDto$PinWarDefaultPinStyleDto, aVar, hbc0Var, false, null), mapObjectItemMapper$mapOrganizationPreviewPin$12);
                        if (obj != coroutineSingletons) {
                            me11Var2 = me11Var;
                            tseVar2 = tseVar;
                            mapObjectItemDto$OrganizationPreviewPinDto2 = mapObjectItemDto$OrganizationPreviewPinDto;
                            nohVar = h;
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                if (i != 1) {
                    if (i == 2) {
                        nohVar4 = (noh) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$8;
                        fo00Var3 = (fo00) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5;
                        nohVar3 = (noh) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4;
                        me11Var3 = (me11) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3;
                        mapObjectItemDto$OrganizationPreviewPinDto3 = (MapObjectItemDto$OrganizationPreviewPinDto) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1;
                        b.b(obj);
                        bitmap = (Bitmap) obj;
                        if (bitmap != null) {
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$0 = null;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1 = mapObjectItemDto$OrganizationPreviewPinDto3;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$2 = null;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3 = me11Var3;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4 = nohVar3;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5 = fo00Var3;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$6 = null;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$7 = null;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$8 = null;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$9 = null;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.L$10 = bitmap;
                            mapObjectItemMapper$mapOrganizationPreviewPin$12.label = 3;
                            Object k2 = nohVar4.k(mapObjectItemMapper$mapOrganizationPreviewPin$12);
                            if (k2 != coroutineSingletons) {
                                bitmap2 = bitmap;
                                obj = k2;
                                fo00Var4 = fo00Var3;
                                zwy0Var = new zwy0(bitmap2, (Bitmap) obj);
                                String str2 = mapObjectItemDto$OrganizationPreviewPinDto3.a;
                                Point d = cwa1.d(mapObjectItemDto$OrganizationPreviewPinDto3.b);
                                Double d2 = mapObjectItemDto$OrganizationPreviewPinDto3.c;
                                if (d2 != null) {
                                }
                                fr frVar3 = me11Var3.b;
                                fr frVar4 = me11Var3.a;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$0 = null;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1 = null;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$2 = null;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3 = null;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4 = null;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5 = fo00Var4;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$6 = zwy0Var;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$7 = str2;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$8 = d;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$9 = frVar3;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.L$10 = frVar4;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.D$0 = doubleValue;
                                mapObjectItemMapper$mapOrganizationPreviewPin$12.label = 5;
                                k = nohVar3.k(mapObjectItemMapper$mapOrganizationPreviewPin$12);
                                if (k != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        return null;
                    }
                    if (i == 3) {
                        bitmap2 = (Bitmap) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$10;
                        fo00Var3 = (fo00) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5;
                        nohVar3 = (noh) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4;
                        me11Var3 = (me11) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3;
                        mapObjectItemDto$OrganizationPreviewPinDto3 = (MapObjectItemDto$OrganizationPreviewPinDto) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1;
                        b.b(obj);
                        fo00Var4 = fo00Var3;
                        zwy0Var = new zwy0(bitmap2, (Bitmap) obj);
                        String str22 = mapObjectItemDto$OrganizationPreviewPinDto3.a;
                        Point d3 = cwa1.d(mapObjectItemDto$OrganizationPreviewPinDto3.b);
                        Double d22 = mapObjectItemDto$OrganizationPreviewPinDto3.c;
                        if (d22 != null) {
                        }
                        fr frVar32 = me11Var3.b;
                        fr frVar42 = me11Var3.a;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$0 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$2 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5 = fo00Var4;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$6 = zwy0Var;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$7 = str22;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$8 = d3;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$9 = frVar32;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$10 = frVar42;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.D$0 = doubleValue;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.label = 5;
                        k = nohVar3.k(mapObjectItemMapper$mapOrganizationPreviewPin$12);
                        if (k != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        doubleValue = mapObjectItemMapper$mapOrganizationPreviewPin$12.D$0;
                        fr frVar5 = (fr) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$10;
                        fr frVar6 = (fr) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$9;
                        Point point2 = (Point) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$8;
                        String str3 = (String) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$7;
                        zwy0 zwy0Var3 = (zwy0) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$6;
                        fo00Var4 = (fo00) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5;
                        b.b(obj);
                        zwy0Var2 = zwy0Var3;
                        frVar = frVar5;
                        point = point2;
                        str = str3;
                        frVar2 = frVar6;
                        return new gn00(str, point, doubleValue, frVar2, frVar, (fo00) obj, fo00Var4, zwy0Var2);
                    }
                    fo00Var2 = (fo00) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5;
                    nohVar2 = (noh) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4;
                    me11Var2 = (me11) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3;
                    mapObjectItemDto$OrganizationPreviewPinDto2 = (MapObjectItemDto$OrganizationPreviewPinDto) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1;
                    b.b(obj);
                    bitmap3 = (Bitmap) obj;
                    if (bitmap3 != null) {
                        fo00Var4 = fo00Var2;
                        zwy0Var = new zwy0(bitmap3, null);
                        mapObjectItemDto$OrganizationPreviewPinDto3 = mapObjectItemDto$OrganizationPreviewPinDto2;
                        me11Var3 = me11Var2;
                        nohVar3 = nohVar2;
                        String str222 = mapObjectItemDto$OrganizationPreviewPinDto3.a;
                        Point d32 = cwa1.d(mapObjectItemDto$OrganizationPreviewPinDto3.b);
                        Double d222 = mapObjectItemDto$OrganizationPreviewPinDto3.c;
                        doubleValue = d222 != null ? d222.doubleValue() : 0.0d;
                        fr frVar322 = me11Var3.b;
                        fr frVar422 = me11Var3.a;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$0 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$2 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5 = fo00Var4;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$6 = zwy0Var;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$7 = str222;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$8 = d32;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$9 = frVar322;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$10 = frVar422;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.D$0 = doubleValue;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.label = 5;
                        k = nohVar3.k(mapObjectItemMapper$mapOrganizationPreviewPin$12);
                        if (k != coroutineSingletons) {
                            point = d32;
                            obj = k;
                            zwy0Var2 = zwy0Var;
                            frVar = frVar422;
                            str = str222;
                            frVar2 = frVar322;
                            return new gn00(str, point, doubleValue, frVar2, frVar, (fo00) obj, fo00Var4, zwy0Var2);
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                nohVar = (noh) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4;
                me11Var2 = (me11) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3;
                mapObjectItemDto$OrganizationPreviewPinDto2 = (MapObjectItemDto$OrganizationPreviewPinDto) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1;
                tseVar2 = (tse) mapObjectItemMapper$mapOrganizationPreviewPin$12.L$0;
                b.b(obj);
                fo00Var = (fo00) obj;
                if (fo00Var != null) {
                    if (fo00Var instanceof vn00) {
                        vn00 vn00Var = (vn00) fo00Var;
                        ixy0 ixy0Var = vn00Var.f;
                        if (ixy0Var == null) {
                            ixy0Var = vn00Var.c;
                        }
                        k7v a = ixy0Var.a(ThemeType.LIGHT);
                        qoh k3 = aVar.k(tseVar2, a != null ? a.a : null, ((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                        k7v a2 = ixy0Var.a(ThemeType.DARK);
                        qoh k4 = aVar.k(tseVar2, a2 != null ? a2.a : null, ((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$0 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1 = mapObjectItemDto$OrganizationPreviewPinDto2;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$2 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3 = me11Var2;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4 = nohVar;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5 = fo00Var;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$6 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$7 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$8 = k4;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.label = 2;
                        Object s = k3.s(mapObjectItemMapper$mapOrganizationPreviewPin$12);
                        if (s != coroutineSingletons) {
                            fo00Var3 = fo00Var;
                            obj = s;
                            mapObjectItemDto$OrganizationPreviewPinDto3 = mapObjectItemDto$OrganizationPreviewPinDto2;
                            me11Var3 = me11Var2;
                            nohVar3 = nohVar;
                            nohVar4 = k4;
                            bitmap = (Bitmap) obj;
                            if (bitmap != null) {
                            }
                        }
                    } else {
                        qoh h2 = tje.h(tseVar2, null, null, new MapObjectItemMapper$loadPinImageAsync$1(fo00Var, aVar, null), 3);
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$0 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$1 = mapObjectItemDto$OrganizationPreviewPinDto2;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$2 = null;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$3 = me11Var2;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$4 = nohVar;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.L$5 = fo00Var;
                        mapObjectItemMapper$mapOrganizationPreviewPin$12.label = 4;
                        Object s2 = h2.s(mapObjectItemMapper$mapOrganizationPreviewPin$12);
                        if (s2 != coroutineSingletons) {
                            noh nohVar5 = nohVar;
                            fo00Var2 = fo00Var;
                            obj = s2;
                            nohVar2 = nohVar5;
                            bitmap3 = (Bitmap) obj;
                            if (bitmap3 != null) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        mapObjectItemMapper$mapOrganizationPreviewPin$1 = new MapObjectItemMapper$mapOrganizationPreviewPin$1(aVar, continuationImpl);
        MapObjectItemMapper$mapOrganizationPreviewPin$1 mapObjectItemMapper$mapOrganizationPreviewPin$122 = mapObjectItemMapper$mapOrganizationPreviewPin$1;
        Object obj2 = mapObjectItemMapper$mapOrganizationPreviewPin$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapOrganizationPreviewPin$122.label;
        if (i != 0) {
        }
        fo00Var = (fo00) obj2;
        if (fo00Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, tse tseVar, MapObjectPinStyleDto$PinWarDefaultPinStyleDto mapObjectPinStyleDto$PinWarDefaultPinStyleDto, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapPinWarDefaultPinStyle$1 mapObjectItemMapper$mapPinWarDefaultPinStyle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        noh h;
        ixy0 ixy0Var;
        Object k;
        CharSequence charSequence;
        pdc pdcVar = aVar.f;
        jxy0 jxy0Var = aVar.d;
        if (continuationImpl instanceof MapObjectItemMapper$mapPinWarDefaultPinStyle$1) {
            mapObjectItemMapper$mapPinWarDefaultPinStyle$1 = (MapObjectItemMapper$mapPinWarDefaultPinStyle$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapPinWarDefaultPinStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapPinWarDefaultPinStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectItemMapper$mapPinWarDefaultPinStyle$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapPinWarDefaultPinStyle$1.label;
                if (i != 0) {
                    b.b(obj);
                    ixy0 b = jxy0Var.b(mapObjectPinStyleDto$PinWarDefaultPinStyleDto.c);
                    if (b == null) {
                        return null;
                    }
                    qoh h2 = tje.h(tseVar, null, null, new MapObjectItemMapper$mapPinWarDefaultPinStyle$title$1(mapObjectPinStyleDto$PinWarDefaultPinStyleDto, aVar, null), 3);
                    h = tje.h(tseVar, null, null, new MapObjectItemMapper$mapPinWarDefaultPinStyle$subtitle$1(mapObjectPinStyleDto$PinWarDefaultPinStyleDto, aVar, null), 3);
                    mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$0 = null;
                    mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$1 = mapObjectPinStyleDto$PinWarDefaultPinStyleDto;
                    mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$2 = b;
                    mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$3 = null;
                    mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$4 = h;
                    mapObjectItemMapper$mapPinWarDefaultPinStyle$1.label = 1;
                    Object s = h2.s(mapObjectItemMapper$mapPinWarDefaultPinStyle$1);
                    if (s != coroutineSingletons) {
                        obj = s;
                        ixy0Var = b;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence2 = (CharSequence) mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$5;
                    ixy0Var = (ixy0) mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$2;
                    mapObjectPinStyleDto$PinWarDefaultPinStyleDto = (MapObjectPinStyleDto$PinWarDefaultPinStyleDto) mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$1;
                    b.b(obj);
                    charSequence = charSequence2;
                    ufu ufuVar = (ufu) pdcVar;
                    return new vn00(charSequence, (CharSequence) obj, ixy0Var, ufuVar.b(mapObjectPinStyleDto$PinWarDefaultPinStyleDto.d), ufuVar.b(mapObjectPinStyleDto$PinWarDefaultPinStyleDto.d), jxy0Var.b(mapObjectPinStyleDto$PinWarDefaultPinStyleDto.e));
                }
                h = (noh) mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$4;
                ixy0Var = (ixy0) mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$2;
                mapObjectPinStyleDto$PinWarDefaultPinStyleDto = (MapObjectPinStyleDto$PinWarDefaultPinStyleDto) mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$1;
                b.b(obj);
                CharSequence charSequence3 = (CharSequence) obj;
                mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$0 = null;
                mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$1 = mapObjectPinStyleDto$PinWarDefaultPinStyleDto;
                mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$2 = ixy0Var;
                mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$3 = null;
                mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$4 = null;
                mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$5 = charSequence3;
                mapObjectItemMapper$mapPinWarDefaultPinStyle$1.label = 2;
                k = h.k(mapObjectItemMapper$mapPinWarDefaultPinStyle$1);
                if (k != coroutineSingletons) {
                    charSequence = charSequence3;
                    obj = k;
                    ufu ufuVar2 = (ufu) pdcVar;
                    return new vn00(charSequence, (CharSequence) obj, ixy0Var, ufuVar2.b(mapObjectPinStyleDto$PinWarDefaultPinStyleDto.d), ufuVar2.b(mapObjectPinStyleDto$PinWarDefaultPinStyleDto.d), jxy0Var.b(mapObjectPinStyleDto$PinWarDefaultPinStyleDto.e));
                }
                return coroutineSingletons;
            }
        }
        mapObjectItemMapper$mapPinWarDefaultPinStyle$1 = new MapObjectItemMapper$mapPinWarDefaultPinStyle$1(aVar, continuationImpl);
        Object obj2 = mapObjectItemMapper$mapPinWarDefaultPinStyle$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapPinWarDefaultPinStyle$1.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$0 = null;
        mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$1 = mapObjectPinStyleDto$PinWarDefaultPinStyleDto;
        mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$2 = ixy0Var;
        mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$3 = null;
        mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$4 = null;
        mapObjectItemMapper$mapPinWarDefaultPinStyle$1.L$5 = charSequence32;
        mapObjectItemMapper$mapPinWarDefaultPinStyle$1.label = 2;
        k = h.k(mapObjectItemMapper$mapPinWarDefaultPinStyle$1);
        if (k != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        if (r0 == r8) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, tse tseVar, MapObjectItemDto$SocialPinDto mapObjectItemDto$SocialPinDto, hbc0 hbc0Var, me11 me11Var, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapSocialPin$1 mapObjectItemMapper$mapSocialPin$1;
        int i;
        me11 me11Var2;
        tse tseVar2;
        MapObjectItemDto$SocialPinDto mapObjectItemDto$SocialPinDto2;
        fo00 fo00Var;
        String str;
        Point d;
        double doubleValue;
        fr frVar;
        fr frVar2;
        aVar.getClass();
        if (continuationImpl instanceof MapObjectItemMapper$mapSocialPin$1) {
            mapObjectItemMapper$mapSocialPin$1 = (MapObjectItemMapper$mapSocialPin$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapSocialPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapSocialPin$1.label = i2 - Integer.MIN_VALUE;
                MapObjectItemMapper$mapSocialPin$1 mapObjectItemMapper$mapSocialPin$12 = mapObjectItemMapper$mapSocialPin$1;
                Object obj = mapObjectItemMapper$mapSocialPin$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapSocialPin$12.label;
                if (i != 0) {
                    b.b(obj);
                    u uVar = mapObjectItemDto$SocialPinDto.e;
                    mapObjectItemMapper$mapSocialPin$12.L$0 = tseVar;
                    mapObjectItemMapper$mapSocialPin$12.L$1 = mapObjectItemDto$SocialPinDto;
                    mapObjectItemMapper$mapSocialPin$12.L$2 = null;
                    me11Var2 = me11Var;
                    mapObjectItemMapper$mapSocialPin$12.L$3 = me11Var2;
                    mapObjectItemMapper$mapSocialPin$12.label = 1;
                    obj = bvf0.n(new MapObjectItemMapper$mapPinStyle$2(uVar, aVar, hbc0Var, false, null), mapObjectItemMapper$mapSocialPin$12);
                    if (obj != coroutineSingletons) {
                        tseVar2 = tseVar;
                        mapObjectItemDto$SocialPinDto2 = mapObjectItemDto$SocialPinDto;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    doubleValue = mapObjectItemMapper$mapSocialPin$12.D$0;
                    frVar2 = (fr) mapObjectItemMapper$mapSocialPin$12.L$9;
                    frVar = (fr) mapObjectItemMapper$mapSocialPin$12.L$8;
                    d = (Point) mapObjectItemMapper$mapSocialPin$12.L$7;
                    str = (String) mapObjectItemMapper$mapSocialPin$12.L$6;
                    b.b(obj);
                    return new jn00(str, d, doubleValue, frVar, frVar2, (Bitmap) obj);
                }
                me11 me11Var3 = (me11) mapObjectItemMapper$mapSocialPin$12.L$3;
                mapObjectItemDto$SocialPinDto2 = (MapObjectItemDto$SocialPinDto) mapObjectItemMapper$mapSocialPin$12.L$1;
                tse tseVar3 = (tse) mapObjectItemMapper$mapSocialPin$12.L$0;
                b.b(obj);
                me11Var2 = me11Var3;
                tseVar2 = tseVar3;
                fo00Var = (fo00) obj;
                if (fo00Var != null) {
                    return null;
                }
                qoh h = tje.h(tseVar2, null, null, new MapObjectItemMapper$loadPinImageAsync$1(fo00Var, aVar, null), 3);
                str = mapObjectItemDto$SocialPinDto2.a;
                d = cwa1.d(mapObjectItemDto$SocialPinDto2.b);
                Double d2 = mapObjectItemDto$SocialPinDto2.c;
                doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                frVar = me11Var2.b;
                frVar2 = me11Var2.a;
                mapObjectItemMapper$mapSocialPin$12.L$0 = null;
                mapObjectItemMapper$mapSocialPin$12.L$1 = null;
                mapObjectItemMapper$mapSocialPin$12.L$2 = null;
                mapObjectItemMapper$mapSocialPin$12.L$3 = null;
                mapObjectItemMapper$mapSocialPin$12.L$4 = null;
                mapObjectItemMapper$mapSocialPin$12.L$5 = null;
                mapObjectItemMapper$mapSocialPin$12.L$6 = str;
                mapObjectItemMapper$mapSocialPin$12.L$7 = d;
                mapObjectItemMapper$mapSocialPin$12.L$8 = frVar;
                mapObjectItemMapper$mapSocialPin$12.L$9 = frVar2;
                mapObjectItemMapper$mapSocialPin$12.D$0 = doubleValue;
                mapObjectItemMapper$mapSocialPin$12.label = 2;
                obj = h.s(mapObjectItemMapper$mapSocialPin$12);
            }
        }
        mapObjectItemMapper$mapSocialPin$1 = new MapObjectItemMapper$mapSocialPin$1(aVar, continuationImpl);
        MapObjectItemMapper$mapSocialPin$1 mapObjectItemMapper$mapSocialPin$122 = mapObjectItemMapper$mapSocialPin$1;
        Object obj2 = mapObjectItemMapper$mapSocialPin$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapSocialPin$122.label;
        if (i != 0) {
        }
        fo00Var = (fo00) obj2;
        if (fo00Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(a aVar, tse tseVar, hbc0 hbc0Var, io00 io00Var, boolean z, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapSupermapUniversalLPinStyle$1 mapObjectItemMapper$mapSupermapUniversalLPinStyle$1;
        int i;
        io00 io00Var2;
        on00 on00Var;
        aVar.getClass();
        if (continuationImpl instanceof MapObjectItemMapper$mapSupermapUniversalLPinStyle$1) {
            mapObjectItemMapper$mapSupermapUniversalLPinStyle$1 = (MapObjectItemMapper$mapSupermapUniversalLPinStyle$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapSupermapUniversalLPinStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapSupermapUniversalLPinStyle$1.label = i2 - Integer.MIN_VALUE;
                MapObjectItemMapper$mapSupermapUniversalLPinStyle$1 mapObjectItemMapper$mapSupermapUniversalLPinStyle$12 = mapObjectItemMapper$mapSupermapUniversalLPinStyle$1;
                Object obj = mapObjectItemMapper$mapSupermapUniversalLPinStyle$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapSupermapUniversalLPinStyle$12.label;
                if (i != 0) {
                    b.b(obj);
                    ImageDto a = io00Var.getA();
                    List b = io00Var.getB();
                    FormattedText c = io00Var.getC();
                    FormattedText d = io00Var.getD();
                    int intValue = ((Number) aVar.t.getValue()).intValue();
                    int intValue2 = ((Number) aVar.u.getValue()).intValue();
                    int intValue3 = ((Number) aVar.v.getValue()).intValue();
                    mapObjectItemMapper$mapSupermapUniversalLPinStyle$12.L$0 = null;
                    mapObjectItemMapper$mapSupermapUniversalLPinStyle$12.L$1 = null;
                    io00Var2 = io00Var;
                    mapObjectItemMapper$mapSupermapUniversalLPinStyle$12.L$2 = io00Var2;
                    mapObjectItemMapper$mapSupermapUniversalLPinStyle$12.Z$0 = z;
                    mapObjectItemMapper$mapSupermapUniversalLPinStyle$12.label = 1;
                    obj = aVar.l(tseVar, hbc0Var, a, b, c, d, z, intValue, intValue2, intValue3, mapObjectItemMapper$mapSupermapUniversalLPinStyle$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    io00 io00Var3 = (io00) mapObjectItemMapper$mapSupermapUniversalLPinStyle$12.L$2;
                    b.b(obj);
                    io00Var2 = io00Var3;
                }
                on00Var = (on00) obj;
                if (on00Var != null) {
                    return null;
                }
                return new xn00(on00Var.b, on00Var.c, on00Var.e, on00Var.f, io00Var2.b());
            }
        }
        mapObjectItemMapper$mapSupermapUniversalLPinStyle$1 = new MapObjectItemMapper$mapSupermapUniversalLPinStyle$1(aVar, continuationImpl);
        MapObjectItemMapper$mapSupermapUniversalLPinStyle$1 mapObjectItemMapper$mapSupermapUniversalLPinStyle$122 = mapObjectItemMapper$mapSupermapUniversalLPinStyle$1;
        Object obj3 = mapObjectItemMapper$mapSupermapUniversalLPinStyle$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapSupermapUniversalLPinStyle$122.label;
        if (i != 0) {
        }
        on00Var = (on00) obj3;
        if (on00Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(a aVar, tse tseVar, hbc0 hbc0Var, jo00 jo00Var, boolean z, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1 mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1;
        a aVar2;
        int i;
        jo00 jo00Var2;
        Object m;
        pn00 pn00Var;
        aVar.getClass();
        if (continuationImpl instanceof MapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1) {
            mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1 = (MapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1.label = i2 - Integer.MIN_VALUE;
                aVar2 = aVar;
                MapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1 mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12 = mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1;
                Object obj = mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12.label;
                if (i != 0) {
                    b.b(obj);
                    ImageDto a = jo00Var.getA();
                    FormattedText b = jo00Var.getB();
                    FormattedText c = jo00Var.getC();
                    int j = aVar2.j();
                    int j2 = aVar2.j();
                    int j3 = aVar2.j();
                    mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12.L$0 = null;
                    mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12.L$1 = null;
                    jo00Var2 = jo00Var;
                    mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12.L$2 = jo00Var2;
                    mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12.Z$0 = z;
                    mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12.label = 1;
                    m = aVar2.m(tseVar, hbc0Var, a, null, b, c, z, j, j2, j3, true, mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12);
                    if (m == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jo00 jo00Var3 = (jo00) mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$12.L$2;
                    b.b(obj);
                    m = obj;
                    jo00Var2 = jo00Var3;
                }
                pn00Var = (pn00) m;
                if (pn00Var != null) {
                    return null;
                }
                return new zn00(pn00Var.b, pn00Var.d, pn00Var.e, jo00Var2.b());
            }
        }
        aVar2 = aVar;
        mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1 = new MapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1(aVar2, continuationImpl);
        MapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1 mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$122 = mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$1;
        Object obj2 = mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapSupermapUniversalMFallbackPinStyle$122.label;
        if (i != 0) {
        }
        pn00Var = (pn00) m;
        if (pn00Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(a aVar, tse tseVar, MapObjectPinStyleDto$UniversalMPinStyleDto mapObjectPinStyleDto$UniversalMPinStyleDto, hbc0 hbc0Var, boolean z, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapUniversalMPinStyle$1 mapObjectItemMapper$mapUniversalMPinStyle$1;
        int i;
        pn00 pn00Var;
        aVar.getClass();
        if (continuationImpl instanceof MapObjectItemMapper$mapUniversalMPinStyle$1) {
            mapObjectItemMapper$mapUniversalMPinStyle$1 = (MapObjectItemMapper$mapUniversalMPinStyle$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapUniversalMPinStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapUniversalMPinStyle$1.label = i2 - Integer.MIN_VALUE;
                MapObjectItemMapper$mapUniversalMPinStyle$1 mapObjectItemMapper$mapUniversalMPinStyle$12 = mapObjectItemMapper$mapUniversalMPinStyle$1;
                Object obj = mapObjectItemMapper$mapUniversalMPinStyle$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapUniversalMPinStyle$12.label;
                if (i != 0) {
                    b.b(obj);
                    ImageDto imageDto = mapObjectPinStyleDto$UniversalMPinStyleDto.b;
                    ImageDto imageDto2 = mapObjectPinStyleDto$UniversalMPinStyleDto.a;
                    FormattedText formattedText = mapObjectPinStyleDto$UniversalMPinStyleDto.c;
                    FormattedText formattedText2 = mapObjectPinStyleDto$UniversalMPinStyleDto.d;
                    int intValue = ((Number) aVar.o.getValue()).intValue();
                    int intValue2 = ((Number) aVar.p.getValue()).intValue();
                    int intValue3 = ((Number) aVar.q.getValue()).intValue();
                    mapObjectItemMapper$mapUniversalMPinStyle$12.L$0 = null;
                    mapObjectItemMapper$mapUniversalMPinStyle$12.L$1 = null;
                    mapObjectItemMapper$mapUniversalMPinStyle$12.L$2 = null;
                    mapObjectItemMapper$mapUniversalMPinStyle$12.Z$0 = z;
                    mapObjectItemMapper$mapUniversalMPinStyle$12.label = 1;
                    obj = aVar.m(tseVar, hbc0Var, imageDto, imageDto2, formattedText, formattedText2, z, intValue, intValue2, intValue3, false, mapObjectItemMapper$mapUniversalMPinStyle$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                pn00Var = (pn00) obj;
                if (pn00Var != null) {
                    return null;
                }
                return new co00(pn00Var.a, pn00Var.b, pn00Var.c, pn00Var.d, pn00Var.e, pn00Var.f);
            }
        }
        mapObjectItemMapper$mapUniversalMPinStyle$1 = new MapObjectItemMapper$mapUniversalMPinStyle$1(aVar, continuationImpl);
        MapObjectItemMapper$mapUniversalMPinStyle$1 mapObjectItemMapper$mapUniversalMPinStyle$122 = mapObjectItemMapper$mapUniversalMPinStyle$1;
        Object obj3 = mapObjectItemMapper$mapUniversalMPinStyle$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapUniversalMPinStyle$122.label;
        if (i != 0) {
        }
        pn00Var = (pn00) obj3;
        if (pn00Var != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r3v11, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(a aVar, tse tseVar, MapObjectItemDto$UniversalPinDto mapObjectItemDto$UniversalPinDto, hbc0 hbc0Var, me11 me11Var, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapUniversalPin$1 mapObjectItemMapper$mapUniversalPin$1;
        a aVar2;
        int i;
        MapObjectItemDto$UniversalPinDto mapObjectItemDto$UniversalPinDto2;
        qoh h;
        me11 me11Var2;
        boolean z;
        Object s;
        noh nohVar;
        int i2;
        fo00 fo00Var;
        double doubleValue;
        fr frVar;
        Point point;
        String str;
        fr frVar2;
        fo00 fo00Var2;
        int i3;
        Object k;
        fo00 fo00Var3;
        String str2;
        fr frVar3;
        fr frVar4;
        Point point2;
        double d;
        fo00 fo00Var4;
        aVar.getClass();
        if (continuationImpl instanceof MapObjectItemMapper$mapUniversalPin$1) {
            mapObjectItemMapper$mapUniversalPin$1 = (MapObjectItemMapper$mapUniversalPin$1) continuationImpl;
            int i4 = mapObjectItemMapper$mapUniversalPin$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapUniversalPin$1.label = i4 - Integer.MIN_VALUE;
                aVar2 = aVar;
                MapObjectItemMapper$mapUniversalPin$1 mapObjectItemMapper$mapUniversalPin$12 = mapObjectItemMapper$mapUniversalPin$1;
                Object obj = mapObjectItemMapper$mapUniversalPin$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapUniversalPin$12.label;
                if (i != 0) {
                    b.b(obj);
                    Boolean bool = mapObjectItemDto$UniversalPinDto.e;
                    ?? booleanValue = bool != null ? bool.booleanValue() : 0;
                    qoh h2 = tje.h(tseVar, null, null, new MapObjectItemMapper$mapUniversalPin$defaultStyleDeferred$1(hbc0Var, aVar2, mapObjectItemDto$UniversalPinDto, null, booleanValue), 3);
                    mapObjectItemDto$UniversalPinDto2 = mapObjectItemDto$UniversalPinDto;
                    h = tje.h(tseVar, null, null, new MapObjectItemMapper$mapUniversalPin$dustStyleDeferred$1(hbc0Var, aVar, mapObjectItemDto$UniversalPinDto2, null, booleanValue), 3);
                    qoh h3 = tje.h(tseVar, null, null, new MapObjectItemMapper$mapUniversalPin$selectedStyleDeferred$1(hbc0Var, aVar, mapObjectItemDto$UniversalPinDto2, null, booleanValue), 3);
                    mapObjectItemMapper$mapUniversalPin$12.L$0 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$1 = mapObjectItemDto$UniversalPinDto2;
                    mapObjectItemMapper$mapUniversalPin$12.L$2 = null;
                    me11Var2 = me11Var;
                    mapObjectItemMapper$mapUniversalPin$12.L$3 = me11Var2;
                    mapObjectItemMapper$mapUniversalPin$12.L$4 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$5 = h;
                    mapObjectItemMapper$mapUniversalPin$12.L$6 = h3;
                    mapObjectItemMapper$mapUniversalPin$12.I$0 = booleanValue;
                    z = true;
                    mapObjectItemMapper$mapUniversalPin$12.label = 1;
                    s = h2.s(mapObjectItemMapper$mapUniversalPin$12);
                    if (s != coroutineSingletons) {
                        nohVar = h3;
                        i2 = booleanValue;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = mapObjectItemMapper$mapUniversalPin$12.I$1;
                        double d2 = mapObjectItemMapper$mapUniversalPin$12.D$0;
                        fo00 fo00Var5 = (fo00) mapObjectItemMapper$mapUniversalPin$12.L$13;
                        fo00 fo00Var6 = (fo00) mapObjectItemMapper$mapUniversalPin$12.L$12;
                        fr frVar5 = (fr) mapObjectItemMapper$mapUniversalPin$12.L$11;
                        frVar3 = (fr) mapObjectItemMapper$mapUniversalPin$12.L$10;
                        Point point3 = (Point) mapObjectItemMapper$mapUniversalPin$12.L$9;
                        String str3 = (String) mapObjectItemMapper$mapUniversalPin$12.L$8;
                        b.b(obj);
                        frVar4 = frVar5;
                        d = d2;
                        z = true;
                        fo00Var3 = fo00Var5;
                        str2 = str3;
                        fo00Var4 = fo00Var6;
                        point2 = point3;
                        return new hn00(str2, point2, d, frVar3, frVar4, i2 == 0 ? z : false, fo00Var4, fo00Var3, (fo00) obj);
                    }
                    i2 = mapObjectItemMapper$mapUniversalPin$12.I$1;
                    double d3 = mapObjectItemMapper$mapUniversalPin$12.D$0;
                    int i5 = mapObjectItemMapper$mapUniversalPin$12.I$0;
                    fr frVar6 = (fr) mapObjectItemMapper$mapUniversalPin$12.L$11;
                    fr frVar7 = (fr) mapObjectItemMapper$mapUniversalPin$12.L$10;
                    point = (Point) mapObjectItemMapper$mapUniversalPin$12.L$9;
                    String str4 = (String) mapObjectItemMapper$mapUniversalPin$12.L$8;
                    fo00 fo00Var7 = (fo00) mapObjectItemMapper$mapUniversalPin$12.L$7;
                    nohVar = (noh) mapObjectItemMapper$mapUniversalPin$12.L$6;
                    b.b(obj);
                    frVar = frVar6;
                    frVar2 = frVar7;
                    str = str4;
                    i3 = i5;
                    fo00Var2 = fo00Var7;
                    z = true;
                    doubleValue = d3;
                    fo00 fo00Var8 = (fo00) obj;
                    mapObjectItemMapper$mapUniversalPin$12.L$0 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$1 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$2 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$3 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$4 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$5 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$6 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$7 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$8 = str;
                    mapObjectItemMapper$mapUniversalPin$12.L$9 = point;
                    mapObjectItemMapper$mapUniversalPin$12.L$10 = frVar2;
                    mapObjectItemMapper$mapUniversalPin$12.L$11 = frVar;
                    mapObjectItemMapper$mapUniversalPin$12.L$12 = fo00Var8;
                    mapObjectItemMapper$mapUniversalPin$12.L$13 = fo00Var2;
                    mapObjectItemMapper$mapUniversalPin$12.I$0 = i3;
                    mapObjectItemMapper$mapUniversalPin$12.D$0 = doubleValue;
                    mapObjectItemMapper$mapUniversalPin$12.I$1 = i2;
                    mapObjectItemMapper$mapUniversalPin$12.label = 3;
                    k = nohVar.k(mapObjectItemMapper$mapUniversalPin$12);
                    if (k != coroutineSingletons) {
                        String str5 = str;
                        fo00Var3 = fo00Var2;
                        str2 = str5;
                        frVar3 = frVar2;
                        frVar4 = frVar;
                        point2 = point;
                        d = doubleValue;
                        fo00Var4 = fo00Var8;
                        obj = k;
                        return new hn00(str2, point2, d, frVar3, frVar4, i2 == 0 ? z : false, fo00Var4, fo00Var3, (fo00) obj);
                    }
                    return coroutineSingletons;
                }
                i2 = mapObjectItemMapper$mapUniversalPin$12.I$0;
                noh nohVar2 = (noh) mapObjectItemMapper$mapUniversalPin$12.L$6;
                ?? r3 = (noh) mapObjectItemMapper$mapUniversalPin$12.L$5;
                me11 me11Var3 = (me11) mapObjectItemMapper$mapUniversalPin$12.L$3;
                MapObjectItemDto$UniversalPinDto mapObjectItemDto$UniversalPinDto3 = (MapObjectItemDto$UniversalPinDto) mapObjectItemMapper$mapUniversalPin$12.L$1;
                b.b(obj);
                nohVar = nohVar2;
                h = r3;
                z = true;
                s = obj;
                me11Var2 = me11Var3;
                mapObjectItemDto$UniversalPinDto2 = mapObjectItemDto$UniversalPinDto3;
                fo00Var = (fo00) s;
                if (fo00Var != null) {
                    return null;
                }
                String str6 = mapObjectItemDto$UniversalPinDto2.a;
                Point d4 = cwa1.d(mapObjectItemDto$UniversalPinDto2.b);
                Double d5 = mapObjectItemDto$UniversalPinDto2.c;
                doubleValue = d5 != null ? d5.doubleValue() : 0.0d;
                fr frVar8 = me11Var2.b;
                fr frVar9 = me11Var2.a;
                mapObjectItemMapper$mapUniversalPin$12.L$0 = null;
                mapObjectItemMapper$mapUniversalPin$12.L$1 = null;
                mapObjectItemMapper$mapUniversalPin$12.L$2 = null;
                mapObjectItemMapper$mapUniversalPin$12.L$3 = null;
                mapObjectItemMapper$mapUniversalPin$12.L$4 = null;
                mapObjectItemMapper$mapUniversalPin$12.L$5 = null;
                mapObjectItemMapper$mapUniversalPin$12.L$6 = nohVar;
                mapObjectItemMapper$mapUniversalPin$12.L$7 = fo00Var;
                mapObjectItemMapper$mapUniversalPin$12.L$8 = str6;
                mapObjectItemMapper$mapUniversalPin$12.L$9 = d4;
                mapObjectItemMapper$mapUniversalPin$12.L$10 = frVar8;
                mapObjectItemMapper$mapUniversalPin$12.L$11 = frVar9;
                mapObjectItemMapper$mapUniversalPin$12.I$0 = i2;
                mapObjectItemMapper$mapUniversalPin$12.D$0 = doubleValue;
                mapObjectItemMapper$mapUniversalPin$12.I$1 = i2;
                mapObjectItemMapper$mapUniversalPin$12.label = 2;
                Object k2 = h.k(mapObjectItemMapper$mapUniversalPin$12);
                if (k2 != coroutineSingletons) {
                    frVar = frVar9;
                    obj = k2;
                    point = d4;
                    str = str6;
                    frVar2 = frVar8;
                    fo00Var2 = fo00Var;
                    i3 = i2;
                    fo00 fo00Var82 = (fo00) obj;
                    mapObjectItemMapper$mapUniversalPin$12.L$0 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$1 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$2 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$3 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$4 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$5 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$6 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$7 = null;
                    mapObjectItemMapper$mapUniversalPin$12.L$8 = str;
                    mapObjectItemMapper$mapUniversalPin$12.L$9 = point;
                    mapObjectItemMapper$mapUniversalPin$12.L$10 = frVar2;
                    mapObjectItemMapper$mapUniversalPin$12.L$11 = frVar;
                    mapObjectItemMapper$mapUniversalPin$12.L$12 = fo00Var82;
                    mapObjectItemMapper$mapUniversalPin$12.L$13 = fo00Var2;
                    mapObjectItemMapper$mapUniversalPin$12.I$0 = i3;
                    mapObjectItemMapper$mapUniversalPin$12.D$0 = doubleValue;
                    mapObjectItemMapper$mapUniversalPin$12.I$1 = i2;
                    mapObjectItemMapper$mapUniversalPin$12.label = 3;
                    k = nohVar.k(mapObjectItemMapper$mapUniversalPin$12);
                    if (k != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        aVar2 = aVar;
        mapObjectItemMapper$mapUniversalPin$1 = new MapObjectItemMapper$mapUniversalPin$1(aVar2, continuationImpl);
        MapObjectItemMapper$mapUniversalPin$1 mapObjectItemMapper$mapUniversalPin$122 = mapObjectItemMapper$mapUniversalPin$1;
        Object obj2 = mapObjectItemMapper$mapUniversalPin$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapUniversalPin$122.label;
        if (i != 0) {
        }
        fo00Var = (fo00) s;
        if (fo00Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r13 == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(a aVar, tse tseVar, MapObjectPinStyleDto$UniversalSPinStyleDto mapObjectPinStyleDto$UniversalSPinStyleDto, hbc0 hbc0Var, boolean z, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapUniversalSPinStyle$1 mapObjectItemMapper$mapUniversalSPinStyle$1;
        int i;
        ixy0 ixy0Var;
        noh k;
        boolean z2;
        Bitmap bitmap;
        aVar.getClass();
        i3y i3yVar = aVar.m;
        if (continuationImpl instanceof MapObjectItemMapper$mapUniversalSPinStyle$1) {
            mapObjectItemMapper$mapUniversalSPinStyle$1 = (MapObjectItemMapper$mapUniversalSPinStyle$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapUniversalSPinStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapUniversalSPinStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectItemMapper$mapUniversalSPinStyle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapUniversalSPinStyle$1.label;
                if (i != 0) {
                    b.b(obj);
                    ImageDto imageDto = mapObjectPinStyleDto$UniversalSPinStyleDto.a;
                    cav cavVar = hbc0Var != null ? hbc0Var.c : null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$0 = tseVar;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$1 = null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$2 = null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.Z$0 = z;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.label = 1;
                    obj = aVar.q(imageDto, cavVar, z, mapObjectItemMapper$mapUniversalSPinStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bitmap = (Bitmap) mapObjectItemMapper$mapUniversalSPinStyle$1.L$6;
                            b.b(obj);
                            return new do00(bitmap != null ? new zwy0(bitmap, (Bitmap) obj) : null);
                        }
                        z2 = mapObjectItemMapper$mapUniversalSPinStyle$1.Z$0;
                        k = (noh) mapObjectItemMapper$mapUniversalSPinStyle$1.L$5;
                        b.b(obj);
                        Bitmap bitmap2 = (Bitmap) obj;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.L$0 = null;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.L$1 = null;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.L$2 = null;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.L$3 = null;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.L$4 = null;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.L$5 = null;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.L$6 = bitmap2;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.Z$0 = z2;
                        mapObjectItemMapper$mapUniversalSPinStyle$1.label = 3;
                        obj = k.k(mapObjectItemMapper$mapUniversalSPinStyle$1);
                        if (obj != obj2) {
                            bitmap = bitmap2;
                            return new do00(bitmap != null ? new zwy0(bitmap, (Bitmap) obj) : null);
                        }
                        return obj2;
                    }
                    z = mapObjectItemMapper$mapUniversalSPinStyle$1.Z$0;
                    tseVar = (tse) mapObjectItemMapper$mapUniversalSPinStyle$1.L$0;
                    b.b(obj);
                }
                ixy0Var = (ixy0) obj;
                if (ixy0Var != null) {
                    return null;
                }
                k7v a = ixy0Var.a(ThemeType.LIGHT);
                qoh k2 = aVar.k(tseVar, a != null ? a.a : null, ((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                k7v a2 = ixy0Var.a(ThemeType.DARK);
                k = aVar.k(tseVar, a2 != null ? a2.a : null, ((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                mapObjectItemMapper$mapUniversalSPinStyle$1.L$0 = null;
                mapObjectItemMapper$mapUniversalSPinStyle$1.L$1 = null;
                mapObjectItemMapper$mapUniversalSPinStyle$1.L$2 = null;
                mapObjectItemMapper$mapUniversalSPinStyle$1.L$3 = null;
                mapObjectItemMapper$mapUniversalSPinStyle$1.L$4 = null;
                mapObjectItemMapper$mapUniversalSPinStyle$1.L$5 = k;
                mapObjectItemMapper$mapUniversalSPinStyle$1.Z$0 = z;
                mapObjectItemMapper$mapUniversalSPinStyle$1.label = 2;
                obj = k2.s(mapObjectItemMapper$mapUniversalSPinStyle$1);
                if (obj != obj2) {
                    z2 = z;
                    Bitmap bitmap22 = (Bitmap) obj;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$0 = null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$1 = null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$2 = null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$3 = null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$4 = null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$5 = null;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.L$6 = bitmap22;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.Z$0 = z2;
                    mapObjectItemMapper$mapUniversalSPinStyle$1.label = 3;
                    obj = k.k(mapObjectItemMapper$mapUniversalSPinStyle$1);
                    if (obj != obj2) {
                    }
                }
                return obj2;
            }
        }
        mapObjectItemMapper$mapUniversalSPinStyle$1 = new MapObjectItemMapper$mapUniversalSPinStyle$1(aVar, continuationImpl);
        Object obj3 = mapObjectItemMapper$mapUniversalSPinStyle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapUniversalSPinStyle$1.label;
        if (i != 0) {
        }
        ixy0Var = (ixy0) obj3;
        if (ixy0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(a aVar, tse tseVar, MapObjectPinStyleDto$UniversalSelectedPinStyleDto mapObjectPinStyleDto$UniversalSelectedPinStyleDto, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapUniversalSelectedPinStyle$1 mapObjectItemMapper$mapUniversalSelectedPinStyle$1;
        int i;
        Bitmap bitmap;
        aVar.getClass();
        i3y i3yVar = aVar.n;
        if (continuationImpl instanceof MapObjectItemMapper$mapUniversalSelectedPinStyle$1) {
            mapObjectItemMapper$mapUniversalSelectedPinStyle$1 = (MapObjectItemMapper$mapUniversalSelectedPinStyle$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapUniversalSelectedPinStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapUniversalSelectedPinStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectItemMapper$mapUniversalSelectedPinStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapUniversalSelectedPinStyle$1.label;
                if (i != 0) {
                    b.b(obj);
                    k7v a = aVar.c.a(mapObjectPinStyleDto$UniversalSelectedPinStyleDto.a);
                    if (a != null) {
                        qoh k = aVar.k(tseVar, a.a, ((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                        mapObjectItemMapper$mapUniversalSelectedPinStyle$1.L$0 = null;
                        mapObjectItemMapper$mapUniversalSelectedPinStyle$1.L$1 = null;
                        mapObjectItemMapper$mapUniversalSelectedPinStyle$1.L$2 = null;
                        mapObjectItemMapper$mapUniversalSelectedPinStyle$1.L$3 = null;
                        mapObjectItemMapper$mapUniversalSelectedPinStyle$1.label = 1;
                        obj = k.s(mapObjectItemMapper$mapUniversalSelectedPinStyle$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new eo00(new zwy0(bitmap, null));
                }
                return null;
            }
        }
        mapObjectItemMapper$mapUniversalSelectedPinStyle$1 = new MapObjectItemMapper$mapUniversalSelectedPinStyle$1(aVar, continuationImpl);
        Object obj2 = mapObjectItemMapper$mapUniversalSelectedPinStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapUniversalSelectedPinStyle$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return null;
    }

    public final int j() {
        return ((Number) this.w.getValue()).intValue();
    }

    public final qoh k(tse tseVar, String str, int i, int i2) {
        return tje.h(tseVar, null, null, new MapObjectItemMapper$loadBitmapAsync$1(this, str, i, i2, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r12v28, types: [noh] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.yandex.go.places.map.data.mappers.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(tse tseVar, hbc0 hbc0Var, ImageDto imageDto, List list, FormattedText formattedText, FormattedText formattedText2, boolean z, int i, int i2, int i3, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$loadLStyleAssets$1 mapObjectItemMapper$loadLStyleAssets$1;
        ixy0 ixy0Var;
        tse tseVar2;
        FormattedText formattedText3;
        int i4;
        int i5;
        hbc0 hbc0Var2;
        FormattedText formattedText4;
        int i6;
        int i7;
        boolean z2;
        ixy0 ixy0Var2;
        Object s;
        FormattedText formattedText5;
        int i8;
        int i9;
        FormattedText formattedText6;
        ixy0 ixy0Var3;
        int i10;
        cav cavVar;
        ixy0 ixy0Var4;
        noh nohVar;
        tse tseVar3;
        k7v a;
        Object s2;
        CoroutineSingletons coroutineSingletons;
        Bitmap bitmap;
        noh nohVar2;
        cav cavVar2;
        boolean z3;
        FormattedText formattedText7;
        ixy0 ixy0Var5;
        tse tseVar4;
        FormattedText formattedText8;
        k7v a2;
        zwy0 zwy0Var;
        Object k;
        CoroutineSingletons coroutineSingletons2;
        qoh qohVar;
        Bitmap bitmap2;
        CoroutineSingletons coroutineSingletons3;
        zwy0 zwy0Var2;
        zwy0 zwy0Var3;
        noh nohVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        ixy0 ixy0Var6;
        noh nohVar4;
        Object k2;
        int i15;
        Bitmap bitmap3;
        int i16;
        boolean z5;
        ixy0 ixy0Var7;
        noh nohVar5;
        CharSequence charSequence;
        zwy0 zwy0Var4;
        zwy0 zwy0Var5;
        if (continuationImpl instanceof MapObjectItemMapper$loadLStyleAssets$1) {
            mapObjectItemMapper$loadLStyleAssets$1 = (MapObjectItemMapper$loadLStyleAssets$1) continuationImpl;
            int i17 = mapObjectItemMapper$loadLStyleAssets$1.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$loadLStyleAssets$1.label = i17 - Integer.MIN_VALUE;
                Object obj = mapObjectItemMapper$loadLStyleAssets$1.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (mapObjectItemMapper$loadLStyleAssets$1.label) {
                    case 0:
                        b.b(obj);
                        c0 c0Var = (c0) kotlin.collections.a.R(list);
                        boolean z6 = c0Var instanceof MediaDto$VideoMediaDto;
                        this.e.getClass();
                        k7v a3 = je10.a(c0Var);
                        if (a3 == null) {
                            return null;
                        }
                        ixy0Var = new ixy0(a3, null);
                        if (imageDto == null) {
                            tseVar2 = tseVar;
                            formattedText3 = formattedText;
                            i4 = i2;
                            i5 = i3;
                            hbc0Var2 = hbc0Var;
                            formattedText4 = formattedText2;
                            i6 = z6 ? 1 : 0;
                            i7 = i;
                            z2 = z;
                            ixy0Var2 = null;
                            if (hbc0Var2 != null) {
                            }
                            if (i6 == 0) {
                            }
                            qoh k3 = k(tseVar2, ixy0Var.a.a, i7, i4);
                            qoh k4 = k(tseVar2, (ixy0Var2 != null || (a = ixy0Var2.a(ThemeType.LIGHT)) == null) ? null : a.a, i5, i5);
                            mapObjectItemMapper$loadLStyleAssets$1.L$0 = tseVar2;
                            tse tseVar5 = tseVar2;
                            mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                            mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                            mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                            mapObjectItemMapper$loadLStyleAssets$1.L$4 = formattedText3;
                            mapObjectItemMapper$loadLStyleAssets$1.L$5 = formattedText4;
                            mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                            mapObjectItemMapper$loadLStyleAssets$1.L$7 = ixy0Var;
                            mapObjectItemMapper$loadLStyleAssets$1.L$8 = ixy0Var2;
                            mapObjectItemMapper$loadLStyleAssets$1.L$9 = r4;
                            mapObjectItemMapper$loadLStyleAssets$1.L$10 = k3;
                            mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z2;
                            mapObjectItemMapper$loadLStyleAssets$1.I$0 = i7;
                            mapObjectItemMapper$loadLStyleAssets$1.I$1 = i4;
                            mapObjectItemMapper$loadLStyleAssets$1.I$2 = i5;
                            mapObjectItemMapper$loadLStyleAssets$1.I$3 = i6;
                            mapObjectItemMapper$loadLStyleAssets$1.label = 2;
                            s = k4.s(mapObjectItemMapper$loadLStyleAssets$1);
                            if (s != coroutineSingletons4) {
                            }
                            return coroutineSingletons4;
                        }
                        cav cavVar3 = hbc0Var != null ? hbc0Var.e : null;
                        tseVar2 = tseVar;
                        mapObjectItemMapper$loadLStyleAssets$1.L$0 = tseVar2;
                        mapObjectItemMapper$loadLStyleAssets$1.L$1 = hbc0Var;
                        mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                        formattedText3 = formattedText;
                        mapObjectItemMapper$loadLStyleAssets$1.L$4 = formattedText3;
                        mapObjectItemMapper$loadLStyleAssets$1.L$5 = formattedText2;
                        mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$7 = ixy0Var;
                        mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z;
                        mapObjectItemMapper$loadLStyleAssets$1.I$0 = i;
                        i4 = i2;
                        mapObjectItemMapper$loadLStyleAssets$1.I$1 = i4;
                        i5 = i3;
                        mapObjectItemMapper$loadLStyleAssets$1.I$2 = i5;
                        mapObjectItemMapper$loadLStyleAssets$1.I$3 = z6 ? 1 : 0;
                        mapObjectItemMapper$loadLStyleAssets$1.label = 1;
                        obj = q(imageDto, cavVar3, z, mapObjectItemMapper$loadLStyleAssets$1);
                        if (obj != coroutineSingletons4) {
                            hbc0Var2 = hbc0Var;
                            formattedText4 = formattedText2;
                            i6 = z6 ? 1 : 0;
                            i7 = i;
                            z2 = z;
                            ixy0Var2 = (ixy0) obj;
                            cav cavVar4 = hbc0Var2 != null ? hbc0Var2.f : null;
                            if (i6 == 0) {
                                cavVar4 = null;
                            }
                            qoh k32 = k(tseVar2, ixy0Var.a.a, i7, i4);
                            qoh k42 = k(tseVar2, (ixy0Var2 != null || (a = ixy0Var2.a(ThemeType.LIGHT)) == null) ? null : a.a, i5, i5);
                            mapObjectItemMapper$loadLStyleAssets$1.L$0 = tseVar2;
                            tse tseVar52 = tseVar2;
                            mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                            mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                            mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                            mapObjectItemMapper$loadLStyleAssets$1.L$4 = formattedText3;
                            mapObjectItemMapper$loadLStyleAssets$1.L$5 = formattedText4;
                            mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                            mapObjectItemMapper$loadLStyleAssets$1.L$7 = ixy0Var;
                            mapObjectItemMapper$loadLStyleAssets$1.L$8 = ixy0Var2;
                            mapObjectItemMapper$loadLStyleAssets$1.L$9 = cavVar4;
                            mapObjectItemMapper$loadLStyleAssets$1.L$10 = k32;
                            mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z2;
                            mapObjectItemMapper$loadLStyleAssets$1.I$0 = i7;
                            mapObjectItemMapper$loadLStyleAssets$1.I$1 = i4;
                            mapObjectItemMapper$loadLStyleAssets$1.I$2 = i5;
                            mapObjectItemMapper$loadLStyleAssets$1.I$3 = i6;
                            mapObjectItemMapper$loadLStyleAssets$1.label = 2;
                            s = k42.s(mapObjectItemMapper$loadLStyleAssets$1);
                            if (s != coroutineSingletons4) {
                                int i18 = i4;
                                formattedText5 = formattedText4;
                                i8 = i6;
                                i9 = i5;
                                formattedText6 = formattedText3;
                                ixy0Var3 = ixy0Var2;
                                i10 = i18;
                                cavVar = cavVar4;
                                obj = s;
                                ixy0Var4 = ixy0Var;
                                nohVar = k32;
                                tseVar3 = tseVar52;
                                Bitmap bitmap4 = (Bitmap) obj;
                                qoh k5 = k(tseVar3, (ixy0Var3 != null || (a2 = ixy0Var3.a(ThemeType.DARK)) == null) ? null : a2.a, i9, i9);
                                mapObjectItemMapper$loadLStyleAssets$1.L$0 = tseVar3;
                                mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$4 = formattedText6;
                                mapObjectItemMapper$loadLStyleAssets$1.L$5 = formattedText5;
                                mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$7 = ixy0Var4;
                                mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$9 = cavVar;
                                mapObjectItemMapper$loadLStyleAssets$1.L$10 = nohVar;
                                mapObjectItemMapper$loadLStyleAssets$1.L$11 = bitmap4;
                                mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z2;
                                mapObjectItemMapper$loadLStyleAssets$1.I$0 = i7;
                                mapObjectItemMapper$loadLStyleAssets$1.I$1 = i10;
                                mapObjectItemMapper$loadLStyleAssets$1.I$2 = i9;
                                mapObjectItemMapper$loadLStyleAssets$1.I$3 = i8;
                                mapObjectItemMapper$loadLStyleAssets$1.label = 3;
                                s2 = k5.s(mapObjectItemMapper$loadLStyleAssets$1);
                                coroutineSingletons = coroutineSingletons4;
                                if (s2 != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                noh nohVar6 = nohVar;
                                bitmap = bitmap4;
                                obj = s2;
                                nohVar2 = nohVar6;
                                cavVar2 = cavVar;
                                z3 = z2;
                                formattedText7 = formattedText6;
                                ixy0Var5 = ixy0Var4;
                                tseVar4 = tseVar3;
                                formattedText8 = formattedText5;
                                cav cavVar5 = cavVar2;
                                CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
                                zwy0Var = bitmap == null ? new zwy0(bitmap, (Bitmap) obj) : null;
                                String str = cavVar5 == null ? cavVar5.a : null;
                                i3y i3yVar = this.s;
                                qoh k6 = k(tseVar4, str, ((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                                mapObjectItemMapper$loadLStyleAssets$1.L$0 = tseVar4;
                                mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$4 = formattedText7;
                                mapObjectItemMapper$loadLStyleAssets$1.L$5 = formattedText8;
                                mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$7 = ixy0Var5;
                                mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$9 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$10 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$11 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$12 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$13 = zwy0Var;
                                mapObjectItemMapper$loadLStyleAssets$1.L$14 = k6;
                                mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z3;
                                mapObjectItemMapper$loadLStyleAssets$1.I$0 = i7;
                                mapObjectItemMapper$loadLStyleAssets$1.I$1 = i10;
                                mapObjectItemMapper$loadLStyleAssets$1.I$2 = i9;
                                mapObjectItemMapper$loadLStyleAssets$1.I$3 = i8;
                                mapObjectItemMapper$loadLStyleAssets$1.label = 4;
                                k = nohVar2.k(mapObjectItemMapper$loadLStyleAssets$1);
                                coroutineSingletons2 = coroutineSingletons5;
                                if (k != coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                qohVar = k6;
                                obj = k;
                                bitmap2 = (Bitmap) obj;
                                if (bitmap2 != null) {
                                    return null;
                                }
                                zwy0 zwy0Var6 = new zwy0(bitmap2, null);
                                qoh h = tje.h(tseVar4, null, null, new MapObjectItemMapper$loadLStyleAssets$title$1(formattedText7, this, null), 3);
                                qoh h2 = tje.h(tseVar4, null, null, new MapObjectItemMapper$loadLStyleAssets$subtitle$1(formattedText8, this, null), 3);
                                mapObjectItemMapper$loadLStyleAssets$1.L$0 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$4 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$5 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$7 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$9 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$10 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$11 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$12 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$13 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$14 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$15 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$16 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$17 = h;
                                mapObjectItemMapper$loadLStyleAssets$1.L$18 = h2;
                                mapObjectItemMapper$loadLStyleAssets$1.L$19 = ixy0Var5;
                                mapObjectItemMapper$loadLStyleAssets$1.L$20 = zwy0Var6;
                                mapObjectItemMapper$loadLStyleAssets$1.L$21 = zwy0Var;
                                mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z3;
                                mapObjectItemMapper$loadLStyleAssets$1.I$0 = i7;
                                mapObjectItemMapper$loadLStyleAssets$1.I$1 = i10;
                                mapObjectItemMapper$loadLStyleAssets$1.I$2 = i9;
                                mapObjectItemMapper$loadLStyleAssets$1.I$3 = i8;
                                mapObjectItemMapper$loadLStyleAssets$1.label = 5;
                                Object k7 = qohVar.k(mapObjectItemMapper$loadLStyleAssets$1);
                                coroutineSingletons3 = coroutineSingletons2;
                                if (k7 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                zwy0Var2 = zwy0Var;
                                zwy0Var3 = zwy0Var6;
                                nohVar3 = h2;
                                i11 = i8;
                                i12 = i9;
                                i13 = i10;
                                i14 = i7;
                                z4 = z3;
                                ixy0Var6 = ixy0Var5;
                                nohVar4 = h;
                                obj = k7;
                                Bitmap bitmap5 = (Bitmap) obj;
                                mapObjectItemMapper$loadLStyleAssets$1.L$0 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$4 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$5 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$7 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$9 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$10 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$11 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$12 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$13 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$14 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$15 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$16 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$17 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$18 = nohVar3;
                                mapObjectItemMapper$loadLStyleAssets$1.L$19 = ixy0Var6;
                                mapObjectItemMapper$loadLStyleAssets$1.L$20 = zwy0Var3;
                                mapObjectItemMapper$loadLStyleAssets$1.L$21 = zwy0Var2;
                                mapObjectItemMapper$loadLStyleAssets$1.L$22 = bitmap5;
                                mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z4;
                                mapObjectItemMapper$loadLStyleAssets$1.I$0 = i14;
                                mapObjectItemMapper$loadLStyleAssets$1.I$1 = i13;
                                mapObjectItemMapper$loadLStyleAssets$1.I$2 = i12;
                                mapObjectItemMapper$loadLStyleAssets$1.I$3 = i11;
                                mapObjectItemMapper$loadLStyleAssets$1.label = 6;
                                k2 = nohVar4.k(mapObjectItemMapper$loadLStyleAssets$1);
                                if (k2 != coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                int i19 = i14;
                                i15 = i13;
                                bitmap3 = bitmap5;
                                i16 = i19;
                                z5 = z4;
                                ixy0Var7 = ixy0Var6;
                                nohVar5 = nohVar3;
                                CharSequence charSequence2 = (CharSequence) k2;
                                mapObjectItemMapper$loadLStyleAssets$1.L$0 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$4 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$5 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$7 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$9 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$10 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$11 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$12 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$13 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$14 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$15 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$16 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$17 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$18 = null;
                                mapObjectItemMapper$loadLStyleAssets$1.L$19 = ixy0Var7;
                                mapObjectItemMapper$loadLStyleAssets$1.L$20 = zwy0Var3;
                                mapObjectItemMapper$loadLStyleAssets$1.L$21 = zwy0Var2;
                                mapObjectItemMapper$loadLStyleAssets$1.L$22 = bitmap3;
                                mapObjectItemMapper$loadLStyleAssets$1.L$23 = charSequence2;
                                mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z5;
                                mapObjectItemMapper$loadLStyleAssets$1.I$0 = i16;
                                mapObjectItemMapper$loadLStyleAssets$1.I$1 = i15;
                                mapObjectItemMapper$loadLStyleAssets$1.I$2 = i12;
                                mapObjectItemMapper$loadLStyleAssets$1.I$3 = i11;
                                mapObjectItemMapper$loadLStyleAssets$1.label = 7;
                                obj = nohVar5.k(mapObjectItemMapper$loadLStyleAssets$1);
                                if (obj != coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                charSequence = charSequence2;
                                zwy0Var4 = zwy0Var2;
                                zwy0Var5 = zwy0Var3;
                                return new on00(ixy0Var7, zwy0Var5, zwy0Var4, bitmap3, charSequence, (CharSequence) obj, i11 == 0);
                            }
                        }
                        return coroutineSingletons4;
                    case 1:
                        int i20 = mapObjectItemMapper$loadLStyleAssets$1.I$3;
                        int i21 = mapObjectItemMapper$loadLStyleAssets$1.I$2;
                        int i22 = mapObjectItemMapper$loadLStyleAssets$1.I$1;
                        i7 = mapObjectItemMapper$loadLStyleAssets$1.I$0;
                        z2 = mapObjectItemMapper$loadLStyleAssets$1.Z$0;
                        ixy0Var = (ixy0) mapObjectItemMapper$loadLStyleAssets$1.L$7;
                        FormattedText formattedText9 = (FormattedText) mapObjectItemMapper$loadLStyleAssets$1.L$5;
                        formattedText3 = (FormattedText) mapObjectItemMapper$loadLStyleAssets$1.L$4;
                        hbc0Var2 = (hbc0) mapObjectItemMapper$loadLStyleAssets$1.L$1;
                        tse tseVar6 = (tse) mapObjectItemMapper$loadLStyleAssets$1.L$0;
                        b.b(obj);
                        i5 = i21;
                        i6 = i20;
                        formattedText4 = formattedText9;
                        tseVar2 = tseVar6;
                        i4 = i22;
                        ixy0Var2 = (ixy0) obj;
                        if (hbc0Var2 != null) {
                        }
                        if (i6 == 0) {
                        }
                        qoh k322 = k(tseVar2, ixy0Var.a.a, i7, i4);
                        qoh k422 = k(tseVar2, (ixy0Var2 != null || (a = ixy0Var2.a(ThemeType.LIGHT)) == null) ? null : a.a, i5, i5);
                        mapObjectItemMapper$loadLStyleAssets$1.L$0 = tseVar2;
                        tse tseVar522 = tseVar2;
                        mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$4 = formattedText3;
                        mapObjectItemMapper$loadLStyleAssets$1.L$5 = formattedText4;
                        mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$7 = ixy0Var;
                        mapObjectItemMapper$loadLStyleAssets$1.L$8 = ixy0Var2;
                        mapObjectItemMapper$loadLStyleAssets$1.L$9 = cavVar4;
                        mapObjectItemMapper$loadLStyleAssets$1.L$10 = k322;
                        mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z2;
                        mapObjectItemMapper$loadLStyleAssets$1.I$0 = i7;
                        mapObjectItemMapper$loadLStyleAssets$1.I$1 = i4;
                        mapObjectItemMapper$loadLStyleAssets$1.I$2 = i5;
                        mapObjectItemMapper$loadLStyleAssets$1.I$3 = i6;
                        mapObjectItemMapper$loadLStyleAssets$1.label = 2;
                        s = k422.s(mapObjectItemMapper$loadLStyleAssets$1);
                        if (s != coroutineSingletons4) {
                        }
                        return coroutineSingletons4;
                    case 2:
                        i8 = mapObjectItemMapper$loadLStyleAssets$1.I$3;
                        i9 = mapObjectItemMapper$loadLStyleAssets$1.I$2;
                        i10 = mapObjectItemMapper$loadLStyleAssets$1.I$1;
                        i7 = mapObjectItemMapper$loadLStyleAssets$1.I$0;
                        z2 = mapObjectItemMapper$loadLStyleAssets$1.Z$0;
                        nohVar = (noh) mapObjectItemMapper$loadLStyleAssets$1.L$10;
                        cav cavVar6 = (cav) mapObjectItemMapper$loadLStyleAssets$1.L$9;
                        ixy0Var3 = (ixy0) mapObjectItemMapper$loadLStyleAssets$1.L$8;
                        ixy0 ixy0Var8 = (ixy0) mapObjectItemMapper$loadLStyleAssets$1.L$7;
                        formattedText5 = (FormattedText) mapObjectItemMapper$loadLStyleAssets$1.L$5;
                        formattedText6 = (FormattedText) mapObjectItemMapper$loadLStyleAssets$1.L$4;
                        tseVar3 = (tse) mapObjectItemMapper$loadLStyleAssets$1.L$0;
                        b.b(obj);
                        cavVar = cavVar6;
                        ixy0Var4 = ixy0Var8;
                        Bitmap bitmap42 = (Bitmap) obj;
                        if (ixy0Var3 != null) {
                            break;
                        }
                        qoh k52 = k(tseVar3, (ixy0Var3 != null || (a2 = ixy0Var3.a(ThemeType.DARK)) == null) ? null : a2.a, i9, i9);
                        mapObjectItemMapper$loadLStyleAssets$1.L$0 = tseVar3;
                        mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$4 = formattedText6;
                        mapObjectItemMapper$loadLStyleAssets$1.L$5 = formattedText5;
                        mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$7 = ixy0Var4;
                        mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$9 = cavVar;
                        mapObjectItemMapper$loadLStyleAssets$1.L$10 = nohVar;
                        mapObjectItemMapper$loadLStyleAssets$1.L$11 = bitmap42;
                        mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z2;
                        mapObjectItemMapper$loadLStyleAssets$1.I$0 = i7;
                        mapObjectItemMapper$loadLStyleAssets$1.I$1 = i10;
                        mapObjectItemMapper$loadLStyleAssets$1.I$2 = i9;
                        mapObjectItemMapper$loadLStyleAssets$1.I$3 = i8;
                        mapObjectItemMapper$loadLStyleAssets$1.label = 3;
                        s2 = k52.s(mapObjectItemMapper$loadLStyleAssets$1);
                        coroutineSingletons = coroutineSingletons4;
                        if (s2 != coroutineSingletons) {
                        }
                        break;
                    case 3:
                        i8 = mapObjectItemMapper$loadLStyleAssets$1.I$3;
                        i9 = mapObjectItemMapper$loadLStyleAssets$1.I$2;
                        i10 = mapObjectItemMapper$loadLStyleAssets$1.I$1;
                        i7 = mapObjectItemMapper$loadLStyleAssets$1.I$0;
                        boolean z7 = mapObjectItemMapper$loadLStyleAssets$1.Z$0;
                        bitmap = (Bitmap) mapObjectItemMapper$loadLStyleAssets$1.L$11;
                        noh nohVar7 = (noh) mapObjectItemMapper$loadLStyleAssets$1.L$10;
                        cav cavVar7 = (cav) mapObjectItemMapper$loadLStyleAssets$1.L$9;
                        ixy0 ixy0Var9 = (ixy0) mapObjectItemMapper$loadLStyleAssets$1.L$7;
                        FormattedText formattedText10 = (FormattedText) mapObjectItemMapper$loadLStyleAssets$1.L$5;
                        FormattedText formattedText11 = (FormattedText) mapObjectItemMapper$loadLStyleAssets$1.L$4;
                        tseVar4 = (tse) mapObjectItemMapper$loadLStyleAssets$1.L$0;
                        b.b(obj);
                        coroutineSingletons = coroutineSingletons4;
                        nohVar2 = nohVar7;
                        cavVar2 = cavVar7;
                        z3 = z7;
                        formattedText7 = formattedText11;
                        formattedText8 = formattedText10;
                        ixy0Var5 = ixy0Var9;
                        cav cavVar52 = cavVar2;
                        CoroutineSingletons coroutineSingletons52 = coroutineSingletons;
                        if (bitmap == null) {
                        }
                        if (cavVar52 == null) {
                        }
                        i3y i3yVar2 = this.s;
                        qoh k62 = k(tseVar4, str, ((Number) i3yVar2.getValue()).intValue(), ((Number) i3yVar2.getValue()).intValue());
                        mapObjectItemMapper$loadLStyleAssets$1.L$0 = tseVar4;
                        mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$4 = formattedText7;
                        mapObjectItemMapper$loadLStyleAssets$1.L$5 = formattedText8;
                        mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$7 = ixy0Var5;
                        mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$9 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$10 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$11 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$12 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$13 = zwy0Var;
                        mapObjectItemMapper$loadLStyleAssets$1.L$14 = k62;
                        mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z3;
                        mapObjectItemMapper$loadLStyleAssets$1.I$0 = i7;
                        mapObjectItemMapper$loadLStyleAssets$1.I$1 = i10;
                        mapObjectItemMapper$loadLStyleAssets$1.I$2 = i9;
                        mapObjectItemMapper$loadLStyleAssets$1.I$3 = i8;
                        mapObjectItemMapper$loadLStyleAssets$1.label = 4;
                        k = nohVar2.k(mapObjectItemMapper$loadLStyleAssets$1);
                        coroutineSingletons2 = coroutineSingletons52;
                        if (k != coroutineSingletons2) {
                        }
                        break;
                    case 4:
                        i8 = mapObjectItemMapper$loadLStyleAssets$1.I$3;
                        i9 = mapObjectItemMapper$loadLStyleAssets$1.I$2;
                        i10 = mapObjectItemMapper$loadLStyleAssets$1.I$1;
                        i7 = mapObjectItemMapper$loadLStyleAssets$1.I$0;
                        boolean z8 = mapObjectItemMapper$loadLStyleAssets$1.Z$0;
                        ?? r12 = (noh) mapObjectItemMapper$loadLStyleAssets$1.L$14;
                        zwy0 zwy0Var7 = (zwy0) mapObjectItemMapper$loadLStyleAssets$1.L$13;
                        ixy0Var5 = (ixy0) mapObjectItemMapper$loadLStyleAssets$1.L$7;
                        formattedText8 = (FormattedText) mapObjectItemMapper$loadLStyleAssets$1.L$5;
                        formattedText7 = (FormattedText) mapObjectItemMapper$loadLStyleAssets$1.L$4;
                        tse tseVar7 = (tse) mapObjectItemMapper$loadLStyleAssets$1.L$0;
                        b.b(obj);
                        tseVar4 = tseVar7;
                        coroutineSingletons2 = coroutineSingletons4;
                        qohVar = r12;
                        z3 = z8;
                        zwy0Var = zwy0Var7;
                        bitmap2 = (Bitmap) obj;
                        if (bitmap2 != null) {
                        }
                        break;
                    case 5:
                        i11 = mapObjectItemMapper$loadLStyleAssets$1.I$3;
                        i12 = mapObjectItemMapper$loadLStyleAssets$1.I$2;
                        i13 = mapObjectItemMapper$loadLStyleAssets$1.I$1;
                        i14 = mapObjectItemMapper$loadLStyleAssets$1.I$0;
                        z4 = mapObjectItemMapper$loadLStyleAssets$1.Z$0;
                        zwy0Var2 = (zwy0) mapObjectItemMapper$loadLStyleAssets$1.L$21;
                        zwy0Var3 = (zwy0) mapObjectItemMapper$loadLStyleAssets$1.L$20;
                        ixy0Var6 = (ixy0) mapObjectItemMapper$loadLStyleAssets$1.L$19;
                        nohVar3 = (noh) mapObjectItemMapper$loadLStyleAssets$1.L$18;
                        nohVar4 = (noh) mapObjectItemMapper$loadLStyleAssets$1.L$17;
                        b.b(obj);
                        coroutineSingletons3 = coroutineSingletons4;
                        Bitmap bitmap52 = (Bitmap) obj;
                        mapObjectItemMapper$loadLStyleAssets$1.L$0 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$4 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$5 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$7 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$9 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$10 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$11 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$12 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$13 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$14 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$15 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$16 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$17 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$18 = nohVar3;
                        mapObjectItemMapper$loadLStyleAssets$1.L$19 = ixy0Var6;
                        mapObjectItemMapper$loadLStyleAssets$1.L$20 = zwy0Var3;
                        mapObjectItemMapper$loadLStyleAssets$1.L$21 = zwy0Var2;
                        mapObjectItemMapper$loadLStyleAssets$1.L$22 = bitmap52;
                        mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z4;
                        mapObjectItemMapper$loadLStyleAssets$1.I$0 = i14;
                        mapObjectItemMapper$loadLStyleAssets$1.I$1 = i13;
                        mapObjectItemMapper$loadLStyleAssets$1.I$2 = i12;
                        mapObjectItemMapper$loadLStyleAssets$1.I$3 = i11;
                        mapObjectItemMapper$loadLStyleAssets$1.label = 6;
                        k2 = nohVar4.k(mapObjectItemMapper$loadLStyleAssets$1);
                        if (k2 != coroutineSingletons3) {
                        }
                        break;
                    case 6:
                        i11 = mapObjectItemMapper$loadLStyleAssets$1.I$3;
                        i12 = mapObjectItemMapper$loadLStyleAssets$1.I$2;
                        int i23 = mapObjectItemMapper$loadLStyleAssets$1.I$1;
                        int i24 = mapObjectItemMapper$loadLStyleAssets$1.I$0;
                        boolean z9 = mapObjectItemMapper$loadLStyleAssets$1.Z$0;
                        Bitmap bitmap6 = (Bitmap) mapObjectItemMapper$loadLStyleAssets$1.L$22;
                        zwy0 zwy0Var8 = (zwy0) mapObjectItemMapper$loadLStyleAssets$1.L$21;
                        zwy0 zwy0Var9 = (zwy0) mapObjectItemMapper$loadLStyleAssets$1.L$20;
                        ixy0 ixy0Var10 = (ixy0) mapObjectItemMapper$loadLStyleAssets$1.L$19;
                        nohVar5 = (noh) mapObjectItemMapper$loadLStyleAssets$1.L$18;
                        b.b(obj);
                        coroutineSingletons3 = coroutineSingletons4;
                        z5 = z9;
                        ixy0Var7 = ixy0Var10;
                        k2 = obj;
                        i16 = i24;
                        i15 = i23;
                        bitmap3 = bitmap6;
                        zwy0Var2 = zwy0Var8;
                        zwy0Var3 = zwy0Var9;
                        CharSequence charSequence22 = (CharSequence) k2;
                        mapObjectItemMapper$loadLStyleAssets$1.L$0 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$4 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$5 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$6 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$7 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$8 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$9 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$10 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$11 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$12 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$13 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$14 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$15 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$16 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$17 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$18 = null;
                        mapObjectItemMapper$loadLStyleAssets$1.L$19 = ixy0Var7;
                        mapObjectItemMapper$loadLStyleAssets$1.L$20 = zwy0Var3;
                        mapObjectItemMapper$loadLStyleAssets$1.L$21 = zwy0Var2;
                        mapObjectItemMapper$loadLStyleAssets$1.L$22 = bitmap3;
                        mapObjectItemMapper$loadLStyleAssets$1.L$23 = charSequence22;
                        mapObjectItemMapper$loadLStyleAssets$1.Z$0 = z5;
                        mapObjectItemMapper$loadLStyleAssets$1.I$0 = i16;
                        mapObjectItemMapper$loadLStyleAssets$1.I$1 = i15;
                        mapObjectItemMapper$loadLStyleAssets$1.I$2 = i12;
                        mapObjectItemMapper$loadLStyleAssets$1.I$3 = i11;
                        mapObjectItemMapper$loadLStyleAssets$1.label = 7;
                        obj = nohVar5.k(mapObjectItemMapper$loadLStyleAssets$1);
                        if (obj != coroutineSingletons3) {
                        }
                        break;
                    case 7:
                        i11 = mapObjectItemMapper$loadLStyleAssets$1.I$3;
                        charSequence = (CharSequence) mapObjectItemMapper$loadLStyleAssets$1.L$23;
                        bitmap3 = (Bitmap) mapObjectItemMapper$loadLStyleAssets$1.L$22;
                        zwy0Var4 = (zwy0) mapObjectItemMapper$loadLStyleAssets$1.L$21;
                        zwy0Var5 = (zwy0) mapObjectItemMapper$loadLStyleAssets$1.L$20;
                        ixy0Var7 = (ixy0) mapObjectItemMapper$loadLStyleAssets$1.L$19;
                        b.b(obj);
                        return new on00(ixy0Var7, zwy0Var5, zwy0Var4, bitmap3, charSequence, (CharSequence) obj, i11 == 0);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mapObjectItemMapper$loadLStyleAssets$1 = new MapObjectItemMapper$loadLStyleAssets$1(this, continuationImpl);
        Object obj2 = mapObjectItemMapper$loadLStyleAssets$1.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (mapObjectItemMapper$loadLStyleAssets$1.label) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029e  */
    /* JADX WARN: Type inference failed for: r10v28, types: [noh] */
    /* JADX WARN: Type inference failed for: r11v14, types: [noh] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.yandex.go.places.map.data.mappers.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(tse tseVar, hbc0 hbc0Var, ImageDto imageDto, ImageDto imageDto2, FormattedText formattedText, FormattedText formattedText2, boolean z, int i, int i2, int i3, boolean z2, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$loadMStyleAssets$1 mapObjectItemMapper$loadMStyleAssets$1;
        int i4;
        tse tseVar2;
        ImageDto imageDto3;
        FormattedText formattedText3;
        FormattedText formattedText4;
        int i5;
        int i6;
        cav cavVar;
        ixy0 ixy0Var;
        int i7;
        hbc0 hbc0Var2;
        Object obj;
        boolean z3;
        int i8;
        boolean z4;
        boolean z5;
        tse tseVar3;
        int i9;
        ixy0 ixy0Var2;
        int i10;
        int i11;
        int i12;
        FormattedText formattedText5;
        FormattedText formattedText6;
        ixy0 ixy0Var3;
        boolean z6;
        int i13;
        boolean z7;
        int i14;
        Object s;
        CoroutineSingletons coroutineSingletons;
        FormattedText formattedText7;
        noh nohVar;
        qoh qohVar;
        ixy0 ixy0Var4;
        int i15;
        ixy0 ixy0Var5;
        Object obj2;
        tse tseVar4;
        int i16;
        k7v a;
        Bitmap bitmap;
        int i17;
        Object s2;
        CoroutineSingletons coroutineSingletons2;
        tse tseVar5;
        Object obj3;
        CoroutineSingletons coroutineSingletons3;
        FormattedText formattedText8;
        noh nohVar2;
        noh nohVar3;
        ixy0 ixy0Var6;
        int i18;
        boolean z8;
        int i19;
        k7v a2;
        zwy0 zwy0Var;
        Object k;
        CoroutineSingletons coroutineSingletons4;
        FormattedText formattedText9;
        Object obj4;
        int i20;
        ixy0 ixy0Var7;
        int i21;
        Bitmap bitmap2;
        Bitmap bitmap3;
        int i22;
        int i23;
        boolean z9;
        int i24;
        FormattedText formattedText10;
        ixy0 ixy0Var8;
        zwy0 zwy0Var2;
        CoroutineSingletons coroutineSingletons5;
        qoh qohVar2;
        int i25;
        int i26;
        boolean z10;
        zwy0 zwy0Var3;
        Object k2;
        CharSequence charSequence;
        ixy0 ixy0Var9;
        zwy0 zwy0Var4;
        boolean z11 = z;
        boolean z12 = z2;
        if (continuationImpl instanceof MapObjectItemMapper$loadMStyleAssets$1) {
            mapObjectItemMapper$loadMStyleAssets$1 = (MapObjectItemMapper$loadMStyleAssets$1) continuationImpl;
            int i27 = mapObjectItemMapper$loadMStyleAssets$1.label;
            if ((i27 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$loadMStyleAssets$1.label = i27 - Integer.MIN_VALUE;
                Object obj5 = mapObjectItemMapper$loadMStyleAssets$1.result;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (mapObjectItemMapper$loadMStyleAssets$1.label) {
                    case 0:
                        b.b(obj5);
                        String str = imageDto.a;
                        i4 = (str == null || evu0.J(str)) ? 1 : 0;
                        if (!z12 || i4 == 0) {
                            if (i4 != 0) {
                                cav cavVar2 = hbc0Var != null ? hbc0Var.c : null;
                                tseVar2 = tseVar;
                                mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar2;
                                mapObjectItemMapper$loadMStyleAssets$1.L$1 = hbc0Var;
                                mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                                imageDto3 = imageDto2;
                                mapObjectItemMapper$loadMStyleAssets$1.L$3 = imageDto3;
                                formattedText3 = formattedText;
                                mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                                formattedText4 = formattedText2;
                                mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText4;
                                mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z11;
                                mapObjectItemMapper$loadMStyleAssets$1.I$0 = i;
                                mapObjectItemMapper$loadMStyleAssets$1.I$1 = i2;
                                i6 = i3;
                                mapObjectItemMapper$loadMStyleAssets$1.I$2 = i6;
                                mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z12;
                                mapObjectItemMapper$loadMStyleAssets$1.I$3 = i4;
                                mapObjectItemMapper$loadMStyleAssets$1.label = 1;
                                Object q = q(imageDto, cavVar2, z11, mapObjectItemMapper$loadMStyleAssets$1);
                                if (q != coroutineSingletons6) {
                                    obj = q;
                                    z3 = z12;
                                    i8 = i2;
                                    i7 = i;
                                    hbc0Var2 = hbc0Var;
                                    int i28 = i8;
                                    z12 = z3;
                                    ixy0Var = (ixy0) obj;
                                    i5 = i28;
                                    cavVar = null;
                                    if (ixy0Var == null) {
                                        return cavVar;
                                    }
                                    if (imageDto3 != null) {
                                        cav cavVar3 = hbc0Var2 != null ? hbc0Var2.d : cavVar;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar2;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = cavVar;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = cavVar;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = cavVar;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText4;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var;
                                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z11;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i7;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i5;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i6;
                                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z12;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i4;
                                        mapObjectItemMapper$loadMStyleAssets$1.label = 2;
                                        Object q2 = q(imageDto3, cavVar3, z11, mapObjectItemMapper$loadMStyleAssets$1);
                                        if (q2 != coroutineSingletons6) {
                                            int i29 = i4;
                                            obj5 = q2;
                                            i12 = i29;
                                            FormattedText formattedText11 = formattedText4;
                                            formattedText5 = formattedText3;
                                            formattedText6 = formattedText11;
                                            ixy0Var3 = ixy0Var;
                                            z6 = z12;
                                            tseVar3 = tseVar2;
                                            i13 = i5;
                                            z7 = z11;
                                            i14 = i6;
                                            ixy0 ixy0Var10 = (ixy0) obj5;
                                            i4 = i12;
                                            ixy0Var2 = ixy0Var10;
                                            int i30 = i14;
                                            z5 = z6;
                                            ixy0Var = ixy0Var3;
                                            z4 = z7;
                                            i10 = i7;
                                            i11 = i13;
                                            i9 = i30;
                                            FormattedText formattedText12 = formattedText5;
                                            formattedText4 = formattedText6;
                                            formattedText3 = formattedText12;
                                            int i31 = i4 != 0 ? i11 : i10;
                                            ThemeType themeType = ThemeType.LIGHT;
                                            k7v a3 = ixy0Var.a(themeType);
                                            qoh k3 = k(tseVar3, a3 != null ? a3.a : null, i31, i31);
                                            int i32 = i4;
                                            k7v a4 = ixy0Var.a(ThemeType.DARK);
                                            qoh k4 = k(tseVar3, a4 != null ? a4.a : null, i31, i31);
                                            qoh k5 = k(tseVar3, (ixy0Var2 != null || (a = ixy0Var2.a(themeType)) == null) ? null : a.a, i9, i9);
                                            mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar3;
                                            tse tseVar6 = tseVar3;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText4;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$7 = ixy0Var2;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$8 = k3;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$9 = k4;
                                            mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$0 = i10;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$2 = i9;
                                            mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z5;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$3 = i32;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$4 = i31;
                                            ixy0 ixy0Var11 = ixy0Var2;
                                            mapObjectItemMapper$loadMStyleAssets$1.label = 3;
                                            s = k5.s(mapObjectItemMapper$loadMStyleAssets$1);
                                            if (s == coroutineSingletons6) {
                                                return coroutineSingletons6;
                                            }
                                            coroutineSingletons = coroutineSingletons6;
                                            formattedText7 = formattedText4;
                                            nohVar = k3;
                                            qohVar = k4;
                                            ixy0Var4 = ixy0Var;
                                            i15 = i32;
                                            ixy0Var5 = ixy0Var11;
                                            obj2 = s;
                                            tseVar4 = tseVar6;
                                            i16 = i31;
                                            bitmap = (Bitmap) obj2;
                                            int i33 = i15;
                                            qoh k6 = k(tseVar4, (ixy0Var5 != null || (a2 = ixy0Var5.a(ThemeType.DARK)) == null) ? null : a2.a, i9, i9);
                                            mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar4;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText7;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var4;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$8 = nohVar;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$9 = qohVar;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$10 = bitmap;
                                            mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$0 = i10;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$2 = i9;
                                            mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z5;
                                            i17 = i33;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$3 = i17;
                                            tse tseVar7 = tseVar4;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$4 = i16;
                                            mapObjectItemMapper$loadMStyleAssets$1.label = 4;
                                            s2 = k6.s(mapObjectItemMapper$loadMStyleAssets$1);
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (s2 != coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                            tseVar5 = tseVar7;
                                            obj3 = s2;
                                            coroutineSingletons3 = coroutineSingletons2;
                                            formattedText8 = formattedText7;
                                            nohVar2 = nohVar;
                                            nohVar3 = qohVar;
                                            ixy0Var6 = ixy0Var4;
                                            i18 = i9;
                                            z8 = z5;
                                            i19 = i16;
                                            Bitmap bitmap4 = (Bitmap) obj3;
                                            noh nohVar4 = nohVar2;
                                            zwy0Var = bitmap == null ? new zwy0(bitmap, bitmap4) : null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar5;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText8;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var6;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$8 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$9 = nohVar3;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$10 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$11 = null;
                                            mapObjectItemMapper$loadMStyleAssets$1.L$12 = zwy0Var;
                                            mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$0 = i10;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$2 = i18;
                                            mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z8;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$3 = i17;
                                            mapObjectItemMapper$loadMStyleAssets$1.I$4 = i19;
                                            mapObjectItemMapper$loadMStyleAssets$1.label = 5;
                                            k = nohVar4.k(mapObjectItemMapper$loadMStyleAssets$1);
                                            coroutineSingletons4 = coroutineSingletons3;
                                            if (k != coroutineSingletons4) {
                                                int i34 = i10;
                                                formattedText9 = formattedText8;
                                                obj4 = k;
                                                i20 = i17;
                                                ixy0Var7 = ixy0Var6;
                                                i21 = i34;
                                                bitmap2 = (Bitmap) obj4;
                                                if (bitmap2 != null) {
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar5;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText9;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var7;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$8 = null;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$9 = null;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$10 = null;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$11 = null;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$12 = zwy0Var;
                                                    mapObjectItemMapper$loadMStyleAssets$1.L$13 = bitmap2;
                                                    mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                                                    mapObjectItemMapper$loadMStyleAssets$1.I$0 = i21;
                                                    mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                                                    mapObjectItemMapper$loadMStyleAssets$1.I$2 = i18;
                                                    mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z8;
                                                    mapObjectItemMapper$loadMStyleAssets$1.I$3 = i20;
                                                    mapObjectItemMapper$loadMStyleAssets$1.I$4 = i19;
                                                    mapObjectItemMapper$loadMStyleAssets$1.label = 6;
                                                    Object k7 = nohVar3.k(mapObjectItemMapper$loadMStyleAssets$1);
                                                    coroutineSingletons4 = coroutineSingletons4;
                                                    if (k7 != coroutineSingletons4) {
                                                        ixy0 ixy0Var12 = ixy0Var7;
                                                        bitmap3 = bitmap2;
                                                        i22 = i19;
                                                        i23 = i20;
                                                        z9 = z8;
                                                        i24 = i18;
                                                        obj5 = k7;
                                                        formattedText10 = formattedText3;
                                                        ixy0Var8 = ixy0Var12;
                                                        CoroutineSingletons coroutineSingletons7 = coroutineSingletons4;
                                                        zwy0Var2 = new zwy0(bitmap3, (Bitmap) obj5);
                                                        int i35 = i22;
                                                        qoh h = tje.h(tseVar5, null, null, new MapObjectItemMapper$loadMStyleAssets$title$1(formattedText10, this, null), 3);
                                                        qoh h2 = tje.h(tseVar5, null, null, new MapObjectItemMapper$loadMStyleAssets$subtitle$1(formattedText9, this, null), 3);
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$8 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$9 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$10 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$11 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$12 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$13 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$14 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$15 = h2;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$16 = ixy0Var8;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$17 = zwy0Var2;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$18 = zwy0Var;
                                                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i21;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i24;
                                                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z9;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i23;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$4 = i35;
                                                        mapObjectItemMapper$loadMStyleAssets$1.label = 7;
                                                        obj5 = h.s(mapObjectItemMapper$loadMStyleAssets$1);
                                                        coroutineSingletons5 = coroutineSingletons7;
                                                        if (obj5 != coroutineSingletons5) {
                                                            return coroutineSingletons5;
                                                        }
                                                        qohVar2 = h2;
                                                        i25 = i35;
                                                        i26 = i23;
                                                        z10 = z9;
                                                        zwy0Var3 = zwy0Var;
                                                        CharSequence charSequence2 = (CharSequence) obj5;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$8 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$9 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$10 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$11 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$12 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$13 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$14 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$15 = null;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$16 = ixy0Var8;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$17 = zwy0Var2;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$18 = zwy0Var3;
                                                        mapObjectItemMapper$loadMStyleAssets$1.L$19 = charSequence2;
                                                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i21;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i24;
                                                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z10;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i26;
                                                        mapObjectItemMapper$loadMStyleAssets$1.I$4 = i25;
                                                        mapObjectItemMapper$loadMStyleAssets$1.label = 8;
                                                        k2 = qohVar2.k(mapObjectItemMapper$loadMStyleAssets$1);
                                                        if (k2 != coroutineSingletons5) {
                                                            return coroutineSingletons5;
                                                        }
                                                        obj5 = k2;
                                                        charSequence = charSequence2;
                                                        ixy0Var9 = ixy0Var8;
                                                        zwy0Var4 = zwy0Var2;
                                                        return new pn00(ixy0Var9, zwy0Var4, zwy0Var3, charSequence, (CharSequence) obj5, i26 == 0);
                                                    }
                                                }
                                            }
                                            return coroutineSingletons4;
                                        }
                                    } else {
                                        z4 = z11;
                                        z5 = z12;
                                        tseVar3 = tseVar2;
                                        i9 = i6;
                                        ixy0Var2 = null;
                                        i10 = i7;
                                        i11 = i5;
                                        if (i4 != 0) {
                                        }
                                        ThemeType themeType2 = ThemeType.LIGHT;
                                        k7v a32 = ixy0Var.a(themeType2);
                                        qoh k32 = k(tseVar3, a32 != null ? a32.a : null, i31, i31);
                                        int i322 = i4;
                                        k7v a42 = ixy0Var.a(ThemeType.DARK);
                                        qoh k42 = k(tseVar3, a42 != null ? a42.a : null, i31, i31);
                                        qoh k52 = k(tseVar3, (ixy0Var2 != null || (a = ixy0Var2.a(themeType2)) == null) ? null : a.a, i9, i9);
                                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar3;
                                        tse tseVar62 = tseVar3;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText4;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$7 = ixy0Var2;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$8 = k32;
                                        mapObjectItemMapper$loadMStyleAssets$1.L$9 = k42;
                                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i10;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i9;
                                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z5;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i322;
                                        mapObjectItemMapper$loadMStyleAssets$1.I$4 = i31;
                                        ixy0 ixy0Var112 = ixy0Var2;
                                        mapObjectItemMapper$loadMStyleAssets$1.label = 3;
                                        s = k52.s(mapObjectItemMapper$loadMStyleAssets$1);
                                        if (s == coroutineSingletons6) {
                                        }
                                    }
                                }
                                return coroutineSingletons6;
                            }
                            tseVar2 = tseVar;
                            imageDto3 = imageDto2;
                            formattedText3 = formattedText;
                            formattedText4 = formattedText2;
                            i5 = i2;
                            i6 = i3;
                            k7v a5 = this.c.a(imageDto);
                            if (a5 != null) {
                                cavVar = null;
                                ixy0Var = new ixy0(a5, null);
                            } else {
                                cavVar = null;
                                ixy0Var = null;
                            }
                            i7 = i;
                            hbc0Var2 = hbc0Var;
                            if (ixy0Var == null) {
                            }
                        }
                        return null;
                    case 1:
                        int i36 = mapObjectItemMapper$loadMStyleAssets$1.I$3;
                        z3 = mapObjectItemMapper$loadMStyleAssets$1.Z$1;
                        int i37 = mapObjectItemMapper$loadMStyleAssets$1.I$2;
                        i8 = mapObjectItemMapper$loadMStyleAssets$1.I$1;
                        i7 = mapObjectItemMapper$loadMStyleAssets$1.I$0;
                        boolean z13 = mapObjectItemMapper$loadMStyleAssets$1.Z$0;
                        FormattedText formattedText13 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$5;
                        formattedText3 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$4;
                        ImageDto imageDto4 = (ImageDto) mapObjectItemMapper$loadMStyleAssets$1.L$3;
                        hbc0Var2 = (hbc0) mapObjectItemMapper$loadMStyleAssets$1.L$1;
                        tse tseVar8 = (tse) mapObjectItemMapper$loadMStyleAssets$1.L$0;
                        b.b(obj5);
                        formattedText4 = formattedText13;
                        imageDto3 = imageDto4;
                        i6 = i37;
                        z11 = z13;
                        tseVar2 = tseVar8;
                        obj = obj5;
                        i4 = i36;
                        int i282 = i8;
                        z12 = z3;
                        ixy0Var = (ixy0) obj;
                        i5 = i282;
                        cavVar = null;
                        if (ixy0Var == null) {
                        }
                        break;
                    case 2:
                        i12 = mapObjectItemMapper$loadMStyleAssets$1.I$3;
                        z6 = mapObjectItemMapper$loadMStyleAssets$1.Z$1;
                        i14 = mapObjectItemMapper$loadMStyleAssets$1.I$2;
                        i13 = mapObjectItemMapper$loadMStyleAssets$1.I$1;
                        i7 = mapObjectItemMapper$loadMStyleAssets$1.I$0;
                        z7 = mapObjectItemMapper$loadMStyleAssets$1.Z$0;
                        ixy0Var3 = (ixy0) mapObjectItemMapper$loadMStyleAssets$1.L$6;
                        formattedText6 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$5;
                        formattedText5 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$4;
                        tseVar3 = (tse) mapObjectItemMapper$loadMStyleAssets$1.L$0;
                        b.b(obj5);
                        ixy0 ixy0Var102 = (ixy0) obj5;
                        i4 = i12;
                        ixy0Var2 = ixy0Var102;
                        int i302 = i14;
                        z5 = z6;
                        ixy0Var = ixy0Var3;
                        z4 = z7;
                        i10 = i7;
                        i11 = i13;
                        i9 = i302;
                        FormattedText formattedText122 = formattedText5;
                        formattedText4 = formattedText6;
                        formattedText3 = formattedText122;
                        if (i4 != 0) {
                        }
                        ThemeType themeType22 = ThemeType.LIGHT;
                        k7v a322 = ixy0Var.a(themeType22);
                        qoh k322 = k(tseVar3, a322 != null ? a322.a : null, i31, i31);
                        int i3222 = i4;
                        k7v a422 = ixy0Var.a(ThemeType.DARK);
                        qoh k422 = k(tseVar3, a422 != null ? a422.a : null, i31, i31);
                        qoh k522 = k(tseVar3, (ixy0Var2 != null || (a = ixy0Var2.a(themeType22)) == null) ? null : a.a, i9, i9);
                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar3;
                        tse tseVar622 = tseVar3;
                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText4;
                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var;
                        mapObjectItemMapper$loadMStyleAssets$1.L$7 = ixy0Var2;
                        mapObjectItemMapper$loadMStyleAssets$1.L$8 = k322;
                        mapObjectItemMapper$loadMStyleAssets$1.L$9 = k422;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i10;
                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i9;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z5;
                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i3222;
                        mapObjectItemMapper$loadMStyleAssets$1.I$4 = i31;
                        ixy0 ixy0Var1122 = ixy0Var2;
                        mapObjectItemMapper$loadMStyleAssets$1.label = 3;
                        s = k522.s(mapObjectItemMapper$loadMStyleAssets$1);
                        if (s == coroutineSingletons6) {
                        }
                        break;
                    case 3:
                        int i38 = mapObjectItemMapper$loadMStyleAssets$1.I$4;
                        i15 = mapObjectItemMapper$loadMStyleAssets$1.I$3;
                        z5 = mapObjectItemMapper$loadMStyleAssets$1.Z$1;
                        i9 = mapObjectItemMapper$loadMStyleAssets$1.I$2;
                        i11 = mapObjectItemMapper$loadMStyleAssets$1.I$1;
                        i10 = mapObjectItemMapper$loadMStyleAssets$1.I$0;
                        z4 = mapObjectItemMapper$loadMStyleAssets$1.Z$0;
                        ?? r11 = (noh) mapObjectItemMapper$loadMStyleAssets$1.L$9;
                        nohVar = (noh) mapObjectItemMapper$loadMStyleAssets$1.L$8;
                        ixy0Var5 = (ixy0) mapObjectItemMapper$loadMStyleAssets$1.L$7;
                        ixy0 ixy0Var13 = (ixy0) mapObjectItemMapper$loadMStyleAssets$1.L$6;
                        formattedText7 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$5;
                        FormattedText formattedText14 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$4;
                        tseVar4 = (tse) mapObjectItemMapper$loadMStyleAssets$1.L$0;
                        b.b(obj5);
                        coroutineSingletons = coroutineSingletons6;
                        qohVar = r11;
                        formattedText3 = formattedText14;
                        i16 = i38;
                        obj2 = obj5;
                        ixy0Var4 = ixy0Var13;
                        bitmap = (Bitmap) obj2;
                        int i332 = i15;
                        if (ixy0Var5 != null) {
                            break;
                        }
                        qoh k62 = k(tseVar4, (ixy0Var5 != null || (a2 = ixy0Var5.a(ThemeType.DARK)) == null) ? null : a2.a, i9, i9);
                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar4;
                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText7;
                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var4;
                        mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$8 = nohVar;
                        mapObjectItemMapper$loadMStyleAssets$1.L$9 = qohVar;
                        mapObjectItemMapper$loadMStyleAssets$1.L$10 = bitmap;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i10;
                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i9;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z5;
                        i17 = i332;
                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i17;
                        tse tseVar72 = tseVar4;
                        mapObjectItemMapper$loadMStyleAssets$1.I$4 = i16;
                        mapObjectItemMapper$loadMStyleAssets$1.label = 4;
                        s2 = k62.s(mapObjectItemMapper$loadMStyleAssets$1);
                        coroutineSingletons2 = coroutineSingletons;
                        if (s2 != coroutineSingletons2) {
                        }
                        break;
                    case 4:
                        int i39 = mapObjectItemMapper$loadMStyleAssets$1.I$4;
                        int i40 = mapObjectItemMapper$loadMStyleAssets$1.I$3;
                        boolean z14 = mapObjectItemMapper$loadMStyleAssets$1.Z$1;
                        int i41 = mapObjectItemMapper$loadMStyleAssets$1.I$2;
                        i11 = mapObjectItemMapper$loadMStyleAssets$1.I$1;
                        i10 = mapObjectItemMapper$loadMStyleAssets$1.I$0;
                        z4 = mapObjectItemMapper$loadMStyleAssets$1.Z$0;
                        Bitmap bitmap5 = (Bitmap) mapObjectItemMapper$loadMStyleAssets$1.L$10;
                        nohVar3 = (noh) mapObjectItemMapper$loadMStyleAssets$1.L$9;
                        noh nohVar5 = (noh) mapObjectItemMapper$loadMStyleAssets$1.L$8;
                        ixy0 ixy0Var14 = (ixy0) mapObjectItemMapper$loadMStyleAssets$1.L$6;
                        FormattedText formattedText15 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$5;
                        FormattedText formattedText16 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$4;
                        tseVar5 = (tse) mapObjectItemMapper$loadMStyleAssets$1.L$0;
                        b.b(obj5);
                        i19 = i39;
                        obj3 = obj5;
                        i18 = i41;
                        z8 = z14;
                        coroutineSingletons3 = coroutineSingletons6;
                        ixy0Var6 = ixy0Var14;
                        formattedText8 = formattedText15;
                        bitmap = bitmap5;
                        nohVar2 = nohVar5;
                        formattedText3 = formattedText16;
                        i17 = i40;
                        Bitmap bitmap42 = (Bitmap) obj3;
                        noh nohVar42 = nohVar2;
                        if (bitmap == null) {
                        }
                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = tseVar5;
                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = formattedText3;
                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = formattedText8;
                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = ixy0Var6;
                        mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$8 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$9 = nohVar3;
                        mapObjectItemMapper$loadMStyleAssets$1.L$10 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$11 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$12 = zwy0Var;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i10;
                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i18;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z8;
                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i17;
                        mapObjectItemMapper$loadMStyleAssets$1.I$4 = i19;
                        mapObjectItemMapper$loadMStyleAssets$1.label = 5;
                        k = nohVar42.k(mapObjectItemMapper$loadMStyleAssets$1);
                        coroutineSingletons4 = coroutineSingletons3;
                        if (k != coroutineSingletons4) {
                        }
                        return coroutineSingletons4;
                    case 5:
                        int i42 = mapObjectItemMapper$loadMStyleAssets$1.I$4;
                        i20 = mapObjectItemMapper$loadMStyleAssets$1.I$3;
                        boolean z15 = mapObjectItemMapper$loadMStyleAssets$1.Z$1;
                        int i43 = mapObjectItemMapper$loadMStyleAssets$1.I$2;
                        i11 = mapObjectItemMapper$loadMStyleAssets$1.I$1;
                        int i44 = mapObjectItemMapper$loadMStyleAssets$1.I$0;
                        z4 = mapObjectItemMapper$loadMStyleAssets$1.Z$0;
                        zwy0 zwy0Var5 = (zwy0) mapObjectItemMapper$loadMStyleAssets$1.L$12;
                        nohVar3 = (noh) mapObjectItemMapper$loadMStyleAssets$1.L$9;
                        ixy0Var7 = (ixy0) mapObjectItemMapper$loadMStyleAssets$1.L$6;
                        FormattedText formattedText17 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$5;
                        FormattedText formattedText18 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$4;
                        tseVar5 = (tse) mapObjectItemMapper$loadMStyleAssets$1.L$0;
                        b.b(obj5);
                        coroutineSingletons4 = coroutineSingletons6;
                        i21 = i44;
                        formattedText9 = formattedText17;
                        zwy0Var = zwy0Var5;
                        formattedText3 = formattedText18;
                        obj4 = obj5;
                        i18 = i43;
                        z8 = z15;
                        i19 = i42;
                        bitmap2 = (Bitmap) obj4;
                        if (bitmap2 != null) {
                        }
                        return null;
                    case 6:
                        int i45 = mapObjectItemMapper$loadMStyleAssets$1.I$4;
                        int i46 = mapObjectItemMapper$loadMStyleAssets$1.I$3;
                        boolean z16 = mapObjectItemMapper$loadMStyleAssets$1.Z$1;
                        i24 = mapObjectItemMapper$loadMStyleAssets$1.I$2;
                        i11 = mapObjectItemMapper$loadMStyleAssets$1.I$1;
                        int i47 = mapObjectItemMapper$loadMStyleAssets$1.I$0;
                        boolean z17 = mapObjectItemMapper$loadMStyleAssets$1.Z$0;
                        bitmap3 = (Bitmap) mapObjectItemMapper$loadMStyleAssets$1.L$13;
                        zwy0 zwy0Var6 = (zwy0) mapObjectItemMapper$loadMStyleAssets$1.L$12;
                        ixy0 ixy0Var15 = (ixy0) mapObjectItemMapper$loadMStyleAssets$1.L$6;
                        formattedText9 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$5;
                        formattedText10 = (FormattedText) mapObjectItemMapper$loadMStyleAssets$1.L$4;
                        tseVar5 = (tse) mapObjectItemMapper$loadMStyleAssets$1.L$0;
                        b.b(obj5);
                        i23 = i46;
                        z9 = z16;
                        coroutineSingletons4 = coroutineSingletons6;
                        i21 = i47;
                        z4 = z17;
                        ixy0Var8 = ixy0Var15;
                        zwy0Var = zwy0Var6;
                        i22 = i45;
                        CoroutineSingletons coroutineSingletons72 = coroutineSingletons4;
                        zwy0Var2 = new zwy0(bitmap3, (Bitmap) obj5);
                        int i352 = i22;
                        qoh h3 = tje.h(tseVar5, null, null, new MapObjectItemMapper$loadMStyleAssets$title$1(formattedText10, this, null), 3);
                        qoh h22 = tje.h(tseVar5, null, null, new MapObjectItemMapper$loadMStyleAssets$subtitle$1(formattedText9, this, null), 3);
                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$8 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$9 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$10 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$11 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$12 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$13 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$14 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$15 = h22;
                        mapObjectItemMapper$loadMStyleAssets$1.L$16 = ixy0Var8;
                        mapObjectItemMapper$loadMStyleAssets$1.L$17 = zwy0Var2;
                        mapObjectItemMapper$loadMStyleAssets$1.L$18 = zwy0Var;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i21;
                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i24;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z9;
                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i23;
                        mapObjectItemMapper$loadMStyleAssets$1.I$4 = i352;
                        mapObjectItemMapper$loadMStyleAssets$1.label = 7;
                        obj5 = h3.s(mapObjectItemMapper$loadMStyleAssets$1);
                        coroutineSingletons5 = coroutineSingletons72;
                        if (obj5 != coroutineSingletons5) {
                        }
                        break;
                    case 7:
                        int i48 = mapObjectItemMapper$loadMStyleAssets$1.I$4;
                        int i49 = mapObjectItemMapper$loadMStyleAssets$1.I$3;
                        boolean z18 = mapObjectItemMapper$loadMStyleAssets$1.Z$1;
                        int i50 = mapObjectItemMapper$loadMStyleAssets$1.I$2;
                        int i51 = mapObjectItemMapper$loadMStyleAssets$1.I$1;
                        int i52 = mapObjectItemMapper$loadMStyleAssets$1.I$0;
                        boolean z19 = mapObjectItemMapper$loadMStyleAssets$1.Z$0;
                        zwy0 zwy0Var7 = (zwy0) mapObjectItemMapper$loadMStyleAssets$1.L$18;
                        zwy0Var2 = (zwy0) mapObjectItemMapper$loadMStyleAssets$1.L$17;
                        ixy0 ixy0Var16 = (ixy0) mapObjectItemMapper$loadMStyleAssets$1.L$16;
                        ?? r10 = (noh) mapObjectItemMapper$loadMStyleAssets$1.L$15;
                        b.b(obj5);
                        i25 = i48;
                        i26 = i49;
                        qohVar2 = r10;
                        ixy0Var8 = ixy0Var16;
                        z4 = z19;
                        coroutineSingletons5 = coroutineSingletons6;
                        i21 = i52;
                        i11 = i51;
                        i24 = i50;
                        z10 = z18;
                        zwy0Var3 = zwy0Var7;
                        CharSequence charSequence22 = (CharSequence) obj5;
                        mapObjectItemMapper$loadMStyleAssets$1.L$0 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$1 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$2 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$3 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$4 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$5 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$6 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$7 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$8 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$9 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$10 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$11 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$12 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$13 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$14 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$15 = null;
                        mapObjectItemMapper$loadMStyleAssets$1.L$16 = ixy0Var8;
                        mapObjectItemMapper$loadMStyleAssets$1.L$17 = zwy0Var2;
                        mapObjectItemMapper$loadMStyleAssets$1.L$18 = zwy0Var3;
                        mapObjectItemMapper$loadMStyleAssets$1.L$19 = charSequence22;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$0 = z4;
                        mapObjectItemMapper$loadMStyleAssets$1.I$0 = i21;
                        mapObjectItemMapper$loadMStyleAssets$1.I$1 = i11;
                        mapObjectItemMapper$loadMStyleAssets$1.I$2 = i24;
                        mapObjectItemMapper$loadMStyleAssets$1.Z$1 = z10;
                        mapObjectItemMapper$loadMStyleAssets$1.I$3 = i26;
                        mapObjectItemMapper$loadMStyleAssets$1.I$4 = i25;
                        mapObjectItemMapper$loadMStyleAssets$1.label = 8;
                        k2 = qohVar2.k(mapObjectItemMapper$loadMStyleAssets$1);
                        if (k2 != coroutineSingletons5) {
                        }
                        break;
                    case 8:
                        i26 = mapObjectItemMapper$loadMStyleAssets$1.I$3;
                        charSequence = (CharSequence) mapObjectItemMapper$loadMStyleAssets$1.L$19;
                        zwy0Var3 = (zwy0) mapObjectItemMapper$loadMStyleAssets$1.L$18;
                        zwy0Var4 = (zwy0) mapObjectItemMapper$loadMStyleAssets$1.L$17;
                        ixy0Var9 = (ixy0) mapObjectItemMapper$loadMStyleAssets$1.L$16;
                        b.b(obj5);
                        return new pn00(ixy0Var9, zwy0Var4, zwy0Var3, charSequence, (CharSequence) obj5, i26 == 0);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mapObjectItemMapper$loadMStyleAssets$1 = new MapObjectItemMapper$loadMStyleAssets$1(this, continuationImpl);
        Object obj52 = mapObjectItemMapper$loadMStyleAssets$1.result;
        CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (mapObjectItemMapper$loadMStyleAssets$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(e eVar, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapModel$1 mapObjectItemMapper$mapModel$1;
        int i;
        if (continuationImpl instanceof MapObjectItemMapper$mapModel$1) {
            mapObjectItemMapper$mapModel$1 = (MapObjectItemMapper$mapModel$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectItemMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapModel$1.label;
                if (i != 0) {
                    b.b(obj);
                    PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                    mapObjectItemMapper$mapModel$1.L$0 = eVar;
                    mapObjectItemMapper$mapModel$1.label = 1;
                    obj = this.j.a(placesMapConfig$PlacesMapScreenName, mapObjectItemMapper$mapModel$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    eVar = (e) mapObjectItemMapper$mapModel$1.L$0;
                    b.b(obj);
                }
                mapObjectItemMapper$mapModel$1.L$0 = null;
                mapObjectItemMapper$mapModel$1.L$1 = null;
                mapObjectItemMapper$mapModel$1.label = 2;
                Object n = bvf0.n(new MapObjectItemMapper$mapModel$3((hbc0) obj, this, eVar, null), mapObjectItemMapper$mapModel$1);
                return n != coroutineSingletons ? coroutineSingletons : n;
            }
        }
        mapObjectItemMapper$mapModel$1 = new MapObjectItemMapper$mapModel$1(this, continuationImpl);
        Object obj2 = mapObjectItemMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapModel$1.label;
        if (i != 0) {
        }
        mapObjectItemMapper$mapModel$1.L$0 = null;
        mapObjectItemMapper$mapModel$1.L$1 = null;
        mapObjectItemMapper$mapModel$1.label = 2;
        Object n2 = bvf0.n(new MapObjectItemMapper$mapModel$3((hbc0) obj2, this, eVar, null), mapObjectItemMapper$mapModel$1);
        if (n2 != coroutineSingletons2) {
        }
    }

    public final Object o(List list, ContinuationImpl continuationImpl) {
        return bvf0.n(new MapObjectItemMapper$mapModels$2(this, list, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(tse tseVar, ImageDto imageDto, List list, FormattedText formattedText, FormattedText formattedText2, boolean z, boolean z2, hbc0 hbc0Var, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$mapToPinStyleL$1 mapObjectItemMapper$mapToPinStyleL$1;
        int i;
        boolean z3;
        on00 on00Var;
        if (continuationImpl instanceof MapObjectItemMapper$mapToPinStyleL$1) {
            mapObjectItemMapper$mapToPinStyleL$1 = (MapObjectItemMapper$mapToPinStyleL$1) continuationImpl;
            int i2 = mapObjectItemMapper$mapToPinStyleL$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$mapToPinStyleL$1.label = i2 - Integer.MIN_VALUE;
                MapObjectItemMapper$mapToPinStyleL$1 mapObjectItemMapper$mapToPinStyleL$12 = mapObjectItemMapper$mapToPinStyleL$1;
                Object obj = mapObjectItemMapper$mapToPinStyleL$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$mapToPinStyleL$12.label;
                if (i != 0) {
                    b.b(obj);
                    ofc0 ofc0Var = this.i;
                    int i3 = ofc0Var.a;
                    int i4 = ofc0Var.b;
                    int intValue = ((Number) this.r.getValue()).intValue();
                    mapObjectItemMapper$mapToPinStyleL$12.L$0 = null;
                    mapObjectItemMapper$mapToPinStyleL$12.L$1 = null;
                    mapObjectItemMapper$mapToPinStyleL$12.L$2 = null;
                    mapObjectItemMapper$mapToPinStyleL$12.L$3 = null;
                    mapObjectItemMapper$mapToPinStyleL$12.L$4 = null;
                    mapObjectItemMapper$mapToPinStyleL$12.L$5 = null;
                    z3 = z;
                    mapObjectItemMapper$mapToPinStyleL$12.Z$0 = z3;
                    mapObjectItemMapper$mapToPinStyleL$12.Z$1 = z2;
                    mapObjectItemMapper$mapToPinStyleL$12.label = 1;
                    obj = l(tseVar, hbc0Var, imageDto, list, formattedText, formattedText2, z2, i3, i4, intValue, mapObjectItemMapper$mapToPinStyleL$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = mapObjectItemMapper$mapToPinStyleL$12.Z$0;
                    b.b(obj);
                    z3 = z4;
                }
                on00Var = (on00) obj;
                if (on00Var != null) {
                    return null;
                }
                return new bo00(on00Var.a, on00Var.b, on00Var.c, on00Var.d, on00Var.e, on00Var.f, on00Var.g, z3);
            }
        }
        mapObjectItemMapper$mapToPinStyleL$1 = new MapObjectItemMapper$mapToPinStyleL$1(this, continuationImpl);
        MapObjectItemMapper$mapToPinStyleL$1 mapObjectItemMapper$mapToPinStyleL$122 = mapObjectItemMapper$mapToPinStyleL$1;
        Object obj3 = mapObjectItemMapper$mapToPinStyleL$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$mapToPinStyleL$122.label;
        if (i != 0) {
        }
        on00Var = (on00) obj3;
        if (on00Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ImageDto imageDto, cav cavVar, boolean z, ContinuationImpl continuationImpl) {
        MapObjectItemMapper$themedImageOrFavorite$1 mapObjectItemMapper$themedImageOrFavorite$1;
        int i;
        jxy0 jxy0Var;
        if (continuationImpl instanceof MapObjectItemMapper$themedImageOrFavorite$1) {
            mapObjectItemMapper$themedImageOrFavorite$1 = (MapObjectItemMapper$themedImageOrFavorite$1) continuationImpl;
            int i2 = mapObjectItemMapper$themedImageOrFavorite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectItemMapper$themedImageOrFavorite$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectItemMapper$themedImageOrFavorite$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectItemMapper$themedImageOrFavorite$1.label;
                if (i != 0) {
                    b.b(obj);
                    mapObjectItemMapper$themedImageOrFavorite$1.L$0 = imageDto;
                    mapObjectItemMapper$themedImageOrFavorite$1.L$1 = cavVar;
                    mapObjectItemMapper$themedImageOrFavorite$1.Z$0 = z;
                    mapObjectItemMapper$themedImageOrFavorite$1.label = 1;
                    obj = this.k.a(mapObjectItemMapper$themedImageOrFavorite$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = mapObjectItemMapper$themedImageOrFavorite$1.Z$0;
                    cavVar = (cav) mapObjectItemMapper$themedImageOrFavorite$1.L$1;
                    imageDto = (ImageDto) mapObjectItemMapper$themedImageOrFavorite$1.L$0;
                    b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                jxy0Var = this.d;
                if (z || cavVar == null || booleanValue) {
                    return jxy0Var.b(imageDto);
                }
                jxy0Var.getClass();
                return jxy0Var.a(cavVar.b, cavVar.a);
            }
        }
        mapObjectItemMapper$themedImageOrFavorite$1 = new MapObjectItemMapper$themedImageOrFavorite$1(this, continuationImpl);
        Object obj2 = mapObjectItemMapper$themedImageOrFavorite$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectItemMapper$themedImageOrFavorite$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        jxy0Var = this.d;
        if (z) {
        }
        return jxy0Var.b(imageDto);
    }
}
