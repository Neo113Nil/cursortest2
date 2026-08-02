package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.hints.HintId;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.design.view.spoiler.SpoilerView;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.im.ui.views.RichEditText;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vk.writebar.WriteBar;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.bcb;
import xsna.ets0;
import xsna.ybb;

/* compiled from: ChannelSendMsgViewController.kt */
/* loaded from: classes16.dex */
public final class zbb extends fi6<ccb, ybb> {
    public final MviComponentFragment f;
    public final long g;
    public final ixa h;
    public final ChannelMsgSendState i;
    public final kkm j;
    public final q7v0 k;
    public final PhotoEditorComponent l;
    public final vbb m;
    public final gzs<s3q0> n;
    public final fts0 o;
    public ChannelMsgSendConfig p;
    public com.vk.channels.impl.channel_screen.send_msg.a q;
    public View r;
    public View s;
    public final bpn0 t;

    /* compiled from: ChannelSendMsgViewController.kt */
    public final class a implements ets0.a {
        public a() {
        }

        @Override // xsna.ets0.a
        public final void a() {
            com.vk.channels.impl.channel_screen.send_msg.a aVar = zbb.this.q;
            if (aVar == null) {
                aVar = null;
            }
            aVar.A();
        }

        @Override // xsna.ets0.a
        public final void b(File file, int i, boolean z) {
            String path = file.getPath();
            VideoFileOld videoFileOld = new VideoFileOld();
            videoFileOld.z = true;
            videoFileOld.l0 = true;
            AttachVideoMsg attachVideoMsg = new AttachVideoMsg(videoFileOld, i, new ImageList(null, 1, null), null, 0L, new ImageList(new Image(path)), path, 0, AttachSyncState.UPLOAD_REQUIRED, null, null, 0, false, false, false, null, 65176, null);
            zbb zbbVar = zbb.this;
            zbbVar.R(ChannelMsgSendConfig.a(zbbVar.p, null, false, false, false, false, null, null, null, null, false, false, false, false, null, 22485), true, new h57(2, zbbVar, attachVideoMsg));
            com.vk.channels.impl.channel_screen.send_msg.a aVar = zbbVar.q;
            if (aVar == null) {
                aVar = null;
            }
            aVar.y();
        }

        @Override // xsna.ets0.a
        public final void c(long j) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar = zbb.this.q;
            if (aVar == null) {
                aVar = null;
            }
            aVar.C(j);
        }

        @Override // xsna.ets0.a
        public final void onClose() {
            com.vk.channels.impl.channel_screen.send_msg.a aVar = zbb.this.q;
            if (aVar == null) {
                aVar = null;
            }
            aVar.m();
        }
    }

    public zbb(MviComponentFragment mviComponentFragment, long j, ixa ixaVar, ChannelMsgSendState channelMsgSendState, kkm kkmVar, q7v0 q7v0Var, PhotoEditorComponent photoEditorComponent, vbb vbbVar, gzs gzsVar, fts0 fts0Var) {
        super(R.layout.im_channel_send_msg, null);
        this.f = mviComponentFragment;
        this.g = j;
        this.h = ixaVar;
        this.i = channelMsgSendState;
        this.j = kkmVar;
        this.k = q7v0Var;
        this.l = photoEditorComponent;
        this.m = vbbVar;
        this.n = gzsVar;
        this.o = fts0Var;
        ChannelMsgSendConfig channelMsgSendConfig = ChannelMsgSendConfig.c;
        cew.b.getClass();
        this.p = ChannelMsgSendConfig.a(channelMsgSendConfig, null, false, false, false, false, null, null, null, null, false, cew.i(), false, false, null, 30719);
        this.t = new bpn0(new xs6(4));
    }

    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fi6
    public final void Q(View view) {
        zdw zdwVar = i7o0.b;
        zdw zdwVar2 = zdwVar != null ? zdwVar : null;
        jbs jbsVar = new jbs(this.f);
        ChannelMsgSendState channelMsgSendState = this.i;
        com.vk.channels.impl.channel_screen.send_msg.a aVar = new com.vk.channels.impl.channel_screen.send_msg.a(zdwVar2, jbsVar, this.j, this.k, this.l, this.h, this.g, channelMsgSendState.e, channelMsgSendState.b, this.p.B());
        this.q = aVar;
        b bVar = new b(view);
        aVar.E = bVar;
        aVar.y = view;
        LayoutInflater.from(view.getContext()).inflate(R.layout.im_channel_write_bar, (ViewGroup) view.findViewById(R.id.write_area), true);
        WriteBar writeBar = (WriteBar) view.findViewById(R.id.write_bar);
        aVar.x = writeBar;
        aVar.z = writeBar.findViewById(R.id.writebar_send);
        WriteBar writeBar2 = aVar.x;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        aVar.B = (RichEditText) writeBar2.findViewById(R.id.writebar_edit);
        WriteBar writeBar3 = aVar.x;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        aVar.A = writeBar3.findViewById(R.id.writebar_emoji);
        aVar.D = view.findViewById(R.id.keyboard_background);
        WriteBar writeBar4 = aVar.x;
        if (writeBar4 == null) {
            writeBar4 = null;
        }
        writeBar4.setDialogId(aVar.g);
        WriteBar writeBar5 = aVar.x;
        if (writeBar5 == null) {
            writeBar5 = null;
        }
        writeBar5.setCanPostDonut(aVar.h);
        WriteBar writeBar6 = aVar.x;
        if (writeBar6 == null) {
            writeBar6 = null;
        }
        ixa ixaVar = aVar.f;
        Channel b2 = ixaVar.b();
        Peer peer = b2 != null ? b2.A : null;
        Channel b3 = ixaVar.b();
        if ((b3 != null ? b3.z : null) != ChannelType.COMMUNITY_CHANNEL) {
            peer = null;
        }
        writeBar6.setGroupId(peer != null ? Long.valueOf(peer.d) : null);
        WriteBar writeBar7 = aVar.x;
        if (writeBar7 == null) {
            writeBar7 = null;
        }
        writeBar7.setDonutPhotos(aVar.j);
        WriteBar writeBar8 = aVar.x;
        if (writeBar8 == null) {
            writeBar8 = null;
        }
        writeBar8.setSource(WriteBar.Source.COMMUNITY_CHANNEL);
        WriteBar writeBar9 = aVar.x;
        if (writeBar9 == null) {
            writeBar9 = null;
        }
        writeBar9.setResultFragment(bVar.a());
        WriteBar writeBar10 = aVar.x;
        if (writeBar10 == null) {
            writeBar10 = null;
        }
        writeBar10.setThemeBinder(aVar.c);
        os9 os9Var = new os9(aVar, 3);
        PhotoEditorComponent photoEditorComponent = aVar.e;
        kua kuaVar = new kua(aVar.k, os9Var, photoEditorComponent.Ab(), aVar.g);
        WriteBar writeBar11 = aVar.x;
        if (writeBar11 == null) {
            writeBar11 = null;
        }
        writeBar11.setAttachUploader(kuaVar);
        WriteBar writeBar12 = aVar.x;
        if (writeBar12 == null) {
            writeBar12 = null;
        }
        writeBar12.b(o25.a().c(), true);
        WriteBar writeBar13 = aVar.x;
        if (writeBar13 == null) {
            writeBar13 = null;
        }
        writeBar13.setOwnerId(o25.a().c());
        WriteBar writeBar14 = aVar.x;
        if (writeBar14 == null) {
            writeBar14 = null;
        }
        g760 k4 = photoEditorComponent.k4();
        com.vk.writebar.c cVar = writeBar14.C;
        cVar.o = k4;
        cVar.p = "messenger";
        if (cVar.h.isInitialized()) {
            cVar.c().setNewEditorScreenFactory(k4);
        }
        WriteBar writeBar15 = aVar.x;
        if (writeBar15 == null) {
            writeBar15 = null;
        }
        f6b f6bVar = new f6b(aVar);
        Activity activity = aVar.o;
        writeBar15.S(activity, f6bVar);
        WriteBar writeBar16 = aVar.x;
        if (writeBar16 == null) {
            writeBar16 = null;
        }
        View findViewById = writeBar16.findViewById(R.id.writebar_record_video);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!findViewById.isLaidOut()) {
            findViewById.addOnLayoutChangeListener(new k6b(findViewById, aVar));
        } else if (bwt0.K(findViewById)) {
            aVar.H.c(findViewById);
        }
        WriteBar writeBar17 = aVar.x;
        if (writeBar17 == null) {
            writeBar17 = null;
        }
        ImageView imageView = (ImageView) writeBar17.findViewById(R.id.writebar_settings);
        int i = 0;
        if (!imageView.isLaidOut()) {
            imageView.addOnLayoutChangeListener(new i6b(imageView, aVar));
        } else if (bwt0.K(imageView)) {
            a6b a6bVar = (a6b) aVar.N.getValue();
            boolean z = aVar.h;
            j6b j6bVar = new j6b(aVar, i);
            q7v0 q7v0Var = a6bVar.a;
            if (!a6bVar.b) {
                q7v0Var.init();
                q7v0Var.c(new x5b(z, a6bVar, imageView, j6bVar));
            }
        }
        RichEditText richEditText = aVar.B;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.setImeOptions(268435456);
        StickersView stickersView = new StickersView(activity, (StickersView.c) null, 6);
        aVar.C = stickersView;
        stickersView.setStickersKeyboardContext(b.c.C1799b.a);
        aVar.n(null, aVar.g);
        StickersView stickersView2 = aVar.C;
        if (stickersView2 == null) {
            stickersView2 = null;
        }
        stickersView2.setStickersKeyboardContext(new b.c.a.C1797b(new UserId(aVar.g)));
        h6b h6bVar = new h6b(aVar);
        StickersView stickersView3 = aVar.C;
        if (stickersView3 == null) {
            stickersView3 = null;
        }
        stickersView3.setListener(h6bVar);
        WriteBar writeBar18 = aVar.x;
        if (writeBar18 == null) {
            writeBar18 = null;
        }
        writeBar18.setAutoSuggestPopupListener(h6bVar);
        WriteBar writeBar19 = aVar.x;
        if (writeBar19 == null) {
            writeBar19 = null;
        }
        writeBar19.setCanPinAttachmentProvider(new c24(0));
        WriteBar writeBar20 = aVar.x;
        if (writeBar20 == null) {
            writeBar20 = null;
        }
        writeBar20.setWriteBarSendListener(new vt5(aVar));
        WriteBar writeBar21 = aVar.x;
        if (writeBar21 == null) {
            writeBar21 = null;
        }
        writeBar21.setWriteBarAttachesListener(new com.vk.channels.impl.channel_screen.send_msg.b(aVar));
        WriteBar writeBar22 = aVar.x;
        if (writeBar22 == null) {
            writeBar22 = null;
        }
        writeBar22.setWriteBarInputListener(new rhh0(aVar));
        WriteBar writeBar23 = aVar.x;
        if (writeBar23 == null) {
            writeBar23 = null;
        }
        writeBar23.setWriteBarReplyMessageListener(new h7(aVar, 7));
        WriteBar writeBar24 = aVar.x;
        if (writeBar24 == null) {
            writeBar24 = null;
        }
        writeBar24.setWriteBarStickersListener(new com.vk.channels.impl.channel_screen.send_msg.c(aVar));
        WriteBar writeBar25 = aVar.x;
        if (writeBar25 == null) {
            writeBar25 = null;
        }
        writeBar25.setWriteBarSettingsListener(new pvn(aVar, false));
        WriteBar writeBar26 = aVar.x;
        if (writeBar26 == null) {
            writeBar26 = null;
        }
        writeBar26.setOnFullscreenListener(new com.vk.channels.impl.channel_screen.send_msg.d(aVar));
        WriteBar writeBar27 = aVar.x;
        if (writeBar27 == null) {
            writeBar27 = null;
        }
        writeBar27.setWriteBarMediaListener(new g6b(aVar));
        int i2 = ify.a;
        ify.a(aVar);
        b bVar2 = aVar.E;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.getClass();
        RichEditText richEditText2 = aVar.B;
        aVar.n.a(richEditText2 != null ? richEditText2 : null);
        aVar.P(aVar.u);
        this.r = view;
        this.s = view.findViewById(R.id.write_area);
        this.o.he(new a());
    }

    public final void R(ChannelMsgSendConfig channelMsgSendConfig, boolean z, izs<? super ChannelMsgSendConfig, s3q0> izsVar) {
        ChannelMsgSendState channelMsgSendState = this.i;
        if (!channelMsgSendState.b || channelMsgSendConfig.l() != null) {
            if (channelMsgSendState.b || !channelMsgSendConfig.o()) {
                izsVar.invoke(channelMsgSendConfig);
                return;
            } else {
                S(channelMsgSendConfig, izsVar);
                return;
            }
        }
        if (!z) {
            S(channelMsgSendConfig, izsVar);
            return;
        }
        Calendar d = pvo0.d();
        d.add(10, 1);
        izsVar.invoke(ChannelMsgSendConfig.a(channelMsgSendConfig, d.getTime(), false, false, false, false, null, null, null, null, false, false, false, false, null, 32766));
    }

    public final void S(ChannelMsgSendConfig channelMsgSendConfig, izs<? super ChannelMsgSendConfig, s3q0> izsVar) {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        if (zdwVar.c() != null) {
            View view = this.s;
            if (view == null) {
                view = null;
            }
            ekc0 ekc0Var = new ekc0(view.getContext(), R.string.vkim_channels_post_settings_delay_send_dialog_title);
            ekc0Var.c = new b1a(channelMsgSendConfig, izsVar, this);
            Calendar d = pvo0.d();
            d.add(10, 1);
            ckc0.c(ekc0Var, d.getTime(), null, null, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        if (yn50Var instanceof bcb.a) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar = this.q;
            bcb.a aVar2 = (bcb.a) yn50Var;
            (aVar != null ? aVar : null).onActivityResult(aVar2.a, aVar2.b, aVar2.c);
            return;
        }
        if (yn50Var instanceof bcb.f) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar3 = this.q;
            if (aVar3 == null) {
                aVar3 = null;
            }
            bcb.f fVar = (bcb.f) yn50Var;
            ChannelMsgSendConfig channelMsgSendConfig = fVar.a;
            aVar3.getClass();
            if (channelMsgSendConfig.B() != aVar3.p.B()) {
                WriteBar writeBar = aVar3.x;
                if (writeBar == null) {
                    writeBar = null;
                }
                boolean B = channelMsgSendConfig.B();
                com.vk.writebar.c cVar = writeBar.C;
                for (Attachment attachment : cVar.d()) {
                    if (attachment instanceof x74) {
                        x74 x74Var = (x74) attachment;
                        x74Var.A9(B);
                        x74Var.i5(B ? "" : null);
                        AttachmentsEditorView c = cVar.c();
                        View findViewWithTag = c.b.findViewWithTag(x74Var);
                        if (findViewWithTag != null) {
                            View findViewById = findViewWithTag.findViewById(R.id.donut);
                            if (findViewById != null) {
                                u1u0.n(x74Var.o1() ? 0 : 8, findViewById);
                            }
                            VKImageView vKImageView = (VKImageView) findViewWithTag.findViewById(R.id.attach_thumb);
                            if (vKImageView != null) {
                                boolean z = x74Var.B1() != null;
                                if (z) {
                                    vKImageView.setPostprocessor(c.A);
                                } else {
                                    vKImageView.setPostprocessor(null);
                                }
                                SpoilerView spoilerView = (SpoilerView) findViewWithTag.findViewById(R.id.spoiler);
                                if (spoilerView != null) {
                                    spoilerView.setVisibility(z ? 0 : 8);
                                }
                                if (x74Var instanceof PendingPhotoAttachment) {
                                    vKImageView.O0(((PendingPhotoAttachment) x74Var).f, ImageScreenSize.VERY_SMALL);
                                }
                                if (x74Var instanceof PhotoAttachment) {
                                    int i = c.q;
                                    ImageSize imageSize = (ImageSize) ixj0.c(((PhotoAttachment) x74Var).l.y.b, i, i);
                                    vKImageView.load(imageSize != null ? imageSize.d.d : null);
                                }
                            }
                        }
                    }
                }
            }
            aVar3.p = channelMsgSendConfig;
            WriteBar writeBar2 = aVar3.x;
            if (writeBar2 == null) {
                writeBar2 = null;
            }
            writeBar2.setDonutPhotos(channelMsgSendConfig.B());
            if (fVar.b) {
                com.vk.channels.impl.channel_screen.send_msg.a aVar4 = this.q;
                com.vk.channels.impl.channel_screen.send_msg.a aVar5 = aVar4 != null ? aVar4 : null;
                aVar5.J(aVar5.p);
            }
            this.p = channelMsgSendConfig;
            return;
        }
        if (yn50Var instanceof bcb.c) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar6 = this.q;
            (aVar6 != null ? aVar6 : null).B(((bcb.c) yn50Var).a);
            return;
        }
        if (yn50Var instanceof bcb.d) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar7 = this.q;
            if (aVar7 == null) {
                aVar7 = null;
            }
            MsgFromChannel msgFromChannel = ((bcb.d) yn50Var).a;
            aVar7.getClass();
            b bVar = aVar7.E;
            if (bVar == null) {
                bVar = null;
            }
            bVar.getClass();
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            if (zdwVar.c() != null) {
                ekc0 ekc0Var = new ekc0(bVar.c.getContext(), R.string.vkim_channels_post_settings_delay_send_dialog_title);
                ekc0Var.c = new na7(6, zbb.this, msgFromChannel);
                ckc0.c(ekc0Var, new Date(msgFromChannel.I.s), null, null, 6);
                return;
            }
            return;
        }
        if (yn50Var instanceof bcb.k) {
            bcb.k kVar = (bcb.k) yn50Var;
            S(kVar.b, new bp7(3, this, kVar.a));
            return;
        }
        if (yn50Var.equals(bcb.l.a)) {
            View view = this.s;
            mhy.d(view != null ? view : null);
            return;
        }
        if (yn50Var.equals(bcb.j.a)) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar8 = this.q;
            (aVar8 != null ? aVar8 : null).f();
            ChannelMsgSendConfig channelMsgSendConfig2 = ChannelMsgSendConfig.c;
            cew.b.getClass();
            this.p = ChannelMsgSendConfig.a(channelMsgSendConfig2, null, false, false, false, false, null, null, null, null, false, cew.i(), false, false, null, 30719);
            return;
        }
        if (yn50Var.equals(bcb.h.a)) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar9 = this.q;
            if (aVar9 == null) {
                aVar9 = null;
            }
            aVar9.onResume();
            com.vk.channels.impl.channel_screen.send_msg.a aVar10 = this.q;
            com.vk.channels.impl.channel_screen.send_msg.a aVar11 = aVar10 != null ? aVar10 : null;
            aVar11.P(aVar11.u);
            gzs<s3q0> gzsVar = this.n;
            if (gzsVar != null) {
                gzsVar.invoke();
                return;
            }
            return;
        }
        if (yn50Var instanceof bcb.e) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar12 = this.q;
            (aVar12 != null ? aVar12 : null).onPause();
            return;
        }
        if (yn50Var instanceof bcb.b) {
            izs<Boolean, s3q0> izsVar = ((bcb.b) yn50Var).a;
            com.vk.channels.impl.channel_screen.send_msg.a aVar13 = this.q;
            izsVar.invoke(Boolean.valueOf((aVar13 != null ? aVar13 : null).a0()));
        } else if (yn50Var instanceof bcb.i) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar14 = this.q;
            (aVar14 != null ? aVar14 : null).b(((bcb.i) yn50Var).a);
        } else if (yn50Var instanceof bcb.g) {
            com.vk.channels.impl.channel_screen.send_msg.a aVar15 = this.q;
            (aVar15 != null ? aVar15 : null).g(((bcb.g) yn50Var).a);
        }
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        ccb ccbVar = (ccb) ao50Var;
        View view = this.s;
        if (view == null) {
            view = null;
        }
        awt0.v(view, ccbVar.a);
        com.vk.channels.impl.channel_screen.send_msg.a aVar = this.q;
        (aVar != null ? aVar : null).K(ccbVar.b);
    }

    /* compiled from: ChannelSendMsgViewController.kt */
    public static final class b implements l6b {
        public final /* synthetic */ View c;

        public b(View view) {
            this.c = view;
        }

        @Override // xsna.fts0
        public final void H0() {
            zbb.this.o.H0();
        }

        @Override // xsna.fts0
        public final void Kb(boolean z) {
            zbb.this.o.Kb(z);
        }

        @Override // xsna.fts0
        public final void U1() {
            zbb.this.o.U1();
        }

        @Override // xsna.oz30
        public final FragmentImpl a() {
            return zbb.this.f;
        }

        @Override // xsna.oz30
        public final void b(int i, String str, MsgTextFormat msgTextFormat, String str2, List list, Integer num, MsgSendSource msgSendSource, Set set, ChannelMsgSendConfig channelMsgSendConfig) {
            ChannelMsgSendConfig channelMsgSendConfig2 = channelMsgSendConfig;
            if (channelMsgSendConfig2 == null) {
                channelMsgSendConfig2 = ChannelMsgSendConfig.c;
            }
            zbb zbbVar = zbb.this;
            zbbVar.R(channelMsgSendConfig2, false, new acb(zbbVar, i, this, str, msgTextFormat, list));
        }

        @Override // xsna.fts0
        public final void b0() {
            zbb.this.o.b0();
        }

        public final void f(ChannelMsgSendConfig channelMsgSendConfig, boolean z, boolean z2) {
            zbb zbbVar = zbb.this;
            long j = zbbVar.g;
            bpn0 bpn0Var = zbbVar.t;
            l7v b = ((e4w) bpn0Var.getValue()).b.b();
            HintId hintId = HintId.STORIES_CHANNEL_POST_AUTOSTORY;
            zbbVar.O(new ybb.h(j, ChannelMsgSendConfig.a(channelMsgSendConfig, null, false, false, false, false, null, null, null, null, false, false, b.a(hintId.getId()), false, null, 28671), z, z2));
            wvw wvwVar = ((e4w) bpn0Var.getValue()).b;
            if (wvwVar.b().a(hintId.getId())) {
                wvwVar.b().b(hintId.getId());
            }
        }

        @Override // xsna.fts0
        public final void he(a aVar) {
            zbb.this.o.he(aVar);
        }

        @Override // xsna.vey
        public final void e(float f) {
        }
    }
}
