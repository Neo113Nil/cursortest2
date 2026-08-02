package xsna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import java.util.List;
import xsna.ec40;

/* compiled from: MyAudiosBottomSheet.kt */
/* loaded from: classes3.dex */
public final class go50 extends dc40 {
    public final Playlist e;
    public final ec40.a<Playlist> f;

    public go50(Playlist playlist, ec40.a<Playlist> aVar) {
        super(false);
        this.e = playlist;
        this.f = aVar;
    }

    @Override // xsna.dc40
    public final List<RecyclerView.Adapter<?>> a(AppCompatActivity appCompatActivity) {
        ze5 ze5Var = new ze5(this.f, this);
        ArrayList arrayList = new ArrayList();
        List a = new hkp(this.e).a();
        this.d = iah0.a(8);
        fc40 fc40Var = new fc40(ze5Var, this.b);
        fc40Var.setItems(a);
        arrayList.add(fc40Var);
        return arrayList;
    }
}
