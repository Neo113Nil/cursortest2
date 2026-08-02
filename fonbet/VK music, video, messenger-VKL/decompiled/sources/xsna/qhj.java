package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Content.kt */
@b6l(c = "com.vk.clips.playlists.playlist_ui.ui.ContentKt$ClipsPlaylistUiView$1$1", f = "Content.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class qhj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List $clips;
    final /* synthetic */ SnapshotStateList<zzc> $listSnapshot;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhj(List list, SnapshotStateList snapshotStateList, spj spjVar) {
        super(2, spjVar);
        this.$clips = list;
        this.$listSnapshot = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qhj(this.$clips, this.$listSnapshot, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qhj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        List list = this.$clips;
        List list2 = this.$listSnapshot;
        Iterator it = list2.iterator();
        while (true) {
            duk0 duk0Var = (duk0) it;
            if (!duk0Var.hasNext()) {
                break;
            }
            if (!list.contains((zzc) duk0Var.next())) {
                duk0Var.remove();
            }
        }
        if (epx.f(((zzc) j5g.Y(new wow(list))).a, ((zzc) j5g.Y(list2)).a)) {
            wow wowVar = new wow(list);
            if (!(wowVar instanceof RandomAccess)) {
                Iterator it2 = wowVar.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    zzc zzcVar = (zzc) next;
                    int size = list2.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            list2.add(next);
                            break;
                        }
                        if (epx.f(((zzc) list2.get(i)).a, zzcVar.a)) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                int size2 = wowVar.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj2 = wowVar.get(i2);
                    zzc zzcVar2 = (zzc) obj2;
                    int size3 = list2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size3) {
                            list2.add(obj2);
                            break;
                        }
                        if (epx.f(((zzc) list2.get(i3)).a, zzcVar2.a)) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        } else {
            int size4 = list.size();
            for (int i4 = 0; i4 < size4; i4++) {
                zzc zzcVar3 = (zzc) list.get(i4);
                int size5 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        list2.add(i4, zzcVar3);
                        break;
                    }
                    if (epx.f(((zzc) list2.get(i5)).a, zzcVar3.a)) {
                        break;
                    }
                    i5++;
                }
            }
        }
        return s3q0.a;
    }
}
