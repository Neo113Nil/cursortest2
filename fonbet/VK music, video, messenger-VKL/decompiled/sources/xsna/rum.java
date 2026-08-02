package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.LruCache;
import com.vk.core.serialize.Serializer;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bfz;
import xsna.esm;
import xsna.ih30;
import xsna.mto0;
import xsna.zfm;

/* compiled from: DialogsMapper.kt */
/* loaded from: classes18.dex */
public final class rum {
    public final esm.a a;
    public final vlm f;
    public final com.vk.im.ui.formatters.a h;
    public final en30 i;
    public final com.vk.im.ui.views.avatars.b j;
    public final DisplayNameFormatter k;
    public final gp80 l;
    public final zri m;
    public final LruCache<Peer, a<zfm.e>> b = new LruCache<>(50);
    public final LruCache<Peer, a<zfm.d>> c = new LruCache<>(50);
    public final LruCache<Peer, a<zfm.g>> d = new LruCache<>(50);
    public final LruCache<Peer, a<Drawable>> e = new LruCache<>(50);
    public final SpannableStringBuilder g = new SpannableStringBuilder();
    public final SpannableStringBuilder n = new SpannableStringBuilder();
    public final g3a0 o = new g3a0();

    /* compiled from: DialogsMapper.kt */
    public static final class a<T> {
        public final String a;
        public final T b;

        public a(String str, T t) {
            this.a = str;
            this.b = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            T t = this.b;
            return hashCode + (t == null ? 0 : t.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Cache(key=");
            sb.append(this.a);
            sb.append(", value=");
            return k73.c(sb, this.b, ')');
        }
    }

    public rum(Context context, esm.a aVar) {
        this.a = aVar;
        this.f = new vlm(context);
        this.h = new com.vk.im.ui.formatters.a(context);
        this.i = new en30(context);
        this.j = new com.vk.im.ui.views.avatars.b(context, false);
        this.k = new DisplayNameFormatter(null, 2, context.getString(R.string.vkim_loading));
        this.l = new gp80(context);
        this.m = new zri(context);
    }

    public static pgm a(bfz.a aVar) {
        if (aVar instanceof bfz.a.e) {
            return new kvw(((bfz.a.e) aVar).b);
        }
        if (aVar instanceof bfz.a.g) {
            return new kvw(((bfz.a.g) aVar).b);
        }
        if (aVar instanceof bfz.a.C2608a) {
            ((bfz.a.C2608a) aVar).b.getClass();
            return new o7p();
        }
        if (aVar instanceof bfz.a.d) {
            return new kvw(((bfz.a.d) aVar).b);
        }
        if (aVar instanceof bfz.a.c) {
            InfoBar infoBar = ((bfz.a.c) aVar).b;
            return (((InfoBar.Payload.GiftsBirthdays) infoBar.m).c.size() != 1 || infoBar.j.isEmpty()) ? new xls(infoBar) : new kvw(infoBar);
        }
        if (aVar instanceof bfz.a.f) {
            return new kvw(((bfz.a.f) aVar).b);
        }
        if (aVar.equals(bfz.a.b.a)) {
            throw new IllegalArgumentException("This should not be happen!");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(Msg msg) {
        AttachAudioMsg a7;
        String str;
        ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            return String.valueOf(msg.hashCode());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(msg.b);
        sb.append(msg.d);
        sb.append(msg.g);
        sb.append(msg.Hb());
        boolean z = false;
        if ((msg instanceof com.vk.im.engine.models.messages.a) && (a7 = ((com.vk.im.engine.models.messages.a) msg).a7()) != null && (str = a7.l) != null && str.length() > 0) {
            z = true;
        }
        sb.append(z);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x01e0, code lost:
    
        if (r8 == null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zfm b(Dialog dialog, ProfilesInfo profilesInfo, Msg msg, List<vh30> list, boolean z, boolean z2, ImStoryState imStoryState, MsgReadAsLastData msgReadAsLastData, boolean z3, Peer peer) {
        int i;
        Integer num;
        zfm.d aVar;
        boolean z4;
        boolean z5;
        char c;
        String str;
        esm.a aVar2;
        zfm.e eVar;
        ImageList imageList;
        boolean z6;
        String str2;
        String sb;
        a<Drawable> aVar3;
        LruCache<Peer, a<Drawable>> lruCache;
        Drawable drawable;
        Drawable drawable2;
        zfm.c bVar;
        Peer.Type t8;
        String str3;
        zfm.f fVar;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        ImageStatus E5;
        CharSequence charSequence;
        zfm.e.b bVar2;
        String str4;
        Contact contact;
        boolean z11 = msg instanceof MsgFromUser;
        MsgFromUser msgFromUser = z11 ? (MsgFromUser) msg : null;
        boolean z12 = (msgFromUser == null || !dialog.Gb() || msgReadAsLastData == null || dialog.sc() || ((i = msgFromUser.d) != msgReadAsLastData.a && ((num = msgReadAsLastData.d) == null || i != num.intValue())) || msgReadAsLastData.b != 1 || msgFromUser.T != null) ? false : true;
        qtd0 Bb = profilesInfo.Bb(dialog.Zb());
        Peer Zb = dialog.Zb();
        LruCache<Peer, a<zfm.d>> lruCache2 = this.c;
        a<zfm.d> aVar4 = lruCache2.get(Zb);
        String str5 = dialog.Zb().b + j5g.g0(list, null, null, null, 0, new oc0(18), 31);
        if (epx.f(aVar4 != null ? aVar4.a : null, str5)) {
            aVar = aVar4.b;
        } else {
            hcm hcmVar = new hcm(dialog.Zb().b, list);
            SpannableStringBuilder spannableStringBuilder = this.n;
            spannableStringBuilder.clear();
            this.m.c(profilesInfo.Ob(), hcmVar, dialog, spannableStringBuilder);
            aVar = (spannableStringBuilder.length() <= 0 || !hcmVar.c()) ? zfm.d.b.a : new zfm.d.a(new SpannableString(spannableStringBuilder), hcmVar.b());
            lruCache2.put(dialog.Zb(), new a<>(str5, aVar));
        }
        zfm.d.b bVar3 = zfm.d.b.a;
        boolean f = epx.f(aVar, bVar3);
        esm.a aVar5 = this.a;
        if (f) {
            Peer Zb2 = dialog.Zb();
            LruCache<Peer, a<zfm.e>> lruCache3 = this.b;
            a<zfm.e> aVar6 = lruCache3.get(Zb2);
            c = 18;
            StringBuilder sb2 = new StringBuilder();
            z5 = z11;
            sb2.append(dialog.Ub());
            str = "";
            aVar2 = aVar5;
            sb2.append(dialog.nc().b);
            sb2.append(dialog.Kb().b);
            sb2.append(profilesInfo.b.c.keySet());
            sb2.append(profilesInfo.e.c.keySet());
            wpp<Long, Contact> wppVar = profilesInfo.c;
            sb2.append(wppVar.c.keySet());
            sb2.append(profilesInfo.d.c.keySet());
            if (msg != null) {
                sb2.append(c(msg));
            }
            String sb3 = sb2.toString();
            if (epx.f(aVar6 != null ? aVar6.a : null, sb3)) {
                eVar = aVar6.b;
                z4 = z12;
            } else {
                if (dialog.Kb().d()) {
                    ih30.a aVar7 = ih30.a;
                    eVar = new zfm.e.b(ih30.c(dialog.ac(), dialog.Kb()), null);
                } else {
                    if (msg == null && (dialog.t1() || dialog.E8())) {
                        if (dialog.t1()) {
                            str4 = imj0.c(this.l, dialog.Zb(), profilesInfo);
                        } else {
                            if (dialog.E8() && (contact = (Contact) wppVar.c.get(Long.valueOf(dialog.ac()))) != null) {
                                v8j v8jVar = v8j.a;
                                String a2 = v8j.a(contact.m);
                                str4 = a2 == null ? this.o.a(contact.d).toString() : a2;
                            }
                            str4 = str;
                        }
                        bVar2 = new zfm.e.b(str4, null);
                    } else if (msg == null) {
                        eVar = zfm.e.a.a;
                    } else {
                        if (dialog.uc()) {
                            aVar2.getClass();
                        }
                        if (msg instanceof MsgFromUser) {
                            ProfilesSimpleInfo Ob = profilesInfo.Ob();
                            SpannableString b = ih30.b(msg, dialog, Ob, peer);
                            if (b.length() > 0) {
                                z4 = z12;
                                charSequence = null;
                            } else {
                                MsgFromUser msgFromUser2 = (MsgFromUser) msg;
                                boolean g8 = msgFromUser2.g8();
                                SpannableStringBuilder spannableStringBuilder2 = this.g;
                                if (g8) {
                                    spannableStringBuilder2.clear();
                                    spannableStringBuilder2.append(this.h.b(msgFromUser2));
                                    kh30.a(spannableStringBuilder2, msgFromUser2, dialog, Ob);
                                    charSequence = new SpannableString(spannableStringBuilder2);
                                    z4 = z12;
                                } else {
                                    boolean p3 = msgFromUser2.p3();
                                    en30 en30Var = this.i;
                                    if (p3) {
                                        z4 = z12;
                                        NestedMsg.Type type = NestedMsg.Type.REPLY;
                                        spannableStringBuilder2.clear();
                                        spannableStringBuilder2.append((CharSequence) en30Var.b(msgFromUser2, type));
                                        kh30.a(spannableStringBuilder2, msgFromUser2, dialog, Ob);
                                        charSequence = new SpannableString(spannableStringBuilder2);
                                    } else {
                                        z4 = z12;
                                        if (msgFromUser2.db()) {
                                            NestedMsg.Type type2 = NestedMsg.Type.FWD;
                                            spannableStringBuilder2.clear();
                                            spannableStringBuilder2.append((CharSequence) en30Var.b(msgFromUser2, type2));
                                            kh30.a(spannableStringBuilder2, msgFromUser2, dialog, Ob);
                                            charSequence = new SpannableString(spannableStringBuilder2);
                                        } else {
                                            charSequence = str;
                                        }
                                    }
                                }
                            }
                            eVar = new zfm.e.b(b, charSequence);
                            lruCache3.put(dialog.Zb(), new a<>(sb3, eVar));
                        } else {
                            ih30.a aVar8 = ih30.a;
                            bVar2 = new zfm.e.b(ih30.b(msg, dialog, profilesInfo.Ob(), peer), null);
                        }
                    }
                    z4 = z12;
                    eVar = bVar2;
                    lruCache3.put(dialog.Zb(), new a<>(sb3, eVar));
                }
                z4 = z12;
                lruCache3.put(dialog.Zb(), new a<>(sb3, eVar));
            }
        } else {
            z4 = z12;
            z5 = z11;
            c = 18;
            str = "";
            aVar2 = aVar5;
            eVar = zfm.e.a.a;
        }
        zfm.e eVar2 = eVar;
        boolean f2 = epx.f(aVar, bVar3);
        zfm.g gVar = zfm.g.d;
        if (!f2) {
            g2v.c().getClass();
        } else if (msg != null) {
            long j = msg.c;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b2 = Peer.a.b(j);
            if (b2 != null) {
                LruCache<Peer, a<zfm.g>> lruCache4 = this.d;
                a<zfm.g> aVar9 = lruCache4.get(b2);
                String c2 = c(msg);
                if (epx.f(aVar9 != null ? aVar9.a : null, c2)) {
                    gVar = aVar9.b;
                } else {
                    aVar2.getClass();
                    g2v.c().getClass();
                    long j2 = msg.g;
                    StringBuffer stringBuffer = this.f.e;
                    vlm.b(j2, stringBuffer);
                    String stringBuffer2 = stringBuffer.toString();
                    g2v.c().getClass();
                    StringBuffer stringBuffer3 = new StringBuffer();
                    mto0.a(msg.g, stringBuffer3, mto0.a.C3369a.g);
                    zfm.g gVar2 = new zfm.g(stringBuffer2, msg.g, stringBuffer3.toString());
                    lruCache4.put(b2, new a<>(c2, gVar2));
                    gVar = gVar2;
                }
            }
        }
        zfm.g gVar3 = gVar;
        DialogsListAdapter.ViewType viewType = DialogsListAdapter.ViewType.DIALOG;
        boolean z13 = z5;
        Peer Zb3 = dialog.Zb();
        if (dialog.Jc()) {
            bVar = zfm.c.a.a;
        } else {
            ChatSettings Hb = dialog.Hb();
            if (Hb == null || (imageList = Hb.c) == null) {
                if (Bb != null) {
                    imageList = Bb.C8();
                } else {
                    z6 = true;
                    str2 = null;
                    imageList = new ImageList(null, 1, null);
                    ChatSettings Hb2 = dialog.Hb();
                    boolean z14 = (Hb2 == null ? Hb2.c : str2) == null && Bb != null && Bb.n9() == z6;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(dialog.Jc());
                    ChatSettings Hb3 = dialog.Hb();
                    sb4.append((Hb3 != null || (str3 = Hb3.b) == null) ? 0L : Integer.valueOf(str3.hashCode()));
                    sb4.append(dialog.hc().hashCode());
                    String name = Bb != null ? Bb.name() : str2;
                    sb4.append(name == null ? str : name);
                    sb4.append((Bb != null || (t8 = Bb.t8()) == null) ? -1 : t8.ordinal());
                    sb = sb4.toString();
                    Peer Zb4 = dialog.Zb();
                    LruCache<Peer, a<Drawable>> lruCache5 = this.e;
                    aVar3 = lruCache5.get(Zb4);
                    if (epx.f(aVar3 != null ? aVar3.a : str2, sb)) {
                        drawable2 = aVar3.b;
                    } else {
                        ChatSettings Hb4 = dialog.Hb();
                        if (dialog.Jc()) {
                            drawable = new qmm(cn70.b(56));
                            lruCache = lruCache5;
                        } else {
                            com.vk.im.ui.views.avatars.b bVar4 = this.j;
                            if (Hb4 != null) {
                                lruCache = lruCache5;
                                drawable = bVar4.c(Hb4, dialog.Sb().longValue(), dialog.hc());
                            } else {
                                lruCache = lruCache5;
                                if (Bb != null) {
                                    bVar4.getClass();
                                    drawable = bVar4.e(Bb.name(), Bb.t8());
                                } else {
                                    drawable = null;
                                }
                            }
                        }
                        lruCache.put(dialog.Zb(), new a<>(sb, drawable));
                        drawable2 = drawable;
                    }
                    bVar = new zfm.c.b(imageList, drawable2, z14);
                }
            }
            z6 = true;
            str2 = null;
            ChatSettings Hb22 = dialog.Hb();
            if ((Hb22 == null ? Hb22.c : str2) == null) {
                StringBuilder sb42 = new StringBuilder();
                sb42.append(dialog.Jc());
                ChatSettings Hb32 = dialog.Hb();
                sb42.append((Hb32 != null || (str3 = Hb32.b) == null) ? 0L : Integer.valueOf(str3.hashCode()));
                sb42.append(dialog.hc().hashCode());
                if (Bb != null) {
                }
                sb42.append(name == null ? str : name);
                sb42.append((Bb != null || (t8 = Bb.t8()) == null) ? -1 : t8.ordinal());
                sb = sb42.toString();
                Peer Zb42 = dialog.Zb();
                LruCache<Peer, a<Drawable>> lruCache52 = this.e;
                aVar3 = lruCache52.get(Zb42);
                if (epx.f(aVar3 != null ? aVar3.a : str2, sb)) {
                }
                bVar = new zfm.c.b(imageList, drawable2, z14);
            }
            StringBuilder sb422 = new StringBuilder();
            sb422.append(dialog.Jc());
            ChatSettings Hb322 = dialog.Hb();
            sb422.append((Hb322 != null || (str3 = Hb322.b) == null) ? 0L : Integer.valueOf(str3.hashCode()));
            sb422.append(dialog.hc().hashCode());
            if (Bb != null) {
            }
            sb422.append(name == null ? str : name);
            sb422.append((Bb != null || (t8 = Bb.t8()) == null) ? -1 : t8.ordinal());
            sb = sb422.toString();
            Peer Zb422 = dialog.Zb();
            LruCache<Peer, a<Drawable>> lruCache522 = this.e;
            aVar3 = lruCache522.get(Zb422);
            if (epx.f(aVar3 != null ? aVar3.a : str2, sb)) {
            }
            bVar = new zfm.c.b(imageList, drawable2, z14);
        }
        String c3 = this.k.c(dialog, profilesInfo);
        aVar2.getClass();
        zfm.h aVar10 = (dialog.Ic() && dialog.Xb().k()) ? dialog.Jb() > 0 ? new zfm.h.a(dialog.Jb(), !dialog.lc().isEmpty()) : zfm.h.b.a : zfm.h.c.a;
        OnlineInfo mb = Bb != null ? Bb.mb() : null;
        if (mb == null || dialog.Jc() || mb.Ab()) {
            fVar = zfm.f.b.a;
        } else {
            VisibleStatus zb = mb.zb();
            if (zb == null) {
                fVar = zfm.f.b.a;
            } else if (zb.Cb()) {
                fVar = zfm.f.c.a;
            } else {
                Platform platform = zb.e;
                fVar = platform == Platform.MOBILE ? zfm.f.a.a : platform == Platform.WEB ? zfm.f.d.a : zfm.f.b.a;
            }
        }
        zfm.f fVar2 = fVar;
        zfm.b bVar5 = new zfm.b();
        boolean z15 = !dialog.Lb().isEmpty();
        qcy<Object>[] qcyVarArr = zfm.b.x;
        qcy<Object> qcyVar = qcyVarArr[0];
        bVar5.a.b(z15);
        boolean z16 = dialog.Ob() != null;
        qcy<Object> qcyVar2 = qcyVarArr[1];
        bVar5.b.b(z16);
        qcy<Object> qcyVar3 = qcyVarArr[2];
        bVar5.c.b(z2);
        MsgFromUser msgFromUser3 = z13 ? (MsgFromUser) msg : null;
        if (msgFromUser3 != null) {
            z7 = true;
            if (msgFromUser3.D3(AttachGift.class, false)) {
                z8 = true;
                qcy<Object> qcyVar4 = qcyVarArr[3];
                bVar5.d.b(z8);
                boolean isEmpty = dialog.lc().isEmpty() ^ z7;
                qcy<Object> qcyVar5 = qcyVarArr[4];
                bVar5.e.b(isEmpty);
                qcy<Object> qcyVar6 = qcyVarArr[5];
                bVar5.f.b(z);
                boolean z17 = z2 && !z && dialog.Rb();
                qcy<Object> qcyVar7 = qcyVarArr[6];
                bVar5.g.b(z17);
                boolean z18 = Bb == null && !Bb.ka() && !dialog.Jc() && qv20.k(Bb);
                qcy<Object> qcyVar8 = qcyVarArr[7];
                bVar5.h.b(z18);
                GroupCallInProgress Ob2 = dialog.Ob();
                List<Long> list2 = Ob2 == null ? Ob2.b : null;
                boolean z19 = list2 != null || list2.isEmpty();
                qcy<Object> qcyVar9 = qcyVarArr[8];
                bVar5.i.b(!z19);
                boolean sc = dialog.sc();
                qcy<Object> qcyVar10 = qcyVarArr[9];
                bVar5.j.b(sc);
                ChatSettings Hb5 = dialog.Hb();
                boolean z20 = Hb5 == null && Hb5.H;
                qcy<Object> qcyVar11 = qcyVarArr[10];
                bVar5.k.b(z20);
                boolean o1 = dialog.o1();
                qcy<Object> qcyVar12 = qcyVarArr[11];
                bVar5.l.b(o1);
                qcy<Object> qcyVar13 = qcyVarArr[12];
                bVar5.m.b(false);
                boolean z21 = !dialog.Vb() && dialog.Xb().k();
                qcy<Object> qcyVar14 = qcyVarArr[14];
                bVar5.o.b(z21);
                xuo0.a.getClass();
                boolean z22 = !dialog.Ac(xuo0.a());
                qcy<Object> qcyVar15 = qcyVarArr[15];
                bVar5.p.b(z22);
                boolean f3 = !z3 ? com.vk.im.engine.models.im_item.b.f(dialog.y9()) : dialog.Bc();
                qcy<Object> qcyVar16 = qcyVarArr[16];
                bVar5.q.b(f3);
                boolean Gc = dialog.Gc();
                qcy<Object> qcyVar17 = qcyVarArr[17];
                bVar5.r.b(Gc);
                VerifyInfo q9 = Bb == null ? Bb.q9() : null;
                boolean z23 = q9 == null ? q9.b : false;
                qcy<Object> qcyVar18 = qcyVarArr[c];
                bVar5.s.b(z23);
                boolean z24 = q9 == null ? q9.d : false;
                qcy<Object> qcyVar19 = qcyVarArr[19];
                bVar5.t.b(z24);
                if (msg == null) {
                    z9 = true;
                    if (!msg.i) {
                        z10 = true;
                        qcy<Object> qcyVar20 = qcyVarArr[13];
                        bVar5.n.b(z10);
                        boolean z25 = (dialog.mc().isEmpty() && dialog.T8()) ? z9 : false;
                        qcy<Object> qcyVar21 = qcyVarArr[20];
                        bVar5.u.b(z25);
                        qcy<Object> qcyVar22 = qcyVarArr[21];
                        bVar5.v.b(z4);
                        ImageStatus imageStatus = (Bb != null || (E5 = Bb.E5()) == null || dialog.Jc()) ? null : E5;
                        Integer valueOf = dialog.sc() ? Integer.valueOf(c4g0.t(dialog.hc())) : null;
                        List<Peer.Type> list3 = rdw.a;
                        return new zfm(Zb3, bVar, c3, eVar2, gVar3, aVar10, fVar2, aVar, bVar5, imageStatus, valueOf, rdw.a(dialog.Zb(), dialog.Jc()) ? imStoryState : ImStoryState.NONE, viewType);
                    }
                } else {
                    z9 = true;
                }
                z10 = false;
                qcy<Object> qcyVar202 = qcyVarArr[13];
                bVar5.n.b(z10);
                if (dialog.mc().isEmpty()) {
                }
                qcy<Object> qcyVar212 = qcyVarArr[20];
                bVar5.u.b(z25);
                qcy<Object> qcyVar222 = qcyVarArr[21];
                bVar5.v.b(z4);
                if (Bb != null) {
                }
                if (dialog.sc()) {
                }
                List<Peer.Type> list32 = rdw.a;
                return new zfm(Zb3, bVar, c3, eVar2, gVar3, aVar10, fVar2, aVar, bVar5, imageStatus, valueOf, rdw.a(dialog.Zb(), dialog.Jc()) ? imStoryState : ImStoryState.NONE, viewType);
            }
        } else {
            z7 = true;
        }
        z8 = false;
        qcy<Object> qcyVar42 = qcyVarArr[3];
        bVar5.d.b(z8);
        boolean isEmpty2 = dialog.lc().isEmpty() ^ z7;
        qcy<Object> qcyVar52 = qcyVarArr[4];
        bVar5.e.b(isEmpty2);
        qcy<Object> qcyVar62 = qcyVarArr[5];
        bVar5.f.b(z);
        if (z2) {
        }
        qcy<Object> qcyVar72 = qcyVarArr[6];
        bVar5.g.b(z17);
        if (Bb == null) {
        }
        qcy<Object> qcyVar82 = qcyVarArr[7];
        bVar5.h.b(z18);
        GroupCallInProgress Ob22 = dialog.Ob();
        List<Long> list22 = Ob22 == null ? Ob22.b : null;
        if (list22 != null) {
        }
        qcy<Object> qcyVar92 = qcyVarArr[8];
        bVar5.i.b(!z19);
        boolean sc2 = dialog.sc();
        qcy<Object> qcyVar102 = qcyVarArr[9];
        bVar5.j.b(sc2);
        ChatSettings Hb52 = dialog.Hb();
        if (Hb52 == null) {
        }
        qcy<Object> qcyVar112 = qcyVarArr[10];
        bVar5.k.b(z20);
        boolean o12 = dialog.o1();
        qcy<Object> qcyVar122 = qcyVarArr[11];
        bVar5.l.b(o12);
        qcy<Object> qcyVar132 = qcyVarArr[12];
        bVar5.m.b(false);
        if (dialog.Vb()) {
        }
        qcy<Object> qcyVar142 = qcyVarArr[14];
        bVar5.o.b(z21);
        xuo0.a.getClass();
        boolean z222 = !dialog.Ac(xuo0.a());
        qcy<Object> qcyVar152 = qcyVarArr[15];
        bVar5.p.b(z222);
        if (!z3) {
        }
        qcy<Object> qcyVar162 = qcyVarArr[16];
        bVar5.q.b(f3);
        boolean Gc2 = dialog.Gc();
        qcy<Object> qcyVar172 = qcyVarArr[17];
        bVar5.r.b(Gc2);
        if (Bb == null) {
        }
        if (q9 == null) {
        }
        qcy<Object> qcyVar182 = qcyVarArr[c];
        bVar5.s.b(z23);
        if (q9 == null) {
        }
        qcy<Object> qcyVar192 = qcyVarArr[19];
        bVar5.t.b(z24);
        if (msg == null) {
        }
        z10 = false;
        qcy<Object> qcyVar2022 = qcyVarArr[13];
        bVar5.n.b(z10);
        if (dialog.mc().isEmpty()) {
        }
        qcy<Object> qcyVar2122 = qcyVarArr[20];
        bVar5.u.b(z25);
        qcy<Object> qcyVar2222 = qcyVarArr[21];
        bVar5.v.b(z4);
        if (Bb != null) {
        }
        if (dialog.sc()) {
        }
        List<Peer.Type> list322 = rdw.a;
        return new zfm(Zb3, bVar, c3, eVar2, gVar3, aVar10, fVar2, aVar, bVar5, imageStatus, valueOf, rdw.a(dialog.Zb(), dialog.Jc()) ? imStoryState : ImStoryState.NONE, viewType);
    }
}
