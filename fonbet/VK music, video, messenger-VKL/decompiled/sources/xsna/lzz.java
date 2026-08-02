package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.geo.GeoLocation;
import java.util.List;
import xsna.nxz;

/* compiled from: LocationVc.kt */
/* loaded from: classes2.dex */
public abstract class lzz {
    public RecyclerView a;

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void b();

    public abstract void c(float f);

    public abstract void d(nxz.d dVar);

    public abstract void e(GeoLocation geoLocation);

    public abstract void f();

    public abstract void g(boolean z);

    public abstract void h(boolean z);

    public abstract void i(List<GeoLocation> list, boolean z);
}
