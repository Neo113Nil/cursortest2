package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.dto.narratives.Narrative;
import com.vk.music.player.PlayState;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.video.ui.upload.impl.publish.presentation.author.feature.entity.AuthorState;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorArguments;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ob00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ty0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ty0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                AuthorArguments authorArguments = (AuthorArguments) obj3;
                AuthorModalInternalComponent authorModalInternalComponent = (AuthorModalInternalComponent) obj2;
                AuthorModalInternalComponent.a aVar = AuthorModalInternalComponent.i;
                AuthorState authorState = (AuthorState) ((gzs) obj4).invoke();
                if (authorState == null) {
                    nwy nwyVar = authorModalInternalComponent.e;
                    qcy<Object> qcyVar = AuthorModalInternalComponent.j[1];
                    break;
                }
                break;
            case 2:
                Throwable th = (Throwable) obj4;
                nr2.L(th, (Throwable) obj3);
                isx0 isx0Var = obj2 instanceof isx0 ? (isx0) obj2 : null;
                mla b = isx0Var != null ? isx0Var.b() : null;
                nr2.L(th, b != null ? b.b() : null);
                break;
            case 3:
                bzd bzdVar = (bzd) obj4;
                ClipsEditorFragment.b bVar = bzdVar.d;
                bVar.d();
                ((gzd) bzdVar.m.getValue()).b(bzdVar.g(), bVar.c(), (File) obj3, new azd((izs) obj2, 0));
                break;
            case 4:
                String str = (String) obj3;
                VkAuthValidateAccountResponse vkAuthValidateAccountResponse = (VkAuthValidateAccountResponse) obj2;
                pir0 pir0Var = ((vop) obj4).L;
                List<VkAuthValidateAccountResponse.ValidateAccountFlow> list = vkAuthValidateAccountResponse.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (((VkAuthValidateAccountResponse.ValidateAccountFlow) obj5) != VkAuthValidateAccountResponse.ValidateAccountFlow.TRUSTED_HASH) {
                        arrayList.add(obj5);
                    }
                }
                pir0.c(pir0Var, str, VkAuthValidateAccountResponse.a(vkAuthValidateAccountResponse, arrayList));
                break;
            case 5:
                ror rorVar = (ror) obj4;
                rorVar.h((lpr) obj2, rorVar.f((List) obj3), null, new z4f(rorVar, 21));
                break;
            case 6:
                com.vk.music.player.domain.state.a aVar2 = (com.vk.music.player.domain.state.a) obj4;
                y17 y17Var = (y17) obj3;
                RecyclerView recyclerView = y17Var.B;
                ca00 ca00Var = y17Var.C;
                uti utiVar = (uti) obj2;
                l07 l07Var = utiVar.b;
                y17 y17Var2 = utiVar.a;
                int i2 = wd50.$EnumSwitchMapping$0[aVar2.l.ordinal()];
                if (i2 == 1) {
                    na00 na00Var = new na00(recyclerView.getHeight(), false, false, l07Var.v, false, 16);
                    int itemCount = ca00Var.getItemCount();
                    ca00Var.clear();
                    if (itemCount > 0) {
                        ca00Var.notifyItemRangeRemoved(0, itemCount);
                    }
                    ca00Var.x0(na00Var);
                    ca00Var.notifyItemInserted(0);
                } else if (i2 == 2) {
                    oa00 oa00Var = new oa00(recyclerView.getHeight());
                    int itemCount2 = ca00Var.getItemCount();
                    ca00Var.clear();
                    if (itemCount2 > 0) {
                        ca00Var.notifyItemRangeRemoved(0, itemCount2);
                    }
                    ca00Var.x0(oa00Var);
                    ca00Var.notifyItemInserted(0);
                } else if (i2 == 3) {
                    la00 la00Var = new la00(recyclerView.getHeight());
                    int itemCount3 = ca00Var.getItemCount();
                    ca00Var.clear();
                    if (itemCount3 > 0) {
                        ca00Var.notifyItemRangeRemoved(0, itemCount3);
                    }
                    ca00Var.x0(la00Var);
                    ca00Var.notifyItemInserted(0);
                } else if (i2 == 4) {
                    da00 da00Var = aVar2.m;
                    PlayState playState = aVar2.c;
                    LyricsScrollMode lyricsScrollMode = aVar2.n;
                    if (da00Var instanceof yvo0) {
                        yvo0 yvo0Var = (yvo0) da00Var;
                        ArrayList arrayList2 = new ArrayList();
                        ob00.a aVar3 = yvo0Var.a;
                        if (aVar3 != null) {
                            arrayList2.add(new na00(iah0.a(80), l07Var.v, aVar3.f, aVar3.c, playState != PlayState.PLAYING));
                        }
                        ArrayList<ob00> arrayList3 = yvo0Var.b;
                        ArrayList arrayList4 = new ArrayList();
                        for (ob00 ob00Var : arrayList3) {
                            if (ob00Var instanceof ob00.d) {
                                ob00.d dVar = (ob00.d) ob00Var;
                                obj = new qa00(dVar.f, dVar.d, dVar.e, lyricsScrollMode == LyricsScrollMode.AUTO ? ob00Var.c : true);
                            } else if (ob00Var instanceof ob00.c) {
                                ob00.c cVar = (ob00.c) ob00Var;
                                obj = new ma00(cVar.d, cVar.e, lyricsScrollMode == LyricsScrollMode.AUTO ? ob00Var.c : true);
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                arrayList4.add(obj);
                            }
                        }
                        arrayList2.addAll(arrayList4);
                        ob00.b bVar2 = yvo0Var.c;
                        arrayList2.add(new ka00(bVar2.e, bVar2.c));
                        ca00 ca00Var2 = y17Var2.C;
                        RecyclerView recyclerView2 = y17Var2.B;
                        ca00Var2.L0(arrayList2);
                        y17Var2.D.c = lyricsScrollMode == LyricsScrollMode.MANUAL;
                        if (lyricsScrollMode == LyricsScrollMode.AUTO) {
                            Iterator it = arrayList2.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i3 = -1;
                                } else if (!((ja00) it.next()).a()) {
                                    i3++;
                                }
                            }
                            if (i3 >= 0) {
                                recyclerView2.smoothScrollToPosition(i3);
                            } else if (aVar3 != null && !aVar3.f) {
                                recyclerView2.smoothScrollToPosition(0);
                            }
                        }
                    } else if (da00Var instanceof cyk0) {
                        cyk0 cyk0Var = (cyk0) da00Var;
                        ArrayList arrayList5 = new ArrayList();
                        List<String> list2 = cyk0Var.a;
                        ArrayList arrayList6 = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList6.add(new pa00((String) it2.next()));
                        }
                        arrayList5.addAll(arrayList6);
                        String str2 = cyk0Var.b;
                        if (str2 != null) {
                            arrayList5.add(new ka00(str2, false));
                        }
                        y17Var2.C.L0(arrayList5);
                        y17Var2.D.c = true;
                    }
                }
                break;
            default:
                smq.f(((xsq0) obj4).a.l, (Context) obj3, (Narrative) obj2, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                break;
        }
        return s3q0.a;
    }
}
