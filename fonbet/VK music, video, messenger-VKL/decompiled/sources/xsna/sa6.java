package xsna;

import android.view.View;
import android.widget.Button;
import com.vk.file_picker.FilePickerFragment;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import xsna.djo;
import xsna.fhc0;
import xsna.ptw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class sa6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sa6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ta6 ta6Var = (ta6) obj;
                Object obj2 = ta6Var.o;
                ((l0c) (obj2 != null ? obj2 : null)).l(ta6Var.x);
                break;
            case 1:
                Object obj3 = ((cj6) obj).o;
                ((km90) (obj3 != null ? obj3 : null)).a();
                break;
            case 2:
                r2g r2gVar = (r2g) obj;
                c5p c5pVar = r2gVar.A;
                r2gVar.c.m(null);
                int id = view.getId();
                if (id != R.id.tabGrid) {
                    if (id != R.id.tabFormat) {
                        if (id == R.id.tabBorder) {
                            Button button = r2gVar.l;
                            if (button != null) {
                                button.setSelected(false);
                            }
                            Button button2 = r2gVar.m;
                            if (button2 != null) {
                                button2.setSelected(false);
                            }
                            Button button3 = r2gVar.n;
                            if (button3 != null) {
                                button3.setSelected(true);
                            }
                            vgu vguVar = r2gVar.p;
                            if (vguVar != null) {
                                vguVar.a.setVisibility(8);
                            }
                            b9s b9sVar = r2gVar.q;
                            if (b9sVar != null) {
                                b9sVar.a.setVisibility(8);
                            }
                            e28 e28Var = r2gVar.r;
                            if (e28Var != null) {
                                e28Var.a.setVisibility(0);
                            }
                            c5pVar.b(CollageStatEvent.k.a);
                            break;
                        }
                    } else {
                        Button button4 = r2gVar.l;
                        if (button4 != null) {
                            button4.setSelected(false);
                        }
                        Button button5 = r2gVar.m;
                        if (button5 != null) {
                            button5.setSelected(true);
                        }
                        Button button6 = r2gVar.n;
                        if (button6 != null) {
                            button6.setSelected(false);
                        }
                        vgu vguVar2 = r2gVar.p;
                        if (vguVar2 != null) {
                            vguVar2.a.setVisibility(8);
                        }
                        b9s b9sVar2 = r2gVar.q;
                        if (b9sVar2 != null) {
                            b9sVar2.a.setVisibility(0);
                        }
                        e28 e28Var2 = r2gVar.r;
                        if (e28Var2 != null) {
                            e28Var2.a.setVisibility(8);
                        }
                        c5pVar.b(CollageStatEvent.j.a);
                        break;
                    }
                } else {
                    Button button7 = r2gVar.l;
                    if (button7 != null) {
                        button7.setSelected(true);
                    }
                    Button button8 = r2gVar.m;
                    if (button8 != null) {
                        button8.setSelected(false);
                    }
                    Button button9 = r2gVar.n;
                    if (button9 != null) {
                        button9.setSelected(false);
                    }
                    vgu vguVar3 = r2gVar.p;
                    if (vguVar3 != null) {
                        vguVar3.a.setVisibility(0);
                    }
                    b9s b9sVar3 = r2gVar.q;
                    if (b9sVar3 != null) {
                        b9sVar3.a.setVisibility(8);
                    }
                    e28 e28Var3 = r2gVar.r;
                    if (e28Var3 != null) {
                        e28Var3.a.setVisibility(8);
                        break;
                    }
                }
                break;
            case 3:
                djo djoVar = (djo) obj;
                djoVar.H = new djo.a.C2740a(true);
                djoVar.c.setDrawingState(djoVar.l.d());
                ((u76) djoVar.d.b).t();
                break;
            case 4:
                int i2 = ExploreFragment.h0;
                ((ExploreFragment) obj).no(FragmentWithGlobalSearch$TargetAction.HeaderSearchQueryViewClick);
                break;
            case 5:
                ((FilePickerFragment.g) obj).onClick();
                break;
            case 6:
                Object obj4 = ((sys) obj).o;
                ((qys) (obj4 != null ? obj4 : null)).J1();
                break;
            case 7:
                ((oj70) obj).b.invoke();
                break;
            case 8:
                cqc0 cqc0Var = (cqc0) obj;
                cqc0Var.V0();
                cqc0Var.j.invoke();
                jbc0 jbc0Var = (jbc0) cqc0Var.r.getValue();
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ?? r7 = cqc0Var.s;
                ((fhc0.c) r7.getValue()).k();
                ((fhc0.c) r7.getValue()).j();
                break;
            case 9:
                Object obj5 = ((mii0) obj).o;
                ((kii0) (obj5 != null ? obj5 : null)).M();
                break;
            case 10:
                com.vk.sharing.core.view.f.U0((com.vk.sharing.core.view.f) obj);
                break;
            case 11:
                bpn0 bpn0Var = t65.a;
                mhy.b(view.getContext());
                ((k6k0) obj).b(false);
                break;
            case 12:
                ((cuw0) obj).c.invoke(ptw0.k.b);
                break;
            default:
                yads.s61.a((yads.s61) obj, view);
                break;
        }
    }
}
