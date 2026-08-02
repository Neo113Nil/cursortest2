package xsna;

import android.os.SystemClock;
import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.video.VideoAlbum;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.cvd0;
import xsna.o360;
import xsna.sst0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n360 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n360(o360 o360Var, boolean z, String str) {
        this.d = o360Var;
        this.c = z;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<sst0.b> list;
        List<sst0.b> list2;
        ArrayList arrayList;
        List list3;
        switch (this.b) {
            case 0:
                o360 o360Var = (o360) this.d;
                boolean z = this.c;
                String str = (String) this.e;
                lkw lkwVar = (lkw) obj;
                o360Var.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                lkwVar.g = Long.valueOf(elapsedRealtime);
                lkwVar.h = Boolean.valueOf(z);
                List<o360.b> d = o360Var.c.d(str);
                if (d != null) {
                    Iterator<T> it = d.iterator();
                    while (it.hasNext()) {
                        ((o360.b) it.next()).c(elapsedRealtime, Boolean.valueOf(z));
                    }
                }
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = o360Var.a;
                lkwVar.b = mobileOfficialAppsCoreNavStat$EventScreen != null ? com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen) : null;
                break;
            default:
                boq0 boq0Var = (boq0) this.d;
                sst0 sst0Var = (sst0) this.e;
                boolean z2 = this.c;
                Triple triple = (Triple) obj;
                VKList<VideoFile> vKList = (VKList) ((it80) triple.i()).a;
                List list4 = (List) ((it80) triple.j()).a;
                DonutGetLevelsResponseDto donutGetLevelsResponseDto = (DonutGetLevelsResponseDto) ((it80) triple.k()).a;
                if (z2 && ((vKList == null || vKList.isEmpty()) && ((list3 = list4) == null || list3.isEmpty()))) {
                    boq0Var.D(sst0.i(sst0Var, null, null, null, null, false, false, null, CommunityProfileContentItem.State.EMPTY, null, 31743));
                } else {
                    if (vKList != null) {
                        ArrayList arrayList2 = new ArrayList();
                        List<sst0.b> list5 = sst0Var.j;
                        if (list5 != null) {
                            arrayList2.addAll(list5);
                        }
                        if (((Boolean) boq0Var.s.getValue()).booleanValue()) {
                            arrayList = new ArrayList(c5g.u(vKList, 10));
                            for (VideoFile videoFile : vKList) {
                                tuh tuhVar = (tuh) boq0Var.r.getValue();
                                List<DonutLevelDto> e = donutGetLevelsResponseDto != null ? donutGetLevelsResponseDto.e() : null;
                                if (e == null) {
                                    e = EmptyList.b;
                                }
                                arrayList.add(tuhVar.a(e, videoFile));
                            }
                        } else {
                            arrayList = new ArrayList(c5g.u(vKList, 10));
                            Iterator<T> it2 = vKList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new sst0.b((VideoFile) it2.next(), (sst0.b.c) null, (sst0.b.C3688b) null, (sst0.b.d) null, 30));
                            }
                        }
                        arrayList2.addAll(arrayList);
                        sst0Var = sst0.i(sst0Var, arrayList2, null, null, null, myc0.f(vKList.j()) && !arrayList.isEmpty(), false, vKList.j(), z2 ? CommunityProfileContentItem.State.LOADED : sst0Var.t, z2 ? sst0Var.v : CommunityProfileContentItem.State.LOADED, 27502);
                    }
                    if (list4 != null) {
                        cvd0.e eVar = sst0Var.k;
                        List<VideoAlbum> list6 = eVar != null ? eVar.a : null;
                        if (list6 == null) {
                            list6 = EmptyList.b;
                        }
                        ArrayList u0 = j5g.u0(list4, list6);
                        if (sst0Var.l.h()) {
                            sst0Var = sst0.i(sst0Var, null, new cvd0.e(u0), null, String.valueOf(u0.size()), list4.size() == 30, false, null, z2 ? CommunityProfileContentItem.State.LOADED : sst0Var.t, z2 ? sst0Var.v : CommunityProfileContentItem.State.LOADED, 27621);
                        } else {
                            sst0Var = sst0.i(sst0Var, null, new cvd0.e(j5g.H0(u0, 6)), null, null, false, list4.size() > 6, null, null, null, 32733);
                        }
                    }
                    if (z2) {
                        CommunityProfileContentItem.ContentType contentType = sst0Var.l;
                        cvd0.e eVar2 = sst0Var.k;
                        List<sst0.b> list7 = sst0Var.j;
                        if (contentType.l() && ((list2 = list7) == null || list2.isEmpty())) {
                            sst0Var = sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.ALBUMS, null, false, false, null, null, null, 32763);
                        } else {
                            if (contentType.l()) {
                                List<VideoAlbum> list8 = eVar2 != null ? eVar2.a : null;
                                if (list8 == null || list8.isEmpty()) {
                                    sst0Var = sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, null, null, null, 32763);
                                }
                            }
                            if (contentType.h() && (list = list7) != null && !list.isEmpty()) {
                                sst0Var = sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, 32763);
                            } else if (contentType.j()) {
                                List<VideoAlbum> list9 = eVar2 != null ? eVar2.a : null;
                                if (list9 != null && !list9.isEmpty()) {
                                    sst0Var = sst0.i(sst0Var, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, 32763);
                                }
                            }
                        }
                    }
                    boq0Var.D(sst0Var);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n360(boq0 boq0Var, sst0 sst0Var, boolean z) {
        this.d = boq0Var;
        this.e = sst0Var;
        this.c = z;
    }
}
