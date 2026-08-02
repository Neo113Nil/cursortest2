package xsna;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.tasks.OnFailureListener;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.tips.Tooltip;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.io.FileDescriptor;
import java.util.List;
import kotlin.Pair;
import ru.rustore.sdk.core.exception.RuStoreException;
import xsna.auq;
import xsna.d5o0;
import xsna.k6o0;
import xsna.s9u;
import xsna.vh40;
import xsna.xhl0;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ac20 implements io.reactivex.rxjava3.functions.l, Tooltip.c, hi60, PhotoFlowToolbarView.c, b680, k6o0.a, io.reactivex.rxjava3.functions.m, s9u.h, yads.wt2, yads.iz {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ac20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.wt2
    public String a() {
        return yads.xw1.a((yads.xw1) this.c);
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.c
    public void a0() {
        ((ida0) this.c).b.invoke();
    }

    @Override // yads.iz
    public void accept(Object obj) {
        ((yads.pk0) obj).a((Exception) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((q8w) this.c).invoke(obj);
            case 1:
                return (thi0) ((q8w) this.c).invoke(obj);
            case 2:
                return (Pair) ((eiz) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((vh40.b) this.c).invoke(obj);
            case 4:
            case 5:
            case 7:
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            default:
                return (io.reactivex.rxjava3.core.e) ((hcs0) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((v4w) this.c).invoke(obj);
            case 8:
                return (j170) ((v4w) this.c).invoke(obj);
            case 9:
                return (vx60) ((q8w) this.c).invoke(obj);
            case 11:
                return (nyb0) ((q8w) this.c).invoke(obj);
            case 12:
                return (Boolean) ((q8w) this.c).invoke(obj);
            case 13:
                return (List) ((izs) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.o) ((q8w) this.c).invoke(obj);
            case 16:
                return (FileDescriptor) ((q8w) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((e9i0) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((hcs0) this.c).invoke(obj);
            case 25:
                return (IconCompat) ((hcs0) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.t) ((nf5) this.c).invoke(obj);
        }
    }

    @Override // xsna.k6o0.a
    public void b(Object obj, Object obj2) {
        yhl0.c.a((xhl0) this.c);
        ((OnFailureListener) obj).onFailure(((xhl0.a) obj2).getError());
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        ((wmd0) this.c).invoke();
    }

    @Override // xsna.s9u.h
    public boolean e(eo00 eo00Var) {
        ((ry0) this.c).invoke();
        return Boolean.TRUE.booleanValue();
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        d5o0.a aVar = (d5o0.a) this.c;
        if (!(th instanceof RuStoreException)) {
            new RuStoreException(th);
        }
        aVar.b(new auq.b());
    }

    @Override // xsna.hi60
    public void sa(NewsfeedExternalAction newsfeedExternalAction) {
        fo60 fo60Var = ((ho60) this.c).m.get();
        if (fo60Var != null) {
            fo60Var.a(new xn60.a(newsfeedExternalAction));
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 18:
                return ((Boolean) ((q8w) this.c).invoke(obj)).booleanValue();
            case 19:
            case 20:
            default:
                return ((Boolean) ((z4t0) this.c).invoke(obj)).booleanValue();
            case 21:
                return ((Boolean) ((yaq0) this.c).invoke(obj)).booleanValue();
            case 22:
                return ((Boolean) ((hcs0) this.c).invoke(obj)).booleanValue();
        }
    }
}
