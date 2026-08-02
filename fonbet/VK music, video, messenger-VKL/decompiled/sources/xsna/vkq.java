package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FastCreateCallFromSelectionViewModel.kt */
/* loaded from: classes7.dex */
public final class vkq {
    public final itz0 a;
    public List<? extends Group> b;
    public final io.reactivex.rxjava3.subjects.f<s39> c;
    public final io.reactivex.rxjava3.subjects.d<String> d;
    public final io.reactivex.rxjava3.subjects.d<List<Group>> e;
    public final io.reactivex.rxjava3.subjects.f<txp> f;
    public UserId g;
    public List<? extends Group> h;
    public boolean i;

    public vkq(b25 b25Var) {
        this.a = new itz0(b25Var);
        EmptyList emptyList = EmptyList.b;
        this.b = emptyList;
        this.c = new io.reactivex.rxjava3.subjects.f<>();
        this.d = io.reactivex.rxjava3.subjects.d.O0("");
        this.e = io.reactivex.rxjava3.subjects.d.O0(this.b);
        this.f = new io.reactivex.rxjava3.subjects.f<>();
        this.g = b25Var.c();
        this.h = emptyList;
    }
}
