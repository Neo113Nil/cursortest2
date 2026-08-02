package xsna;

import android.os.Bundle;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.provider.StickerEditResult;
import com.vk.clips.editor.stickers.api.ClipsEditorStickersStyleEditScreen$Type;
import com.vk.stickers.api.models.time.TimeStickerStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.q7l0;
import xsna.swd;
import xsna.wzd;

/* compiled from: ClipsEditorAttachActionsControllerImpl.kt */
/* loaded from: classes16.dex */
public final class twd implements swd {
    public final e2e a;
    public final nal0 b;
    public final rzd c;
    public final swd.a d;
    public final boolean e;
    public final boolean f;
    public String g;
    public com.vk.clips.editor.state.model.b h;
    public boolean i;

    /* compiled from: ClipsEditorAttachActionsControllerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerEditResult.values().length];
            try {
                iArr[StickerEditResult.STYLE_SWITCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerEditResult.EDIT_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerEditResult.EDIT_MENTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerEditResult.EDIT_HASHTAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StickerEditResult.NOTHING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public twd(e2e e2eVar, nal0 nal0Var, rzd rzdVar, swd.a aVar, boolean z, boolean z2) {
        this.a = e2eVar;
        this.b = nal0Var;
        this.c = rzdVar;
        this.d = aVar;
        this.e = z;
        this.f = z2;
    }

    @Override // com.vk.clips.design.view.stikers.ClipsStickersView.b
    public final void a(nov novVar) {
        Object obj;
        StickerEditResult stickerEditResult;
        Iterator it = c5g.v(this.c.getState().f).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.vk.clips.editor.state.model.b) obj).b == novVar) {
                    break;
                }
            }
        }
        com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) obj;
        if (bVar == null) {
            return;
        }
        String str = bVar.a;
        nov novVar2 = bVar.b;
        if (!epx.f(str, this.g) && this.e) {
            this.d.c(bVar);
            return;
        }
        this.h = new com.vk.clips.editor.state.model.b(str, novVar2.copy());
        bpn0 bpn0Var = (bpn0) this.a.b.b;
        if (novVar2 instanceof yjm0) {
            q7l0.d dVar = ((q7l0) bpn0Var.getValue()).a;
            dVar.getClass();
            yjm0 yjm0Var = (yjm0) novVar2;
            nvo0 nvo0Var = yjm0Var.h;
            List<TimeStickerStyle> list = dVar.a;
            TimeStickerStyle timeStickerStyle = nvo0Var.c;
            int indexOf = list.indexOf(timeStickerStyle);
            if (indexOf >= 0) {
                timeStickerStyle = list.get((indexOf + 1) % list.size());
            }
            yjm0Var.s(nvo0.a(nvo0Var, timeStickerStyle));
            stickerEditResult = StickerEditResult.STYLE_SWITCH;
        } else if (novVar2 instanceof c8m0) {
            ((q7l0) bpn0Var.getValue()).b.getClass();
            c8m0 c8m0Var = (c8m0) novVar2;
            if (c8m0Var.s) {
                c8m0Var.s(c8m0Var.r.n(), true);
                s3q0 s3q0Var = s3q0.a;
            }
            stickerEditResult = StickerEditResult.STYLE_SWITCH;
        } else if (novVar2 instanceof xlo0) {
            stickerEditResult = StickerEditResult.EDIT_TEXT;
        } else if (novVar2 instanceof x6m0) {
            ((q7l0) bpn0Var.getValue()).c.getClass();
            x6m0 x6m0Var = (x6m0) novVar2;
            v6m0 v6m0Var = x6m0Var.h;
            x6m0Var.r(v6m0.a(v6m0Var, v6m0Var.a.e()));
            stickerEditResult = StickerEditResult.STYLE_SWITCH;
        } else if (novVar2 instanceof v4m0) {
            ((q7l0) bpn0Var.getValue()).d.getClass();
            v4m0 v4m0Var = (v4m0) novVar2;
            t4m0 t4m0Var = v4m0Var.h;
            v4m0Var.r(t4m0.a(t4m0Var, t4m0Var.a.e()));
            stickerEditResult = StickerEditResult.STYLE_SWITCH;
        } else {
            stickerEditResult = StickerEditResult.NOTHING;
        }
        int i = a.$EnumSwitchMapping$0[stickerEditResult.ordinal()];
        if (i == 1) {
            h(novVar2, false);
            d(this.g);
            return;
        }
        if (i == 2) {
            c(bVar, ClipsEditorStickersStyleEditScreen$Type.TEXT);
            return;
        }
        if (i == 3) {
            c(bVar, ClipsEditorStickersStyleEditScreen$Type.MENTION);
        } else if (i == 4) {
            c(bVar, ClipsEditorStickersStyleEditScreen$Type.HASHTAG);
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.vk.clips.design.view.stikers.ClipsStickersView.b
    public final boolean b() {
        return this.f;
    }

    public final void c(com.vk.clips.editor.state.model.b bVar, ClipsEditorStickersStyleEditScreen$Type clipsEditorStickersStyleEditScreen$Type) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("sticker_type", clipsEditorStickersStyleEditScreen$Type);
        this.d.b(ClipsEditorScreen.State.STICKERS_STYLE_EDITOR, new ClipsEditorScreen.a.b(bVar, bundle));
    }

    public final void d(String str) {
        Object obj;
        if (this.e) {
            Iterator it = c5g.v(this.c.getState().f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((com.vk.clips.editor.state.model.b) obj).a, str)) {
                        break;
                    }
                }
            }
            com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) obj;
            if (bVar == null) {
                return;
            }
            nov novVar = bVar.b;
            this.g = bVar.a;
            this.d.a(novVar);
            f(novVar);
            this.b.invalidate();
        }
    }

    @Override // xsna.swd
    public final void e(nov novVar) {
        String str = this.g;
        boolean z = this.e;
        if ((str == null && z) || novVar == null || !this.i) {
            return;
        }
        h(novVar, true);
        this.i = false;
        if (z) {
            d(this.g);
        } else {
            k(true);
        }
    }

    public final void f(nov novVar) {
        Iterator it = c5g.v(this.c.getState().f).iterator();
        while (it.hasNext()) {
            nov novVar2 = ((com.vk.clips.editor.state.model.b) it.next()).b;
            if (novVar2 != novVar) {
                novVar2.setStickerAlpha(102);
            } else {
                novVar2.setStickerAlpha(255);
            }
        }
    }

    @Override // xsna.swd
    public final void g(nov novVar) {
        Object obj;
        this.i = true;
        if (!this.e) {
            f(novVar);
            return;
        }
        if (this.g == null) {
            Iterator it = c5g.v(this.c.getState().f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.vk.clips.editor.state.model.b) obj).b == novVar) {
                        break;
                    }
                }
            }
            com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) obj;
            if (bVar == null) {
                return;
            }
            this.d.c(bVar);
        }
    }

    public final void h(nov novVar, boolean z) {
        luc lucVar;
        if (z) {
            lucVar = avc.a;
        } else {
            rj01 rj01Var = this.a.b;
            lucVar = novVar instanceof xlo0 ? cvc.a : yuc.a;
        }
        rzd rzdVar = this.c;
        ufc a2 = rzdVar.a();
        List<List<com.vk.clips.editor.state.model.b>> list = rzdVar.getState().f;
        a2.getClass();
        List<List<com.vk.clips.editor.state.model.b>> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                nov novVar2 = ((com.vk.clips.editor.state.model.b) obj).b;
                ((e2e) a2.c).a.b.getClass();
                if (!(novVar2 instanceof blj) && !(novVar2 instanceof u570) && !(novVar2 instanceof omv)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) it2.next();
                arrayList3.add(new com.vk.clips.editor.state.model.b(bVar.a, bVar.b.copy()));
            }
            arrayList.add(arrayList3);
        }
        rzdVar.c(com.vk.clips.editor.state.model.a.c(rzdVar.getState(), null, null, null, null, arrayList, null, 95), e43.l(new wzd.b(this.h), new wzd.a(true, lucVar)));
    }

    @Override // xsna.swd
    public final void i() {
        c(null, ClipsEditorStickersStyleEditScreen$Type.TEXT);
    }

    @Override // xsna.swd
    public final void j(nov novVar) {
        Object obj;
        Iterator it = c5g.v(this.c.getState().f).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.vk.clips.editor.state.model.b) obj).b == novVar) {
                    break;
                }
            }
        }
        com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) obj;
        if (bVar == null) {
            return;
        }
        this.h = new com.vk.clips.editor.state.model.b(bVar.a, bVar.b.copy());
    }

    @Override // xsna.swd
    public final void k(boolean z) {
        this.g = null;
        this.i = false;
        Iterator it = c5g.v(this.c.getState().f).iterator();
        while (it.hasNext()) {
            ((com.vk.clips.editor.state.model.b) it.next()).b.setStickerAlpha(z ? 255 : 102);
        }
        this.b.invalidate();
    }

    @Override // xsna.swd
    public final void l(com.vk.clips.editor.state.model.b bVar) {
        d(bVar.a);
    }
}
