package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.PreviewHeadComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;
import ru.yandex.taxi.linked_order.models.data.IconType;
import ru.yandex.taxi.utils.c;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

/* loaded from: classes5.dex */
public final class kny implements nny {
    public final /* synthetic */ LinkedOrderInfoModalView a;

    public kny(LinkedOrderInfoModalView linkedOrderInfoModalView) {
        this.a = linkedOrderInfoModalView;
    }

    public static void h(ListItemComponent listItemComponent, String str, String str2) {
        listItemComponent.setVisibility(str2.length() > 0 ? 0 : 8);
        listItemComponent.setSubtitle(str);
        listItemComponent.setTitle(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a2, code lost:
    
        if (r10.getVisibility() == 0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    @Override // defpackage.nny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J8(dny dnyVar) {
        FrameLayout frameLayout;
        lny binding;
        lny binding2;
        lny binding3;
        lny binding4;
        lny binding5;
        lny binding6;
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        ListItemComponent listItemComponent3;
        PreviewHeadComponent previewHeadComponent;
        PreviewHeadComponent previewHeadComponent2;
        PreviewHeadComponent previewHeadComponent3;
        PreviewHeadComponent previewHeadComponent4;
        v8e0 v8e0Var;
        s9e0 s9e0Var;
        s9e0 s9e0Var2;
        ListItemComponent listItemComponent4;
        ListItemComponent listItemComponent5;
        ListItemComponent listItemComponent6;
        View view;
        ListItemComponent listItemComponent7;
        ListItemComponent listItemComponent8;
        ListItemComponent listItemComponent9;
        ListItemComponent listItemComponent10;
        View view2;
        ListItemComponent listItemComponent11;
        int i;
        View view3;
        ListItemComponent listItemComponent12;
        int i2;
        g58 g58Var;
        f58 f58Var;
        PreviewHeadComponent previewHeadComponent5;
        ListItemComponent listItemComponent13;
        ListItemComponent listItemComponent14;
        lny binding7;
        lny binding8;
        ArrayList arrayList;
        String str;
        g18 g18Var;
        m25 m25Var;
        lny binding9;
        ListItemComponent listItemComponent15;
        String str2;
        String str3;
        t0a0 t0a0Var;
        z0a0 z0a0Var;
        lny binding10;
        ListItemComponent listItemComponent16;
        String str4;
        String str5;
        String str6;
        String str7;
        lny binding11;
        lny binding12;
        lny binding13;
        lny binding14;
        lny binding15;
        lny binding16;
        lny binding17;
        lny binding18;
        lny binding19;
        lny binding20;
        lny binding21;
        lny binding22;
        lny binding23;
        lny binding24;
        lny binding25;
        lny binding26;
        boolean z;
        ListItemComponent listItemComponent17;
        ListItemComponent listItemComponent18;
        ListItemComponent listItemComponent19;
        ListItemComponent listItemComponent20;
        ListItemComponent listItemComponent21;
        LinkedOrderInfoModalView linkedOrderInfoModalView = this.a;
        frameLayout = linkedOrderInfoModalView.buttonWrapper;
        boolean z2 = dnyVar.a;
        String str8 = dnyVar.u;
        boolean z3 = dnyVar.c;
        boolean z4 = dnyVar.b;
        frameLayout.setVisibility(z2 ? 0 : 8);
        binding = linkedOrderInfoModalView.getBinding();
        binding.B.setVisibility(!z2 ? 0 : 8);
        binding2 = linkedOrderInfoModalView.getBinding();
        binding2.f.setVisibility((z4 || z3) ? 0 : 8);
        binding3 = linkedOrderInfoModalView.getBinding();
        binding3.d.setVisibility(z3 ? 0 : 8);
        binding4 = linkedOrderInfoModalView.getBinding();
        binding4.d.setIconBackground(null);
        binding5 = linkedOrderInfoModalView.getBinding();
        binding5.e.setVisibility(z4 ? 0 : 8);
        binding6 = linkedOrderInfoModalView.getBinding();
        IconCircleButton iconCircleButton = binding6.d;
        qi11 qi11Var = dnyVar.G;
        iconCircleButton.setTitle(qi11Var != null ? qi11Var.a : null);
        listItemComponent = linkedOrderInfoModalView.sourceItem;
        listItemComponent.setVisibility(dnyVar.d ? 0 : 8);
        listItemComponent2 = linkedOrderInfoModalView.sourceItem;
        listItemComponent2.setLeadVerticalGravity(1);
        listItemComponent3 = linkedOrderInfoModalView.destinationItem;
        listItemComponent3.setLeadVerticalGravity(1);
        previewHeadComponent = linkedOrderInfoModalView.titleItem;
        previewHeadComponent.setTitle(dnyVar.e);
        previewHeadComponent2 = linkedOrderInfoModalView.titleItem;
        previewHeadComponent2.setTitleColorAttr(xng0.textMain);
        previewHeadComponent3 = linkedOrderInfoModalView.titleItem;
        previewHeadComponent3.setSubtitle(dnyVar.f);
        previewHeadComponent4 = linkedOrderInfoModalView.titleItem;
        previewHeadComponent4.setSubtitleColorAttr(xng0.textMain);
        v8e0Var = linkedOrderInfoModalView.popupDrawableFactory;
        IconType iconType = dnyVar.h;
        v8e0Var.getClass();
        i3y i3yVar = v8e0Var.c;
        int i3 = u8e0.a[iconType.ordinal()];
        if (i3 == 1) {
            s9e0Var = (a87) i3yVar.getValue();
        } else if (i3 == 2) {
            s9e0Var = (qc4) v8e0Var.b.getValue();
        } else {
            if (i3 != 3) {
                w511.b();
                return;
            }
            s9e0Var = (a87) i3yVar.getValue();
        }
        s9e0Var2 = linkedOrderInfoModalView.popupIconProvider;
        if (!jl40.l(s9e0Var, s9e0Var2)) {
            linkedOrderInfoModalView.popupIconProvider = s9e0Var;
            listItemComponent20 = linkedOrderInfoModalView.sourceItem;
            listItemComponent20.setLeadImage(s9e0Var.source());
            listItemComponent21 = linkedOrderInfoModalView.destinationItem;
            listItemComponent21.setLeadImage(s9e0Var.a());
        }
        listItemComponent4 = linkedOrderInfoModalView.sourceItem;
        listItemComponent4.setTitle(dnyVar.o);
        listItemComponent5 = linkedOrderInfoModalView.destinationItem;
        listItemComponent5.setTitle(dnyVar.p);
        listItemComponent6 = linkedOrderInfoModalView.destinationPorch;
        h(listItemComponent6, dnyVar.j, dnyVar.q);
        view = linkedOrderInfoModalView.destinationPorchDivider;
        listItemComponent7 = linkedOrderInfoModalView.destinationPorch;
        view.setVisibility(listItemComponent7.getVisibility() == 0 ? 0 : 8);
        listItemComponent8 = linkedOrderInfoModalView.destinationApartment;
        h(listItemComponent8, dnyVar.k, dnyVar.r);
        listItemComponent9 = linkedOrderInfoModalView.destinationFloor;
        h(listItemComponent9, dnyVar.l, dnyVar.s);
        listItemComponent10 = linkedOrderInfoModalView.destinationDoorCode;
        h(listItemComponent10, dnyVar.m, dnyVar.t);
        view2 = linkedOrderInfoModalView.destinationFloorDivider;
        listItemComponent11 = linkedOrderInfoModalView.destinationFloor;
        if (listItemComponent11.getVisibility() == 0) {
            listItemComponent19 = linkedOrderInfoModalView.destinationApartment;
            if (listItemComponent19.getVisibility() == 0) {
                i = 0;
                view2.setVisibility(i);
                view3 = linkedOrderInfoModalView.destinationDoorCodeDivider;
                listItemComponent12 = linkedOrderInfoModalView.destinationDoorCode;
                if (listItemComponent12.getVisibility() == 0) {
                    listItemComponent17 = linkedOrderInfoModalView.destinationFloor;
                    if (listItemComponent17.getVisibility() != 0) {
                        listItemComponent18 = linkedOrderInfoModalView.destinationApartment;
                    }
                    i2 = 0;
                    view3.setVisibility(i2);
                    String str9 = dnyVar.g;
                    String str10 = dnyVar.D;
                    String str11 = dnyVar.E;
                    p48 p48Var = new p48();
                    p48Var.c = str11;
                    String str12 = p48Var.c;
                    a78 a78Var = p48Var.g;
                    List list = p48Var.h;
                    boolean z5 = p48Var.e;
                    boolean z6 = p48Var.i;
                    g58Var = linkedOrderInfoModalView.carImageAndPlateViewHolderBindInteractor;
                    f58Var = linkedOrderInfoModalView.carImageAndPlateViewHolder;
                    previewHeadComponent5 = linkedOrderInfoModalView.titleItem;
                    ib8 ib8Var = new ib8(2, linkedOrderInfoModalView, str10, str9);
                    g58Var.getClass();
                    avc0 avc0Var = new avc0();
                    avc0Var.b = str12;
                    avc0Var.c = a78Var;
                    avc0Var.d = list;
                    avc0Var.a = z5;
                    avc0Var.e = z6;
                    ((CarIndexContainerView) f58Var.b).bind(new bvc0(avc0Var), ib8Var);
                    previewHeadComponent5.setTrailImportantForAccessibility(2);
                    b.p((CarIndexContainerView) f58Var.b, new bi("", 0));
                    listItemComponent13 = linkedOrderInfoModalView.additionalInfo;
                    listItemComponent13.setVisibility(str8.length() > 0 ? 0 : 8);
                    listItemComponent14 = linkedOrderInfoModalView.additionalInfo;
                    listItemComponent14.setTitle(str8);
                    binding7 = linkedOrderInfoModalView.getBinding();
                    ListItemComponent listItemComponent22 = binding7.u;
                    binding8 = linkedOrderInfoModalView.getBinding();
                    View view4 = binding8.v;
                    arrayList = dnyVar.n;
                    if (arrayList.isEmpty()) {
                        listItemComponent22.setVisibility(8);
                        view4.setVisibility(8);
                    } else {
                        ftv ftvVar = (ftv) arrayList.get(0);
                        listItemComponent22.setVisibility(0);
                        view4.setVisibility(0);
                        listItemComponent22.setTitle(ftvVar.a);
                        listItemComponent22.setSubtitle(ftvVar.b);
                        String str13 = ftvVar.c;
                        str = linkedOrderInfoModalView.lastLoadedInfoItemIconTag;
                        if (!jl40.l(str13, str)) {
                            linkedOrderInfoModalView.lastLoadedInfoItemIconTag = str13;
                            g18Var = linkedOrderInfoModalView.loadInfoItemIconCancellable;
                            g18Var.cancel();
                            m25Var = linkedOrderInfoModalView.baseImageProvider;
                            ClickableImageView leadImageView = listItemComponent22.getLeadImageView();
                            obv obvVar = new obv(str13, null, 6, 0);
                            jny jnyVar = new jny(linkedOrderInfoModalView, 1);
                            qu quVar = new qu(14);
                            nac nacVar = (nac) ((c) m25Var).a.a(leadImageView);
                            nacVar.h = quVar;
                            nacVar.i = jnyVar;
                            linkedOrderInfoModalView.loadInfoItemIconCancellable = nacVar.b(obvVar);
                        }
                    }
                    binding9 = linkedOrderInfoModalView.getBinding();
                    listItemComponent15 = binding9.w;
                    str2 = dnyVar.x;
                    str3 = dnyVar.y;
                    if (str2.length() == 0 || str3.length() != 0) {
                        listItemComponent15.setVisibility(0);
                        listItemComponent15.setTitle(str2);
                        listItemComponent15.setSubtitle(str3);
                        t0a0Var = dnyVar.z;
                        if (t0a0Var != null) {
                            z0a0Var = linkedOrderInfoModalView.paymentImageLoader;
                            ((g1a0) z0a0Var).b(listItemComponent15.getLeadImageView(), t0a0Var);
                        }
                    } else {
                        listItemComponent15.setVisibility(8);
                    }
                    binding10 = linkedOrderInfoModalView.getBinding();
                    listItemComponent16 = binding10.i;
                    str4 = dnyVar.A;
                    str5 = dnyVar.C;
                    str6 = dnyVar.B;
                    if (str4.length() == 0 || str6.length() != 0) {
                        listItemComponent16.setVisibility(0);
                        listItemComponent16.setTitle(str4);
                        listItemComponent16.setSubtitle(str6);
                        str7 = linkedOrderInfoModalView.lastLoadedDetailsIconTag;
                        if (!jl40.l(str5, str7)) {
                            linkedOrderInfoModalView.loadDetailsIcon(listItemComponent16, str5);
                        }
                    } else {
                        listItemComponent16.setVisibility(8);
                    }
                    if (dnyVar.F) {
                        z = linkedOrderInfoModalView.isExpandedFromRender;
                        if (!z && !z2) {
                            Lf();
                            linkedOrderInfoModalView.isExpandedFromRender = true;
                        }
                    }
                    binding11 = linkedOrderInfoModalView.getBinding();
                    if (binding11.u.getVisibility() == 0) {
                        binding26 = linkedOrderInfoModalView.getBinding();
                        binding26.u.setBackgroundResource(f1h0.round_section_bg);
                    }
                    binding12 = linkedOrderInfoModalView.getBinding();
                    if (binding12.f.getVisibility() == 0) {
                        binding25 = linkedOrderInfoModalView.getBinding();
                        binding25.r.setBackgroundResource(f1h0.round_section_bg);
                    } else {
                        binding13 = linkedOrderInfoModalView.getBinding();
                        binding13.r.setBackgroundResource(f1h0.round_section_bg_bottom);
                    }
                    binding14 = linkedOrderInfoModalView.getBinding();
                    if (binding14.w.getVisibility() == 0) {
                        binding22 = linkedOrderInfoModalView.getBinding();
                        binding22.w.setBackgroundResource(f1h0.round_section_bg_top);
                        binding23 = linkedOrderInfoModalView.getBinding();
                        binding23.i.setBackground(null);
                        binding24 = linkedOrderInfoModalView.getBinding();
                        binding24.i.setDividers(DividerPosition.TOP, DividerType.ICON);
                    } else {
                        binding15 = linkedOrderInfoModalView.getBinding();
                        if (binding15.i.getVisibility() == 0) {
                            binding16 = linkedOrderInfoModalView.getBinding();
                            binding16.i.setBackgroundResource(f1h0.round_section_bg_top);
                            binding17 = linkedOrderInfoModalView.getBinding();
                            binding17.i.setDividers(DividerPosition.TOP, DividerType.NONE);
                        }
                    }
                    binding18 = linkedOrderInfoModalView.getBinding();
                    if (binding18.w.getVisibility() != 0) {
                        binding20 = linkedOrderInfoModalView.getBinding();
                        if (binding20.i.getVisibility() != 0) {
                            binding21 = linkedOrderInfoModalView.getBinding();
                            binding21.b.setDividers(DividerPosition.TOP, DividerType.NONE);
                            if (z2) {
                                return;
                            }
                            linkedOrderInfoModalView.setCardMode(SlideableModalView.CardMode.FIXED_CARD);
                            linkedOrderInfoModalView.expand();
                            return;
                        }
                    }
                    binding19 = linkedOrderInfoModalView.getBinding();
                    binding19.b.setDividers(DividerPosition.TOP, DividerType.NORMAL);
                    if (z2) {
                    }
                }
                i2 = 8;
                view3.setVisibility(i2);
                String str92 = dnyVar.g;
                String str102 = dnyVar.D;
                String str112 = dnyVar.E;
                p48 p48Var2 = new p48();
                p48Var2.c = str112;
                String str122 = p48Var2.c;
                a78 a78Var2 = p48Var2.g;
                List list2 = p48Var2.h;
                boolean z52 = p48Var2.e;
                boolean z62 = p48Var2.i;
                g58Var = linkedOrderInfoModalView.carImageAndPlateViewHolderBindInteractor;
                f58Var = linkedOrderInfoModalView.carImageAndPlateViewHolder;
                previewHeadComponent5 = linkedOrderInfoModalView.titleItem;
                ib8 ib8Var2 = new ib8(2, linkedOrderInfoModalView, str102, str92);
                g58Var.getClass();
                avc0 avc0Var2 = new avc0();
                avc0Var2.b = str122;
                avc0Var2.c = a78Var2;
                avc0Var2.d = list2;
                avc0Var2.a = z52;
                avc0Var2.e = z62;
                ((CarIndexContainerView) f58Var.b).bind(new bvc0(avc0Var2), ib8Var2);
                previewHeadComponent5.setTrailImportantForAccessibility(2);
                b.p((CarIndexContainerView) f58Var.b, new bi("", 0));
                listItemComponent13 = linkedOrderInfoModalView.additionalInfo;
                listItemComponent13.setVisibility(str8.length() > 0 ? 0 : 8);
                listItemComponent14 = linkedOrderInfoModalView.additionalInfo;
                listItemComponent14.setTitle(str8);
                binding7 = linkedOrderInfoModalView.getBinding();
                ListItemComponent listItemComponent222 = binding7.u;
                binding8 = linkedOrderInfoModalView.getBinding();
                View view42 = binding8.v;
                arrayList = dnyVar.n;
                if (arrayList.isEmpty()) {
                }
                binding9 = linkedOrderInfoModalView.getBinding();
                listItemComponent15 = binding9.w;
                str2 = dnyVar.x;
                str3 = dnyVar.y;
                if (str2.length() == 0) {
                }
                listItemComponent15.setVisibility(0);
                listItemComponent15.setTitle(str2);
                listItemComponent15.setSubtitle(str3);
                t0a0Var = dnyVar.z;
                if (t0a0Var != null) {
                }
                binding10 = linkedOrderInfoModalView.getBinding();
                listItemComponent16 = binding10.i;
                str4 = dnyVar.A;
                str5 = dnyVar.C;
                str6 = dnyVar.B;
                if (str4.length() == 0) {
                }
                listItemComponent16.setVisibility(0);
                listItemComponent16.setTitle(str4);
                listItemComponent16.setSubtitle(str6);
                str7 = linkedOrderInfoModalView.lastLoadedDetailsIconTag;
                if (!jl40.l(str5, str7)) {
                }
                if (dnyVar.F) {
                }
                binding11 = linkedOrderInfoModalView.getBinding();
                if (binding11.u.getVisibility() == 0) {
                }
                binding12 = linkedOrderInfoModalView.getBinding();
                if (binding12.f.getVisibility() == 0) {
                }
                binding14 = linkedOrderInfoModalView.getBinding();
                if (binding14.w.getVisibility() == 0) {
                }
                binding18 = linkedOrderInfoModalView.getBinding();
                if (binding18.w.getVisibility() != 0) {
                }
                binding19 = linkedOrderInfoModalView.getBinding();
                binding19.b.setDividers(DividerPosition.TOP, DividerType.NORMAL);
                if (z2) {
                }
            }
        }
        i = 8;
        view2.setVisibility(i);
        view3 = linkedOrderInfoModalView.destinationDoorCodeDivider;
        listItemComponent12 = linkedOrderInfoModalView.destinationDoorCode;
        if (listItemComponent12.getVisibility() == 0) {
        }
        i2 = 8;
        view3.setVisibility(i2);
        String str922 = dnyVar.g;
        String str1022 = dnyVar.D;
        String str1122 = dnyVar.E;
        p48 p48Var22 = new p48();
        p48Var22.c = str1122;
        String str1222 = p48Var22.c;
        a78 a78Var22 = p48Var22.g;
        List list22 = p48Var22.h;
        boolean z522 = p48Var22.e;
        boolean z622 = p48Var22.i;
        g58Var = linkedOrderInfoModalView.carImageAndPlateViewHolderBindInteractor;
        f58Var = linkedOrderInfoModalView.carImageAndPlateViewHolder;
        previewHeadComponent5 = linkedOrderInfoModalView.titleItem;
        ib8 ib8Var22 = new ib8(2, linkedOrderInfoModalView, str1022, str922);
        g58Var.getClass();
        avc0 avc0Var22 = new avc0();
        avc0Var22.b = str1222;
        avc0Var22.c = a78Var22;
        avc0Var22.d = list22;
        avc0Var22.a = z522;
        avc0Var22.e = z622;
        ((CarIndexContainerView) f58Var.b).bind(new bvc0(avc0Var22), ib8Var22);
        previewHeadComponent5.setTrailImportantForAccessibility(2);
        b.p((CarIndexContainerView) f58Var.b, new bi("", 0));
        listItemComponent13 = linkedOrderInfoModalView.additionalInfo;
        listItemComponent13.setVisibility(str8.length() > 0 ? 0 : 8);
        listItemComponent14 = linkedOrderInfoModalView.additionalInfo;
        listItemComponent14.setTitle(str8);
        binding7 = linkedOrderInfoModalView.getBinding();
        ListItemComponent listItemComponent2222 = binding7.u;
        binding8 = linkedOrderInfoModalView.getBinding();
        View view422 = binding8.v;
        arrayList = dnyVar.n;
        if (arrayList.isEmpty()) {
        }
        binding9 = linkedOrderInfoModalView.getBinding();
        listItemComponent15 = binding9.w;
        str2 = dnyVar.x;
        str3 = dnyVar.y;
        if (str2.length() == 0) {
        }
        listItemComponent15.setVisibility(0);
        listItemComponent15.setTitle(str2);
        listItemComponent15.setSubtitle(str3);
        t0a0Var = dnyVar.z;
        if (t0a0Var != null) {
        }
        binding10 = linkedOrderInfoModalView.getBinding();
        listItemComponent16 = binding10.i;
        str4 = dnyVar.A;
        str5 = dnyVar.C;
        str6 = dnyVar.B;
        if (str4.length() == 0) {
        }
        listItemComponent16.setVisibility(0);
        listItemComponent16.setTitle(str4);
        listItemComponent16.setSubtitle(str6);
        str7 = linkedOrderInfoModalView.lastLoadedDetailsIconTag;
        if (!jl40.l(str5, str7)) {
        }
        if (dnyVar.F) {
        }
        binding11 = linkedOrderInfoModalView.getBinding();
        if (binding11.u.getVisibility() == 0) {
        }
        binding12 = linkedOrderInfoModalView.getBinding();
        if (binding12.f.getVisibility() == 0) {
        }
        binding14 = linkedOrderInfoModalView.getBinding();
        if (binding14.w.getVisibility() == 0) {
        }
        binding18 = linkedOrderInfoModalView.getBinding();
        if (binding18.w.getVisibility() != 0) {
        }
        binding19 = linkedOrderInfoModalView.getBinding();
        binding19.b.setDividers(DividerPosition.TOP, DividerType.NORMAL);
        if (z2) {
        }
    }

    @Override // defpackage.nny
    public final void Lf() {
        int behaviourState;
        ony onyVar;
        LinkedOrderInfoModalView linkedOrderInfoModalView = this.a;
        behaviourState = linkedOrderInfoModalView.behaviourState();
        if (behaviourState == 6) {
            onyVar = linkedOrderInfoModalView.presenter;
            onyVar.B.w(onyVar.F, "automatic");
            linkedOrderInfoModalView.expand();
        }
    }

    @Override // defpackage.nny
    public final void jc(boolean z) {
        FloatButtonIconComponent floatButtonIconComponent;
        floatButtonIconComponent = this.a.returnToRouteButton;
        floatButtonIconComponent.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.nny
    public final void td(boolean z) {
        Consumer consumer;
        g18 g18Var;
        g18 g18Var2;
        g18 g18Var3;
        LinkedOrderInfoModalView linkedOrderInfoModalView = this.a;
        consumer = linkedOrderInfoModalView.closeCallback;
        consumer.accept(Boolean.valueOf(z));
        g18Var = linkedOrderInfoModalView.loadIconCancelable;
        g18Var.cancel();
        linkedOrderInfoModalView.lastLoadedIconTag = "";
        linkedOrderInfoModalView.lastLoadedDetailsIconTag = "";
        g18Var2 = linkedOrderInfoModalView.loadDetailsIconCancelable;
        g18Var2.cancel();
        linkedOrderInfoModalView.lastLoadedInfoItemIconTag = "";
        g18Var3 = linkedOrderInfoModalView.loadInfoItemIconCancellable;
        g18Var3.cancel();
        linkedOrderInfoModalView.dismiss();
    }

    @Override // defpackage.nny
    public final void updateBadgeText(String str) {
        FloatButtonIconComponent floatButtonIconComponent;
        floatButtonIconComponent = this.a.backButton;
        floatButtonIconComponent.setBadgeText(str);
    }
}
