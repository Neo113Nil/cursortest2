package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Direction;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonView;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonViewRedesign;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.stat.recycler.Measurement;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.rrr0;

/* compiled from: MsgListAdapter.kt */
/* loaded from: classes2.dex */
public final class ok30 extends RecyclerView.Adapter<RecyclerView.e0> implements qwv, bv30 {
    public final vrr0 c;
    public final com.vk.stat.recycler.d d;
    public final rrr0 e;
    public List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> f;

    /* compiled from: MsgListAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgIdType.values().length];
            try {
                iArr[MsgIdType.LOCAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgIdType.CNV_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ok30(vrr0 vrr0Var, com.vk.stat.recycler.d dVar, int i) {
        dVar = (i & 2) != 0 ? null : dVar;
        rrr0 rrr0Var = new rrr0();
        this.c = vrr0Var;
        this.d = dVar;
        this.e = rrr0Var;
        this.f = EmptyList.b;
    }

    @Override // xsna.bv30
    public final int A(MsgIdType msgIdType, int i) {
        int i2 = a.$EnumSwitchMapping$0[msgIdType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            Iterator<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> it = this.f.iterator();
            while (it.hasNext()) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0 = it.next().E0();
                if (E0 != null && E0.b == i) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> it2 = this.f.iterator();
        while (it2.hasNext()) {
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = it2.next().E0();
            if (E02 != null && E02.c == i) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // xsna.qwv
    public final Attach b(int i) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i, this.f);
        if (gVar != null) {
            return gVar.x();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        int i2;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0;
        List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = this.f;
        this.e.getClass();
        if (list.isEmpty()) {
            return -1L;
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = list.get(i);
        int i3 = rrr0.a.$EnumSwitchMapping$0[gVar.l().ordinal()];
        if (i3 == 1) {
            return (AdapterEntryType.TYPE_UNREAD_FROM.h() << 56) | 0;
        }
        if (i3 == 2) {
            return (AdapterEntryType.TYPE_DATE.h() << 56) | ((int) (((xqr0) gVar).d / 1000));
        }
        if (i3 == 3) {
            return (AdapterEntryType.TYPE_LOAD_MORE.h() << 56) | (((lvr0) gVar).c != Direction.AFTER ? 1 : 0);
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = list.get(i).E0();
        if (E02 != null) {
            i2 = 0;
            for (int i4 = i - 1; -1 < i4 && (E0 = list.get(i4).E0()) != null && E02.b == E0.b; i4--) {
                i2++;
            }
        } else {
            i2 = 0;
        }
        return (r1.l().h() << 56) | (i2 << 32) | (E02 != null ? E02.b : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.f.get(i).l().h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        onBindViewHolder(e0Var, i, new ArrayList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(final ViewGroup viewGroup, final int i) {
        return (RecyclerView.e0) y0(Measurement.Type.Create, i, new gzs() { // from class: xsna.nk30
            @Override // xsna.gzs
            public final Object invoke() {
                hr30 zs30Var;
                vrr0 vrr0Var = ok30.this.c;
                LayoutInflater layoutInflater = vrr0Var.a;
                int h = AdapterEntryType.TYPE_DATE.h();
                ViewGroup viewGroup2 = viewGroup;
                int i2 = i;
                if (i2 == h) {
                    int i3 = wqr0.q;
                    return new wqr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_LOAD_MORE.h()) {
                    int i4 = our0.n;
                    ImFeatures imFeatures = ImFeatures.IM_CHAT_EMPTY_STATES_REDESIGN;
                    imFeatures.getClass();
                    return new our0(com.vk.toggle.b.A.a(imFeatures) ? new MsgSkeletonViewRedesign(viewGroup2.getContext(), null, 6) : new MsgSkeletonView(viewGroup2.getContext(), null, 6));
                }
                if (i2 == AdapterEntryType.TYPE_UNREAD_FROM.h()) {
                    int i5 = qvr0.q;
                    return new qvr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_unread_from, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_AVATAR_UPDATE.h()) {
                    int i6 = vsr0.s;
                    return new vsr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_msg_chat_avatar_update, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_AVATAR_REMOVE.h()) {
                    int i7 = tsr0.r;
                    return new tsr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_CREATE.h()) {
                    int i8 = xsr0.u;
                    return new xsr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_TITLE_UPDATE.h()) {
                    int i9 = str0.u;
                    return new str0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_MEMBER_INVITE.h()) {
                    int i10 = btr0.t;
                    return new btr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_MEMBER_INVITE_BY_CALL.h()) {
                    int i11 = ctr0.t;
                    return new ctr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_MEMBER_INVITE_BY_CALL_LINK.h()) {
                    int i12 = etr0.r;
                    return new etr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_MEMBER_RETURN.h()) {
                    int i13 = ntr0.r;
                    return new ntr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_MEMBER_KICK.h()) {
                    int i14 = htr0.t;
                    return new htr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_MEMBER_KICK_FROM_CALL.h()) {
                    int i15 = itr0.r;
                    return new itr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_DON_KICK.h()) {
                    int i16 = zsr0.n;
                    return new zsr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_MEMBER_LEAVE.h()) {
                    int i17 = ltr0.r;
                    return new ltr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_PIN.h()) {
                    int i18 = eur0.t;
                    return new eur0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_UNPIN.h()) {
                    int i19 = pur0.s;
                    return new pur0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_JOIN_BY_LINK.h()) {
                    int i20 = aur0.r;
                    return new aur0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_SCREENSHOT.h()) {
                    int i21 = gur0.r;
                    return new gur0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_GROUP_CALL.h()) {
                    int i22 = ytr0.r;
                    return new ytr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_CALL_ASR_FAILED.h()) {
                    int i23 = psr0.n;
                    return new psr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_DISAPPEARED.h()) {
                    int i24 = brr0.q;
                    return new brr0(layoutInflater.inflate(R.layout.vkim_msg_part_disappeared, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_MR_ACCEPTED.h()) {
                    int i25 = cur0.r;
                    return new cur0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CHAT_STYLE_UPDATE.h()) {
                    int i26 = qtr0.v;
                    return new qtr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_CUSTOM.h()) {
                    int i27 = mur0.o;
                    return new mur0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CUSTOM_BANNER.h()) {
                    int i28 = vqr0.r;
                    return new vqr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_custom_banner, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_PROFILE_BANNER.h()) {
                    int i29 = vur0.w;
                    return new vur0(layoutInflater.inflate(R.layout.vkim_msg_list_item_profile_banner, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_GIFT_BANNER.h()) {
                    Object obj = ivr0.r;
                    return new ivr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_gift_banner, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_MSG_CONVERSATION_REQUEST.h()) {
                    int i30 = wtr0.n;
                    return new wtr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_MSG_CONVERSATION_REQUEST_REJECTED.h()) {
                    int i31 = vtr0.n;
                    return new vtr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_SERVICE_CHAT_OWNER_UPDATE.h()) {
                    int i32 = ptr0.s;
                    return new ptr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_sys_msg, viewGroup2, false));
                }
                if (i2 == AdapterEntryType.TYPE_CALL_SETTINGS_SNIPPET.h()) {
                    int i33 = rsr0.o;
                    return new rsr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_call_settings_snippet, viewGroup2, false));
                }
                hr30 hr30Var = null;
                cau0 cau0Var = vrr0Var.k;
                b9w b9wVar = vrr0Var.g;
                q0w0 q0w0Var = vrr0Var.c;
                f6y0 f6y0Var = vrr0Var.b;
                if (i2 == AdapterEntryType.TYPE_FWD_TEXT.h() || i2 == AdapterEntryType.TYPE_TEXT.h()) {
                    hr30Var = new zt30();
                } else if (i2 == AdapterEntryType.TYPE_PHOTO.h()) {
                    hr30Var = new ps30();
                } else if (i2 == AdapterEntryType.TYPE_BOX_PHOTO_VIDEO.h()) {
                    hr30Var = new mo30(f6y0Var);
                } else if (i2 == AdapterEntryType.TYPE_AUDIO.h()) {
                    hr30Var = new bo30();
                } else if (i2 == AdapterEntryType.TYPE_AUDIO_COMPACT.h()) {
                    hr30Var = new gp30();
                } else if (i2 == AdapterEntryType.TYPE_PLAYLIST.h()) {
                    hr30Var = new ss30();
                } else if (i2 == AdapterEntryType.TYPE_PLAYLIST_COMPACT.h()) {
                    hr30Var = new jp30();
                } else if (i2 == AdapterEntryType.TYPE_ARTIST.h()) {
                    hr30Var = new wn30();
                } else if (i2 == AdapterEntryType.TYPE_ARTIST_COMPACT.h()) {
                    hr30Var = new dp30();
                } else if (i2 == AdapterEntryType.TYPE_VIDEO.h()) {
                    hr30Var = new as30(new pvh0(viewGroup2, 13));
                } else if (i2 == AdapterEntryType.TYPE_EXTERNAL_VIDEO.h()) {
                    hr30Var = new fq30();
                } else {
                    int i34 = 25;
                    if (i2 == AdapterEntryType.TYPE_PUBLIC_VIDEO.h()) {
                        hr30Var = new as30(new rp1(i34, b9wVar, viewGroup2));
                    } else if (i2 == AdapterEntryType.TYPE_INTERACTIVE_VIDEO.h()) {
                        hr30Var = new as30(new mk(24, b9wVar, viewGroup2));
                    } else if (i2 == AdapterEntryType.TYPE_VIDEO_MSG.h()) {
                        hr30Var = new as30(new com.vk.movika.sdk.base.ui.r0(29, b9wVar, viewGroup2));
                    } else if (i2 == AdapterEntryType.TYPE_VIDEO_AUTOPLAY.h()) {
                        hr30Var = new as30(new jl4(i34, b9wVar, viewGroup2));
                    } else if (i2 == AdapterEntryType.TYPE_GIF_AUTOPLAY.h()) {
                        hr30Var = new as30(new t9b(20, b9wVar, viewGroup2));
                    } else if (i2 == AdapterEntryType.TYPE_MAP.h()) {
                        hr30Var = new sr30();
                    } else {
                        if (i2 == AdapterEntryType.TYPE_STICKER.h()) {
                            int i35 = rt30.l;
                            zs30Var = new rt30(layoutInflater.inflate(R.layout.vkim_msg_part_sticker, viewGroup2, false));
                        } else if (i2 == AdapterEntryType.TYPE_UGC_STICKER.h()) {
                            int i36 = cu30.m;
                            zs30Var = new cu30(layoutInflater.inflate(R.layout.vkim_msg_part_sticker, viewGroup2, false));
                        } else if (i2 == AdapterEntryType.TYPE_POPUP_STICKER.h()) {
                            int i37 = bt30.q;
                            zs30Var = new bt30(layoutInflater.inflate(R.layout.vkim_msg_part_popup_sticker, viewGroup2, false));
                        } else if (i2 == AdapterEntryType.TYPE_GIFT.h()) {
                            hr30Var = new wq30();
                        } else if (i2 == AdapterEntryType.TYPE_WALL_POST_OWNER.h()) {
                            hr30Var = new qu30();
                        } else if (i2 == AdapterEntryType.TYPE_WALL_POST_TEXT.h()) {
                            hr30Var = new xu30();
                        } else if (i2 == AdapterEntryType.TYPE_WALL_POST_COLLAPSE_TEXT.h()) {
                            hr30Var = new ou30();
                        } else if (i2 == AdapterEntryType.TYPE_WALL_POST_BUTTON.h()) {
                            hr30Var = new mu30();
                        } else if (i2 == AdapterEntryType.TYPE_WALL_POST_REPLY.h()) {
                            hr30Var = new uu30();
                        } else if (i2 == AdapterEntryType.TYPE_WALL_POST_PLACEHOLDER.h()) {
                            hr30Var = new su30();
                        } else if (i2 == AdapterEntryType.TYPE_DONATE_PLACEHOLDER_REDESIGN.h()) {
                            hr30Var = new up30();
                        } else if (i2 == AdapterEntryType.TYPE_DONATE_BUTTON.h()) {
                            hr30Var = new sp30();
                        } else if (i2 == AdapterEntryType.TYPE_FWD_WALL_POST_TEXT.h()) {
                            hr30Var = new uq30();
                        } else if (i2 == AdapterEntryType.TYPE_TWO_ROW_SNIPPET.h()) {
                            hr30Var = new bu30();
                        } else if (i2 == AdapterEntryType.TYPE_DOC_SIMPLE.h()) {
                            hr30Var = new qp30();
                        } else if (i2 == AdapterEntryType.TYPE_DOC_PREVIEW.h()) {
                            hr30Var = new op30();
                        } else if (i2 == AdapterEntryType.TYPE_BOX_DOC_PREVIEW.h()) {
                            hr30Var = new ko30(f6y0Var);
                        } else if (i2 == AdapterEntryType.TYPE_LINK_SMALL.h()) {
                            hr30Var = new qr30();
                        } else if (i2 == AdapterEntryType.TYPE_LINK_LARGE.h()) {
                            hr30Var = new mr30();
                        } else if (i2 == AdapterEntryType.TYPE_LINK_EXTERNAL_MARKET.h()) {
                            hr30Var = new dq30();
                        } else if (i2 == AdapterEntryType.TYPE_LINK_PRODUCT.h()) {
                            hr30Var = new or30();
                        } else if (i2 == AdapterEntryType.TYPE_MARKET_SMALL.h()) {
                            hr30Var = new yr30();
                        } else if (i2 == AdapterEntryType.TYPE_MARKET_LARGE.h()) {
                            hr30Var = new wr30();
                        } else if (i2 == AdapterEntryType.TYPE_MARKET_BLOCKED.h()) {
                            hr30Var = new ur30();
                        } else if (i2 == AdapterEntryType.TYPE_AUDIOMSG.h()) {
                            hr30Var = new do30();
                        } else if (i2 == AdapterEntryType.TYPE_VIDEOMSG_TRANSCRIPT.h() || i2 == AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT.h()) {
                            hr30Var = new gs30();
                        } else if (i2 == AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE.h()) {
                            hr30Var = new is30();
                        } else if (i2 == AdapterEntryType.TYPE_GRAFFITI.h()) {
                            hr30Var = new cr30();
                        } else if (i2 == AdapterEntryType.TYPE_FWD_SENDER.h()) {
                            int i38 = pq30.k;
                            zs30Var = new pq30(layoutInflater.inflate(R.layout.vkim_msg_part_fwd_sender, viewGroup2, false));
                        } else if (i2 == AdapterEntryType.TYPE_FWD_TIME.h()) {
                            hr30Var = new rq30();
                        } else if (i2 == AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL.h()) {
                            hr30Var = new mt30();
                        } else if (i2 == AdapterEntryType.TYPE_FWD_HEADER.h()) {
                            hr30Var = new nq30();
                        } else if (i2 == AdapterEntryType.TYPE_NESTED_FORWARD.h()) {
                            hr30Var = new ms30();
                        } else if (i2 == AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL_REDESIGNED.h()) {
                            hr30Var = new nt30();
                        } else if (i2 == AdapterEntryType.TYPE_ARTICLE.h()) {
                            int i39 = un30.v;
                            zs30Var = new un30(layoutInflater.inflate(R.layout.vkim_msg_part_article, viewGroup2, false));
                        } else if (i2 == AdapterEntryType.TYPE_CALL.h()) {
                            int i40 = oo30.h;
                            zs30Var = new oo30((MsgPartIconTwoRowView) layoutInflater.inflate(R.layout.vkim_msg_part_call, viewGroup2, false));
                        } else if (i2 == AdapterEntryType.TYPE_GROUP_CALL.h()) {
                            int i41 = er30.o;
                            zs30Var = new er30(layoutInflater.inflate(R.layout.vkim_msg_part_group_call, viewGroup2, false));
                        } else if (i2 == AdapterEntryType.TYPE_STORY.h()) {
                            hr30Var = new xt30();
                        } else if (i2 == AdapterEntryType.TYPE_NESTED_STORY.h()) {
                            hr30Var = new ns30();
                        } else if (i2 == AdapterEntryType.TYPE_POLL.h()) {
                            int i42 = zs30.j;
                            zs30Var = new zs30((AbstractPollView) layoutInflater.inflate(R.layout.vkim_msg_part_poll, viewGroup2, false), viewGroup2.getContext());
                        } else if (i2 == AdapterEntryType.TYPE_PODCAST_EPISODE.h()) {
                            hr30Var = new vs30();
                        } else if (i2 == AdapterEntryType.TYPE_PODCAST_EPISODE_RESTRICTED.h()) {
                            hr30Var = new xs30();
                        } else if (i2 == AdapterEntryType.TYPE_REPLY.h()) {
                            hr30Var = new ht30();
                        } else if (i2 == AdapterEntryType.TYPE_KEYBOARD.h()) {
                            hr30Var = new kr30(q0w0Var);
                        } else if (i2 == AdapterEntryType.TYPE_CAROUSEL.h()) {
                            hr30Var = new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.c(q0w0Var, vrr0Var.d);
                        } else if (i2 == AdapterEntryType.TYPE_DELETED.h()) {
                            hr30Var = new mp30();
                        } else if (i2 == AdapterEntryType.TYPE_EVENT.h()) {
                            hr30Var = new bq30();
                        } else if (i2 == AdapterEntryType.TYPE_MINI_APP.h()) {
                            hr30Var = new es30();
                        } else if (i2 == AdapterEntryType.TYPE_USER_NAME.h()) {
                            hr30Var = new gu30();
                        } else if (i2 == AdapterEntryType.TYPE_UNSUPPORTED.h()) {
                            hr30Var = new eu30();
                        } else if (i2 == AdapterEntryType.TYPE_EMPTY.h()) {
                            hr30Var = new zp30();
                        } else if (i2 == AdapterEntryType.TYPE_SERVICE_UNSUPPORTED.h()) {
                            hr30Var = new ks30();
                        } else if (i2 == AdapterEntryType.TYPE_CURATOR.h()) {
                            hr30Var = new kp30();
                        } else if (i2 == AdapterEntryType.TYPE_DONUT_LINK.h()) {
                            hr30Var = new wp30();
                        } else if (i2 == AdapterEntryType.TYPE_WIDGET.h()) {
                            hr30Var = new zu30();
                        } else if (i2 == AdapterEntryType.TYPE_HIGHLIGHT.h()) {
                            hr30Var = new fr30();
                        } else if (i2 == AdapterEntryType.TYPE_VMOJI_CHARACTER_LINK.h()) {
                            hr30Var = new ku30();
                        } else if (i2 == AdapterEntryType.TYPE_VMOJI_PACK_LINK.h()) {
                            hr30Var = new ku30();
                        } else if (i2 == AdapterEntryType.TYPE_APP_ACTION.h()) {
                            hr30Var = new cs30();
                        } else if (i2 == AdapterEntryType.TYPE_REACTIONS.h()) {
                            hr30Var = new ft30(vrr0Var.f);
                        } else if (i2 == AdapterEntryType.TYPE_VIEWS_AND_TIME.h()) {
                            hr30Var = new iu30();
                        } else if (i2 == AdapterEntryType.TYPE_QUESTION.h()) {
                            hr30Var = new dt30();
                        } else if (i2 == AdapterEntryType.TYPE_COMMENTS_BUTTON.h()) {
                            hr30Var = new bp30();
                        } else if (i2 == AdapterEntryType.TYPE_CHANNEL_POST_HEADER.h()) {
                            hr30Var = new yo30();
                        } else if (i2 == AdapterEntryType.TYPE_ROOM.h()) {
                            hr30Var = new jt30();
                        } else if (i2 == AdapterEntryType.TYPE_BLOCKED_POST.h()) {
                            hr30Var = new io30();
                        } else if (i2 == AdapterEntryType.TYPE_FWD_CHANNEL_MSG_HEADER.h()) {
                            hr30Var = new lq30();
                        } else if (i2 == AdapterEntryType.TYPE_FWD_CHANNEL_MSG_UNAVAILABLE.h()) {
                            hr30Var = new mq30();
                        } else if (i2 == AdapterEntryType.TYPE_FAKE_NEWS.h()) {
                            hr30Var = new hq30();
                        } else if (i2 == AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_PHOTO_VIDEO.h()) {
                            hr30Var = new xo30();
                        } else if (i2 == AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO.h()) {
                            hr30Var = new ro30();
                        } else if (i2 == AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO_COMPACT.h()) {
                            hr30Var = new to30();
                        } else if (i2 == AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC.h()) {
                            hr30Var = new uo30();
                        } else if (i2 == AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC_PREVIEW.h()) {
                            hr30Var = new vo30();
                        }
                        hr30Var = zs30Var;
                    }
                }
                VkOnboardingComponent vkOnboardingComponent = vrr0Var.e;
                if (i2 != AdapterEntryType.TYPE_VIDEO_AUTOPLAY.h() && i2 != AdapterEntryType.TYPE_PUBLIC_VIDEO.h() && i2 != AdapterEntryType.TYPE_INTERACTIVE_VIDEO.h() && i2 != AdapterEntryType.TYPE_GIF_AUTOPLAY.h() && i2 != AdapterEntryType.TYPE_VIDEO_MSG.h()) {
                    int i43 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a.T;
                    return new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a(layoutInflater.inflate(R.layout.vkim_msg_list_item_msg_from_user_floating, viewGroup2, false), viewGroup2, hr30Var, cau0Var, vkOnboardingComponent);
                }
                hr30 hr30Var2 = hr30Var;
                int i44 = iqr0.V;
                return new iqr0(layoutInflater.inflate(R.layout.vkim_msg_list_item_msg_from_user_floating, viewGroup2, false), viewGroup2, hr30Var2, cau0Var, vkOnboardingComponent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        d3m.b(e0Var.itemView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        super.onViewDetachedFromWindow(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        osr0 osr0Var = e0Var instanceof osr0 ? (osr0) e0Var : null;
        if (osr0Var != null) {
            osr0Var.W5();
        }
    }

    public final ArrayList x0(MsgIdType msgIdType, int i) {
        int i2 = a.$EnumSwitchMapping$0[msgIdType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = this.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0 = ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) obj).E0();
                Integer valueOf = (E0 == null || E0.b != i) ? null : Integer.valueOf(i3);
                if (valueOf != null) {
                    arrayList.add(valueOf);
                }
                i3 = i4;
            }
            return arrayList;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list2 = this.f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) obj2).E0();
            Integer valueOf2 = (E02 == null || E02.c != i) ? null : Integer.valueOf(i3);
            if (valueOf2 != null) {
                arrayList2.add(valueOf2);
            }
            i3 = i5;
        }
        return arrayList2;
    }

    public final <T> T y0(Measurement.Type type, int i, gzs<? extends T> gzsVar) {
        Object obj;
        com.vk.stat.recycler.d dVar = this.d;
        if (dVar != null) {
            dVar.a();
        }
        T invoke = gzsVar.invoke();
        if (dVar != null) {
            Iterator<E> it = AdapterEntryType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AdapterEntryType) obj).h() == i) {
                    break;
                }
            }
            AdapterEntryType adapterEntryType = (AdapterEntryType) obj;
            dVar.b(i, type, adapterEntryType != null ? adapterEntryType.name() : null);
        }
        return invoke;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        y0(Measurement.Type.Bind, e0Var.getItemViewType(), new yyx(list, this, e0Var, i));
    }
}
