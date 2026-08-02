package xsna;

import android.view.View;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.articles.ArticleFragment;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorsListVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.polls.PollOption;
import com.vk.dto.user.UserProfile;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.domain.state.LyricsMode;
import com.vk.music.player.domain.state.b;
import com.vk.newsfeed.common.views.PrimaryAttachmentPollV2View;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.lp3;
import xsna.oap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class lo3 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lo3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x028e, code lost:
    
        if (r1.d == true) goto L210;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        com.vk.music.player.f fVar;
        zy6 rz6Var;
        AdvertisementInfo c;
        MusicTrack f;
        MusicTrack f2;
        zy6 d;
        MusicTrack f3;
        MusicTrack f4;
        MusicTrack f5;
        MusicTrack f6;
        MusicTrack f7;
        MusicTrack f8;
        smb0 smb0Var;
        PollOption answerRaw;
        rv2 rv2Var;
        UserId userId;
        oap<? extends UserProfile, ? extends Group> oapVar;
        Group group;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                lp3 lp3Var = ((ArticleFragment) obj).C0;
                if (lp3Var != null) {
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    view.getContext();
                    e.b bVar = new e.b(view, null, null, l, 6);
                    bVar.w = R.layout.ds_internal_context_menu_item;
                    bVar.e = lp3Var.a;
                    defpackage.j jVar = lp3Var.d;
                    on3 on3Var = new on3(new vs(lp3Var, 4));
                    bVar.l = on3Var;
                    bVar.m = cn70.b(50);
                    Article a = lp3Var.a();
                    boolean z2 = a != null && a.u;
                    Article a2 = lp3Var.a();
                    if (a2 != null && a2.o) {
                        z = true;
                    }
                    if (z2) {
                        on3Var.x0(new lp3.a.b(R.string.edit_article, R.attr.vk_ui_text_primary));
                    }
                    on3Var.x0(new lp3.a.d(R.string.open_in_browser, R.attr.vk_ui_text_primary));
                    on3Var.x0(new lp3.a.C3282a(R.string.copy_link, R.attr.vk_ui_text_primary));
                    if (lp3Var.b) {
                        on3Var.x0(new lp3.a.c(R.string.article_mentions, R.attr.vk_ui_text_primary));
                        if (((Boolean) jVar.invoke()).booleanValue()) {
                            on3Var.x0(new lp3.a.f(R.string.article_saved_articles, R.attr.vk_ui_text_primary));
                        } else {
                            on3Var.x0(new lp3.a.g(R.string.article_saved_links, R.attr.vk_ui_text_primary));
                        }
                    }
                    if (z && ((Boolean) jVar.invoke()).booleanValue()) {
                        on3Var.x0(new lp3.a.e(R.string.report_content, R.attr.vk_ui_text_primary));
                    }
                    if (z2) {
                        on3Var.x0(new lp3.a.h(R.string.delete_article, R.attr.vk_ui_background_negative));
                    }
                    lp3Var.g = bVar.j();
                    return;
                }
                return;
            case 1:
                uti utiVar = (uti) obj;
                com.vk.music.player.domain.state.a aVar = utiVar.i;
                com.vk.music.player.domain.state.b bVar2 = aVar.q;
                if (bVar2 instanceof b.d) {
                    view.getId();
                } else if (bVar2 instanceof b.f) {
                    int id = view.getId();
                    if (id == R.id.artist) {
                        com.vk.music.player.f fVar2 = aVar.a;
                        if (fVar2 != null && (f8 = fVar2.f()) != null) {
                            rz6Var = new tz6(f8);
                            if (rz6Var != null) {
                                utiVar.d.L2(rz6Var);
                                return;
                            }
                            return;
                        }
                    } else if (id == R.id.artist_music_track) {
                        com.vk.music.player.f fVar3 = aVar.a;
                        if (fVar3 != null && (f7 = fVar3.f()) != null) {
                            rz6Var = new tz6(f7);
                            if (rz6Var != null) {
                            }
                        }
                    } else if (id == R.id.dislike) {
                        com.vk.music.player.f fVar4 = aVar.a;
                        if (fVar4 != null && (f6 = fVar4.f()) != null) {
                            rz6Var = new oz6(f6);
                            if (rz6Var != null) {
                            }
                        }
                    } else if (id == R.id.add) {
                        com.vk.music.player.f fVar5 = aVar.a;
                        if (fVar5 != null && (f5 = fVar5.f()) != null) {
                            rz6Var = new nz6(f5);
                            if (rz6Var != null) {
                            }
                        }
                    } else {
                        if (id == R.id.downloading) {
                            com.vk.music.player.f fVar6 = aVar.a;
                            if (fVar6 != null && (f4 = fVar6.f()) != null) {
                                rz6Var = new pz6(MusicTrack.zb(f4, 0, null, 0, 0, null, false, null, aVar.p, false, false, null, null, null, -1, 1048571));
                            }
                        } else {
                            rz6Var = id == R.id.prev ? fz6.a : id == R.id.next ? dz6.a : id == R.id.switch_lyrics ? aVar.l == LyricsMode.COLLAPSED ? lz6.a : iz6.a : utiVar.d(aVar, id);
                        }
                        if (rz6Var != null) {
                        }
                    }
                } else {
                    boolean z3 = bVar2 instanceof b.g;
                    bz6 bz6Var = bz6.a;
                    az6 az6Var = az6.a;
                    zz6 zz6Var = zz6.a;
                    if (z3) {
                        int id2 = view.getId();
                        if (id2 != R.id.prev) {
                            if (id2 != R.id.next) {
                                if (id2 != R.id.speed) {
                                    d = utiVar.d(aVar, id2);
                                    rz6Var = d;
                                }
                                rz6Var = zz6Var;
                            }
                            rz6Var = bz6Var;
                        }
                        rz6Var = az6Var;
                    } else if (bVar2 instanceof b.h) {
                        int id3 = view.getId();
                        if (id3 == R.id.artist) {
                            com.vk.music.player.f fVar7 = aVar.a;
                            if (fVar7 != null && (f3 = fVar7.f()) != null) {
                                rz6Var = new uz6(f3);
                            }
                        } else {
                            if (id3 != R.id.prev) {
                                if (id3 != R.id.next) {
                                    if (id3 != R.id.speed) {
                                        rz6Var = utiVar.d(aVar, id3);
                                    }
                                    rz6Var = zz6Var;
                                }
                                rz6Var = bz6Var;
                            }
                            rz6Var = az6Var;
                        }
                    } else if (bVar2 instanceof b.C1334b) {
                        int id4 = view.getId();
                        if (id4 != R.id.prev) {
                            if (id4 != R.id.next) {
                                if (id4 != R.id.speed) {
                                    if (id4 != R.id.more) {
                                        rz6Var = utiVar.d(aVar, id4);
                                    } else if (aVar.a != null) {
                                        rz6Var = new vz6();
                                    }
                                }
                                rz6Var = zz6Var;
                            }
                            rz6Var = bz6Var;
                        }
                        rz6Var = az6Var;
                    } else {
                        if (bVar2 instanceof b.c) {
                            int id5 = view.getId();
                            if (id5 != R.id.speed) {
                                d = utiVar.d(aVar, id5);
                                rz6Var = d;
                            }
                        } else if (bVar2 instanceof b.e) {
                            int id6 = view.getId();
                            if (id6 == R.id.artist) {
                                com.vk.music.player.f fVar8 = aVar.a;
                                if (fVar8 != null && (f2 = fVar8.f()) != null) {
                                    rz6Var = new sz6(f2);
                                }
                            } else {
                                if (id6 != R.id.prev) {
                                    if (id6 != R.id.next) {
                                        if (id6 != R.id.speed) {
                                            rz6Var = utiVar.d(aVar, id6);
                                        }
                                    }
                                    rz6Var = bz6Var;
                                }
                                rz6Var = az6Var;
                            }
                        } else if (bVar2 instanceof b.i) {
                            int id7 = view.getId();
                            if (id7 == R.id.add) {
                                com.vk.music.player.f fVar9 = aVar.a;
                                if (fVar9 != null && (f = fVar9.f()) != null) {
                                    rz6Var = new qz6(f);
                                }
                            } else {
                                rz6Var = id7 == R.id.prev ? ez6.a : id7 == R.id.next ? cz6.a : utiVar.d(aVar, id7);
                            }
                        } else {
                            if (!(bVar2 instanceof b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int id8 = view.getId();
                            if (id8 == R.id.artist) {
                                com.vk.music.player.f fVar10 = aVar.a;
                                if (fVar10 != null) {
                                    AdvertisementInfo c2 = fVar10.c();
                                    if (c2 != null) {
                                        break;
                                    }
                                }
                            } else if (id8 == R.id.open_ad_banner) {
                                com.vk.music.player.f fVar11 = aVar.a;
                                if (fVar11 != null && (c = fVar11.c()) != null && c.d) {
                                    rz6Var = new xz6(fVar11);
                                }
                                rz6Var = yz6.a;
                            } else if (id8 == R.id.play_pause) {
                                rz6Var = hz6.a;
                            } else if (id8 == R.id.more && (fVar = aVar.a) != null) {
                                rz6Var = new rz6(fVar);
                            }
                        }
                        rz6Var = zz6Var;
                    }
                    if (rz6Var != null) {
                    }
                }
                rz6Var = null;
                if (rz6Var != null) {
                }
                break;
            case 2:
                ((k8p) obj).a.invoke(a.b.b);
                return;
            case 3:
                PrimaryAttachmentPollV2View primaryAttachmentPollV2View = (PrimaryAttachmentPollV2View) obj;
                int i2 = PrimaryAttachmentPollV2View.J;
                if (!(view instanceof smb0) || (answerRaw = (smb0Var = (smb0) view).getAnswerRaw()) == null || (rv2Var = primaryAttachmentPollV2View.B) == null) {
                    return;
                }
                rv2Var.c(smb0Var, answerRaw);
                return;
            case 4:
                ncr<vcr<?>> ncrVar = ((god0) obj).b;
                if (ncrVar != null) {
                    ncrVar.b();
                    return;
                }
                return;
            case 5:
                SearchAuthorsListVh searchAuthorsListVh = (SearchAuthorsListVh) obj;
                UIBlockSearchAuthor uIBlockSearchAuthor = searchAuthorsListVh.l;
                if (uIBlockSearchAuthor != null && (oapVar = uIBlockSearchAuthor.y) != null) {
                    if (oapVar instanceof oap.b) {
                        group = (Group) ((oap.b) oapVar).a;
                    } else {
                        if (!(oapVar instanceof oap.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        group = null;
                    }
                    if (group != null && searchAuthorsListVh.k && (groupsVideoLivesDataDto = group.x0) != null && groupsVideoLivesDataDto.e()) {
                        z = true;
                    }
                }
                boolean z4 = z;
                UIBlockSearchAuthor uIBlockSearchAuthor2 = searchAuthorsListVh.l;
                Long valueOf = (uIBlockSearchAuthor2 == null || (userId = uIBlockSearchAuthor2.g) == null) ? null : Long.valueOf(userId.b);
                UIBlockSearchAuthor uIBlockSearchAuthor3 = searchAuthorsListVh.l;
                String str = uIBlockSearchAuthor3 != null ? uIBlockSearchAuthor3.b : null;
                UiTracker uiTracker = UiTracker.a;
                new ejc(z4, valueOf, str, UiTracker.c(), null, 16).q();
                VkRichCell vkRichCell = searchAuthorsListVh.o;
                searchAuthorsListVh.onClick(vkRichCell == null ? null : vkRichCell);
                return;
            case 6:
                zs6 zs6Var = new zs6(8, (View.OnClickListener) obj, view);
                view.addOnAttachStateChangeListener(new swt0(zs6Var));
                wvv.b(wvv.a, zs6Var, 0L, 32L, 8);
                return;
            default:
                ((gzs) obj).invoke();
                return;
        }
    }
}
