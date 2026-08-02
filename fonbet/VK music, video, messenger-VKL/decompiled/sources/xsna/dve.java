package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.cve;
import xsna.fve;

/* compiled from: ClipsPlaylistsSmallFoldersReducer.kt */
/* loaded from: classes16.dex */
public final class dve extends dm50<kve, cve, fve> {
    public final bpn0 d;

    public dve(UserId userId, boolean z) {
        super(new fve.c(userId, z));
        this.d = new bpn0(new pd4(4));
    }

    @Override // xsna.dm50
    public final fve c(fve fveVar, cve cveVar) {
        fve fveVar2 = fveVar;
        cve cveVar2 = cveVar;
        if (cveVar2 instanceof cve.c) {
            cve.c cVar = (cve.c) cveVar2;
            return (cVar.d && (fveVar2 instanceof fve.b)) ? fve.b.a((fve.b) fveVar2, false, null, null, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) : new fve.c(cVar.c, cVar.b);
        }
        if (!(cveVar2 instanceof cve.d)) {
            if (cveVar2.equals(cve.b.b)) {
                return new fve.a(fveVar2.q(), fveVar2.d());
            }
            if (cveVar2.equals(cve.a.b)) {
                return fveVar2 instanceof fve.b ? fve.b.a((fve.b) fveVar2, false, null, null, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) : fveVar2;
            }
            if (cveVar2 instanceof cve.e) {
                return fveVar2 instanceof fve.b ? fve.b.a((fve.b) fveVar2, false, null, null, ((cve.e) cveVar2).b, 111) : fveVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        cve.d dVar = (cve.d) cveVar2;
        boolean z = dVar.c;
        UserId userId = dVar.d;
        ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = dVar.b;
        if (!z && shortVideoGetPlaylistsResponseDto.getCount() == 0) {
            return new fve.a(userId, z);
        }
        if (!(fveVar2 instanceof fve.b)) {
            return new fve.b(dVar.c, dVar.d, shortVideoGetPlaylistsResponseDto.d(), shortVideoGetPlaylistsResponseDto.g(), false, shortVideoGetPlaylistsResponseDto.e(), shortVideoGetPlaylistsResponseDto.getCount());
        }
        fve.b bVar = (fve.b) fveVar2;
        if (!epx.f(userId, bVar.c) || dVar.e) {
            return new fve.b(dVar.c, dVar.d, shortVideoGetPlaylistsResponseDto.d(), shortVideoGetPlaylistsResponseDto.g(), bVar.f, shortVideoGetPlaylistsResponseDto.e(), shortVideoGetPlaylistsResponseDto.getCount());
        }
        ArrayList u0 = j5g.u0(shortVideoGetPlaylistsResponseDto.d(), bVar.d);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(Integer.valueOf(((ShortVideoPlaylistFullDto) next).getId()))) {
                arrayList.add(next);
            }
        }
        return fve.b.a(bVar, dVar.c, arrayList, shortVideoGetPlaylistsResponseDto.g(), false, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
    }

    @Override // xsna.dm50
    public final kve d() {
        return new kve(e(new sc(11)), e(new tc(11)), e(new qqe(this, 1)));
    }

    @Override // xsna.dm50
    public final void h(fve fveVar, kve kveVar) {
        fve fveVar2 = fveVar;
        kve kveVar2 = kveVar;
        if (fveVar2 instanceof fve.a) {
            f(kveVar2.b, fveVar2);
        } else if (fveVar2 instanceof fve.b) {
            f(kveVar2.c, fveVar2);
        } else {
            if (!(fveVar2 instanceof fve.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f(kveVar2.a, fveVar2);
        }
    }
}
