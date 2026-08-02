package xsna;

import android.os.Parcelable;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.superApp.dto.SuperAppGetShowcaseResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppItemUpdateOptionsDto;
import com.vk.api.generated.superApp.dto.SuperAppQueueSubscriptionInfoDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseConfigurationDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseStubsDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseTileDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vk.superapp.api.dto.configurations.ShowcaseConfigurationExtra;
import com.vk.superapp.api.dto.configurations.ShowcaseConfigurationMenu;
import com.vk.superapp.api.dto.configurations.ShowcaseConfigurationSettings;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.UpdateOptions;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.api.dto.widgets.InvalidWidgetInfo;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.widgets.HeaderRightImageType;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import com.vk.superapp.ui.widgets.api.StubTiles;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import com.vk.uxpolls.presentation.view.PollsWebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.uaw;

/* compiled from: ActionStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class r50 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r50(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        SuperAppWidgetTile superAppWidgetTile;
        SuperAppGetShowcaseResponseDto superAppGetShowcaseResponseDto;
        SuperAppWidgetHalfTile superAppWidgetHalfTile;
        ArrayList arrayList;
        Parcelable showcaseConfigurationSettings;
        String e;
        String d;
        String f;
        Boolean e2;
        Integer d2;
        SuperAppShowcaseHalfTileDto d3;
        SuperAppShowcaseTileDto e3;
        Object failure;
        boolean z = false;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                break;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                break;
            case 2:
                ipm ipmVar = (ipm) obj;
                pim pimVar = (pim) this.receiver;
                f9w f9wVar = pim.q;
                pimVar.getClass();
                pimVar.Y0(ipmVar.a, true);
                btk0 btk0Var = pimVar.l;
                btk0Var.d = false;
                DialogExt a = ipmVar.a(btk0Var.a.e);
                if (a.d.c()) {
                    pimVar.l.a.d.a = true;
                } else {
                    pimVar.l.a = a;
                }
                pimVar.l.e = null;
                pimVar.X0();
                pimVar.d1();
                break;
            case 3:
                uaw uawVar = (uaw) this.receiver;
                bpn0 bpn0Var = uaw.e;
                uawVar.getClass();
                for (Map.Entry<Long, Collection<Pair<Integer, Integer>>> entry : ((q980) obj).c.entrySet()) {
                    long longValue = entry.getKey().longValue();
                    Iterator<T> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        uawVar.e(new uaw.a(longValue, ((Number) pair.first).intValue(), ((Number) pair.second).intValue()));
                    }
                }
                break;
            case 4:
                obj2 = v81.a(this.receiver).get(vw6.b(obj));
                break;
            case 5:
                chm0 chm0Var = (chm0) obj;
                ((igm0) this.receiver).getClass();
                break;
            case 6:
                SuperAppGetShowcaseResponseDto superAppGetShowcaseResponseDto2 = (SuperAppGetShowcaseResponseDto) obj;
                ((rbn0) this.receiver).getClass();
                new ykg();
                List<AppsAppMinDto> g = superAppGetShowcaseResponseDto2.g();
                ArrayList arrayList2 = new ArrayList(c5g.u(g, 10));
                Iterator<T> it2 = g.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(ykg.d((AppsAppMinDto) it2.next()));
                }
                List<AppsAppDto> e4 = superAppGetShowcaseResponseDto2.e();
                ArrayList arrayList3 = new ArrayList(c5g.u(e4, 10));
                Iterator<T> it3 = e4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(ykg.c((AppsAppDto) it3.next()));
                }
                ArrayList u0 = j5g.u0(arrayList3, arrayList2);
                int e5 = on00.e(c5g.u(u0, 10));
                if (e5 < 16) {
                    e5 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e5);
                Iterator it4 = u0.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    linkedHashMap.put(Long.valueOf(((WebApiApplication) next).b), next);
                }
                List<UsersUserFullDto> k = superAppGetShowcaseResponseDto2.k();
                ArrayList arrayList4 = new ArrayList(c5g.u(k, 10));
                Iterator<T> it5 = k.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ks20.l((UsersUserFullDto) it5.next()));
                }
                int e6 = on00.e(c5g.u(arrayList4, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(e6 >= 16 ? e6 : 16);
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    linkedHashMap2.put(Long.valueOf(((WebUserShortInfo) next2).b.b), next2);
                }
                WidgetObjects widgetObjects = new WidgetObjects(linkedHashMap, linkedHashMap2, jgp.b);
                knx0 knx0Var = new knx0(widgetObjects);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList(0);
                for (SuperAppShowcaseItemDto superAppShowcaseItemDto : superAppGetShowcaseResponseDto2.f()) {
                    try {
                        failure = knx0Var.i(superAppShowcaseItemDto);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (!(failure instanceof Result.Failure)) {
                        arrayList5.add((SuperAppWidget) failure);
                    }
                    Throwable a2 = Result.a(failure);
                    if (a2 != null) {
                        arrayList6.add(new InvalidWidgetInfo(superAppShowcaseItemDto.g(), a2, InvalidWidgetInfo.Source.SUPER_APP_GET));
                    }
                }
                SuperAppShowcaseStubsDto o = superAppGetShowcaseResponseDto2.o();
                if (o == null || (e3 = o.e()) == null) {
                    superAppWidgetTile = null;
                } else {
                    String i = e3.i();
                    if (i == null) {
                        i = "";
                    }
                    superAppWidgetTile = new SuperAppWidgetTile(new WidgetIds(i, 0, "", ""), "", SuperAppWidgetSize.REGULAR, new QueueSettings(false, false), new WidgetSettings(true, false, false, false, 12, null), knx0Var.g(e3.d(), e3.e(), e3.r(), e3.j(), e3.g(), e3.f()));
                }
                if (o == null || (d3 = o.d()) == null) {
                    superAppGetShowcaseResponseDto = superAppGetShowcaseResponseDto2;
                    superAppWidgetHalfTile = null;
                } else {
                    String f2 = d3.f();
                    if (f2 == null) {
                        f2 = "";
                    }
                    superAppGetShowcaseResponseDto = superAppGetShowcaseResponseDto2;
                    superAppWidgetHalfTile = new SuperAppWidgetHalfTile(new WidgetIds(f2, 0, "", ""), "", SuperAppWidgetSize.REGULAR, new QueueSettings(false, false), new WidgetSettings(true, false, false, false, 12, null), new SuperAppWidgetHalfTile.Payload(ks20.m(d3.d()), ((vsu) knx0Var.d.getValue()).a(d3.e()), new WidgetBasePayload(d3.r(), d3.g(), null, null, HeaderRightImageType.NONE)));
                }
                StubTiles stubTiles = (superAppWidgetTile == null && superAppWidgetHalfTile == null) ? null : new StubTiles(superAppWidgetTile, superAppWidgetHalfTile);
                EmptySet emptySet = EmptySet.b;
                SuperAppItemUpdateOptionsDto p = superAppGetShowcaseResponseDto.p();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                int intValue = (p == null || (d2 = p.d()) == null) ? 1200 : d2.intValue();
                if (p != null && (e2 = p.e()) != null) {
                    z = e2.booleanValue();
                }
                UpdateOptions updateOptions = new UpdateOptions(currentTimeMillis, intValue, z);
                SuperAppQueueSubscriptionInfoDto l = superAppGetShowcaseResponseDto.l();
                QueueParams queueParams = new QueueParams((l == null || (f = l.f()) == null) ? "" : f, (l == null || (d = l.d()) == null) ? "" : d, (l == null || (e = l.e()) == null) ? "" : e, l != null ? l.g() : 0L, false, 16, null);
                int n = superAppGetShowcaseResponseDto.n();
                Integer i2 = superAppGetShowcaseResponseDto.i();
                String j = superAppGetShowcaseResponseDto.j();
                String r = superAppGetShowcaseResponseDto.r();
                List<SuperAppShowcaseConfigurationDto> d4 = superAppGetShowcaseResponseDto.d();
                if (d4 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    for (SuperAppShowcaseConfigurationDto superAppShowcaseConfigurationDto : d4) {
                        if (superAppShowcaseConfigurationDto instanceof SuperAppShowcaseConfigurationDto.SuperAppShowcaseConfigurationExtraDto) {
                            showcaseConfigurationSettings = new ShowcaseConfigurationExtra(((SuperAppShowcaseConfigurationDto.SuperAppShowcaseConfigurationExtraDto) superAppShowcaseConfigurationDto).d());
                        } else if (superAppShowcaseConfigurationDto instanceof SuperAppShowcaseConfigurationDto.SuperAppShowcaseConfigurationMenuDto) {
                            SuperAppShowcaseConfigurationDto.SuperAppShowcaseConfigurationMenuDto superAppShowcaseConfigurationMenuDto = (SuperAppShowcaseConfigurationDto.SuperAppShowcaseConfigurationMenuDto) superAppShowcaseConfigurationDto;
                            showcaseConfigurationSettings = new ShowcaseConfigurationMenu(superAppShowcaseConfigurationMenuDto.e(), superAppShowcaseConfigurationMenuDto.f(), superAppShowcaseConfigurationMenuDto.d());
                        } else {
                            showcaseConfigurationSettings = superAppShowcaseConfigurationDto instanceof SuperAppShowcaseConfigurationDto.SuperAppShowcaseConfigurationSettingsDto ? new ShowcaseConfigurationSettings(((SuperAppShowcaseConfigurationDto.SuperAppShowcaseConfigurationSettingsDto) superAppShowcaseConfigurationDto).d()) : null;
                        }
                        if (showcaseConfigurationSettings != null) {
                            arrayList7.add(showcaseConfigurationSettings);
                        }
                    }
                    arrayList = arrayList7;
                } else {
                    arrayList = null;
                }
                break;
            case 7:
                PollsWebView pollsWebView = (PollsWebView) obj;
                c5r0 c5r0Var = (c5r0) this.receiver;
                int i3 = c5r0.K;
                c5r0Var.getClass();
                pollsWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 1));
                ViewParent parent = pollsWebView.getParent();
                if (parent instanceof ViewGroup) {
                    L.l("The specified child already has a parent.");
                    ((ViewGroup) parent).removeView(pollsWebView);
                }
                c5r0Var.E.addView(pollsWebView, 0);
                bwt0.p0(c5r0Var.G, true ^ pollsWebView.h());
                pollsWebView.setPollsListener(c5r0Var);
                c5r0Var.H = pollsWebView;
                break;
            case 8:
                L.i((Throwable) obj);
                break;
            default:
                gxu gxuVar = (gxu) this.receiver;
                gxuVar.k.a((pna0) obj);
                gxuVar.v0(gxuVar.h.c());
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, t92.f(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
                break;
            case 5:
                super(1, obj, igm0.class, "buildPreviewBlur", "buildPreviewBlur(Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsState;)Z", 0);
                break;
            case 6:
                super(1, obj, rbn0.class, "mapResponse", "mapResponse(Lcom/vk/api/generated/superApp/dto/SuperAppGetShowcaseResponseDto;)Lcom/vk/superapp/ui/widgets/api/SuperAppMenuResponse;", 0);
                break;
            case 7:
            default:
                break;
            case 8:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, gxu.class, "updatePinBadge", "updatePinBadge(Lcom/vk/voip/ui/viewholder/indicators/PinState;)V", 0);
                break;
        }
    }
}
