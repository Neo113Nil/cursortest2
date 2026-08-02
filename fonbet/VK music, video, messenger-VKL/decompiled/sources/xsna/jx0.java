package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.dto.geo.GeoLocation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import xsna.lbf;
import xsna.snw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jx0 implements wut0, pcs, jbg0, iy3, yads.uq2 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jx0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.uq2
    public void a(yads.mn3 mn3Var) {
        yads.ek0.a((yads.ek0) this.b, (String) this.c, mn3Var);
    }

    @Override // xsna.iy3
    /* renamed from: apply */
    public ugz mo416apply(Object obj) {
        xon0 xon0Var = (xon0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        List list = (List) obj;
        xon0Var.toString();
        return list.contains(null) ? new snw.a(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) arrayList.get(list.indexOf(null)))) : list.isEmpty() ? new snw.a(new IllegalArgumentException("Unable to open capture session without surfaces")) : r0t.d(list);
    }

    @Override // xsna.jbg0
    public void c(String str) {
        lfx lfxVar = (lfx) this.b;
        zpa0 zpa0Var = (zpa0) this.c;
        if (lfxVar.b) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                lfxVar.a.a(jSONArray.getJSONObject(0).getString("html"), new kfx(lfxVar, zpa0Var), new ox0(lfxVar, zpa0Var));
            }
        } catch (Exception e) {
            lfx.c(zpa0Var, e);
        }
    }

    @Override // xsna.wut0
    public vut0 create(Context context) {
        return new lx0(((nx0) this.b).a.create(((View) this.c).getContext()));
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        FragmentManager fragmentManager = (FragmentManager) this.b;
        hjf hjfVar = (hjf) this.c;
        String str2 = ClipsUploadFragmentImpl.a0;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("geo_bundle", GeoLocation.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("geo_bundle");
            if (!(parcelable3 instanceof GeoLocation)) {
                parcelable3 = null;
            }
            parcelable = (GeoLocation) parcelable3;
        }
        GeoLocation geoLocation = (GeoLocation) parcelable;
        if (geoLocation != null) {
            hjfVar.b(new lbf.c.i.a(geoLocation));
        }
        fragmentManager.f("geo_result");
    }

    public /* synthetic */ jx0(lfx lfxVar, String str, zpa0 zpa0Var) {
        this.b = lfxVar;
        this.c = zpa0Var;
    }
}
