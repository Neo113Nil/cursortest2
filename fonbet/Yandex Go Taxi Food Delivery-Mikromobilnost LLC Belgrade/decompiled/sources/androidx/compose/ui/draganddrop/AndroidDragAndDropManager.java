package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.f;
import defpackage.e530;
import defpackage.f530;
import defpackage.g8m;
import defpackage.ixv;
import defpackage.j530;
import defpackage.j63;
import defpackage.k8m;
import defpackage.l8m;
import defpackage.nl91;
import defpackage.qje;
import defpackage.r501;
import defpackage.r53;
import defpackage.sls;
import defpackage.tls;
import defpackage.u8m;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010!\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "Landroid/view/View$OnDragListener;", "Lk8m;", "Lkotlin/Function3;", "Lv8m;", "Lcjs0;", "Lkotlin/Function1;", "Lqam;", "Lzy11;", "", "startDrag", "<init>", "(Lzls;)V", "Ll8m;", "node", "Lwu60;", "offset", "requestDragAndDropTransfer-Uv8p0NA", "(Ll8m;J)V", "requestDragAndDropTransfer", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Lu8m;", "target", "registerTargetInterest", "(Lu8m;)V", "isInterestedTarget", "(Lu8m;)Z", "Lzls;", "rootDragAndDropNode", "Ll8m;", "Lj63;", "interestedTargets", "Lj63;", "Lf530;", "modifier", "Lf530;", "getModifier", "()Lf530;", "isRequestDragAndDropTransferRequired", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, k8m {
    public static final int $stable = 8;
    private final zls startDrag;
    private final l8m rootDragAndDropNode = new l8m(0);
    private final j63 interestedTargets = new j63(0);
    private final f530 modifier = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/draganddrop/AndroidDragAndDropManager$a", "Lj530;", "Ll8m;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends j530 {
        public a() {
        }

        @Override // defpackage.j530
        public final e530 a() {
            return AndroidDragAndDropManager.this.rootDragAndDropNode;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // defpackage.j530
        public final /* bridge */ /* synthetic */ void f(e530 e530Var) {
        }

        public final int hashCode() {
            return AndroidDragAndDropManager.this.rootDragAndDropNode.hashCode();
        }
    }

    public AndroidDragAndDropManager(zls zlsVar) {
        this.startDrag = zlsVar;
    }

    public f530 getModifier() {
        return this.modifier;
    }

    @Override // defpackage.k8m
    public boolean isInterestedTarget(u8m target) {
        return this.interestedTargets.contains(target);
    }

    public boolean isRequestDragAndDropTransferRequired() {
        return true;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) {
        final g8m g8mVar = new g8m(event);
        switch (event.getAction()) {
            case 1:
                final l8m l8mVar = this.rootDragAndDropNode;
                l8mVar.getClass();
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                nl91.e(l8mVar, new tls() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        l8m l8mVar2 = (l8m) obj;
                        if (!l8mVar2.isAttached()) {
                            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                        }
                        if (l8mVar2.c != null) {
                            ixv.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                        }
                        l8mVar2.c = null;
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        ref$BooleanRef2.element = ref$BooleanRef2.element;
                        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                    }
                });
                boolean z = ref$BooleanRef.element;
                j63 j63Var = this.interestedTargets;
                j63Var.getClass();
                r53 r53Var = new r53(j63Var);
                while (r53Var.hasNext()) {
                    ((l8m) ((u8m) r53Var.next())).I0(g8mVar);
                }
                break;
            case 2:
                this.rootDragAndDropNode.H0(g8mVar);
                break;
            case 4:
                l8m l8mVar2 = this.rootDragAndDropNode;
                l8mVar2.getClass();
                nl91.e(l8mVar2, new DragAndDropNode$onEnded$1(g8mVar));
                this.interestedTargets.clear();
                break;
            case 5:
                this.rootDragAndDropNode.F0(g8mVar);
                break;
            case 6:
                this.rootDragAndDropNode.G0(g8mVar);
                break;
        }
        return false;
    }

    public void registerTargetInterest(u8m target) {
        this.interestedTargets.add(target);
    }

    /* renamed from: requestDragAndDropTransfer-Uv8p0NA, reason: not valid java name */
    public void m42requestDragAndDropTransferUv8p0NA(l8m node, final long offset) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final r501 r501Var = new r501(6);
        final sls slsVar = new sls() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$1$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Boolean.valueOf(Ref$BooleanRef.this.element);
            }
        };
        node.getClass();
        final f fVar = (f) qje.P(node).a0.d;
        nl91.e(node, new tls() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$startDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return !((l8m) obj).isAttached() ? TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }
}
