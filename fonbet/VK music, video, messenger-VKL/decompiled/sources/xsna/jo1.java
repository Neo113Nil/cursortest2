package xsna;

import android.database.ContentObserver;
import android.os.Handler;
import com.vk.mediastore.system.AlbumEntry;
import java.util.List;

/* compiled from: AlbumsListDataSource.kt */
/* loaded from: classes4.dex */
public final class jo1 extends ContentObserver {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.b a;
    public final /* synthetic */ ko1 b;
    public final /* synthetic */ io.reactivex.rxjava3.subjects.f<List<AlbumEntry>> c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo1(io.reactivex.rxjava3.disposables.b bVar, ko1 ko1Var, io.reactivex.rxjava3.subjects.f fVar, String str, Handler handler) {
        super(handler);
        this.a = bVar;
        this.b = ko1Var;
        this.c = fVar;
        this.d = str;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        io.reactivex.rxjava3.disposables.b bVar = this.a;
        bVar.e();
        bVar.b(this.b.a(this.c, this.d));
    }
}
