package com.yandex.go.taxi.order.rate;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.api.titles.OrderTitles$Alignment;
import com.yandex.go.taxi.order.communications.FramedRecyclerView;
import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import com.yandex.go.taxi.order.communications.g;
import com.yandex.go.taxi.order.details.v1.elements.upsell.UpsellView;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardHorizontalButtons;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;
import com.yandex.go.taxi.order.details.v1.ui.SectionDetailView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.quality_question.ui.QualityQuestionButton;
import com.yandex.go.taxi.order.state.OrderStateView;
import com.yandex.go.taxi.order.view.driver.DriverCircleButton;
import defpackage.ad11;
import defpackage.agc0;
import defpackage.avj0;
import defpackage.b8j;
import defpackage.b980;
import defpackage.c0g;
import defpackage.c5j;
import defpackage.c8j;
import defpackage.ci70;
import defpackage.d0g;
import defpackage.d49;
import defpackage.d5b0;
import defpackage.d8j;
import defpackage.d980;
import defpackage.dgb;
import defpackage.dm21;
import defpackage.evu0;
import defpackage.f0g;
import defpackage.f1h0;
import defpackage.f6j;
import defpackage.fpf0;
import defpackage.fx00;
import defpackage.fxx0;
import defpackage.g1a0;
import defpackage.g7i0;
import defpackage.gci0;
import defpackage.gk1;
import defpackage.hg;
import defpackage.htc;
import defpackage.ibk0;
import defpackage.ip11;
import defpackage.iqz;
import defpackage.ix70;
import defpackage.jqr;
import defpackage.jqz;
import defpackage.jtc;
import defpackage.k48;
import defpackage.k7x0;
import defpackage.kdd0;
import defpackage.kpf0;
import defpackage.kz8;
import defpackage.l0g;
import defpackage.l8x;
import defpackage.lg21;
import defpackage.lgg0;
import defpackage.m48;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.mg;
import defpackage.mg21;
import defpackage.mqk0;
import defpackage.mrg0;
import defpackage.mx60;
import defpackage.n0g;
import defpackage.n470;
import defpackage.n4h0;
import defpackage.nac;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.o0q0;
import defpackage.o2y0;
import defpackage.ogg0;
import defpackage.oqk0;
import defpackage.p4j;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pwf0;
import defpackage.pze0;
import defpackage.q48;
import defpackage.q5z;
import defpackage.qc;
import defpackage.qim;
import defpackage.qje;
import defpackage.qn70;
import defpackage.qyy0;
import defpackage.r6j;
import defpackage.rim;
import defpackage.rp31;
import defpackage.s7i0;
import defpackage.sjh;
import defpackage.t0a0;
import defpackage.t0q0;
import defpackage.t2g;
import defpackage.t48;
import defpackage.t6j;
import defpackage.t7i0;
import defpackage.tje;
import defpackage.to31;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u4j;
import defpackage.u7i0;
import defpackage.usg0;
import defpackage.uyj;
import defpackage.v4j;
import defpackage.v6j;
import defpackage.v7i0;
import defpackage.v7s;
import defpackage.vim;
import defpackage.vng;
import defpackage.vtq;
import defpackage.w4j;
import defpackage.w511;
import defpackage.web1;
import defpackage.wug0;
import defpackage.wze0;
import defpackage.x4e;
import defpackage.x4j;
import defpackage.xhm;
import defpackage.xim;
import defpackage.xkw0;
import defpackage.xmf0;
import defpackage.xng0;
import defpackage.xpb1;
import defpackage.xvy0;
import defpackage.xw31;
import defpackage.y180;
import defpackage.yc11;
import defpackage.yh70;
import defpackage.ysg;
import defpackage.yvf0;
import defpackage.z0a0;
import defpackage.zkh0;
import defpackage.zuj0;
import defpackage.zxf0;
import defpackage.zy11;
import defpackage.zzf;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.combo.ui.TravelCompanionDetailView;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.costcenters.ride.OpenCostCenterListItem;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.order.view.CostDetailsView;
import ru.yandex.taxi.order.view.FeedbackView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000ª\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0019J\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010*\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010*\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u000e2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u00108J%\u0010G\u001a\u00020\u000e2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010F\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u000eH\u0016¢\u0006\u0004\bI\u0010\u0019J\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u000eH\u0016¢\u0006\u0004\bW\u0010\u0019J\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u0011H\u0016¢\u0006\u0004\bY\u00108J\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u0011H\u0016¢\u0006\u0004\b[\u00108J\u0019\u0010]\u001a\u00020\u000e2\b\u0010\\\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b]\u0010#J\r\u0010^\u001a\u00020\u000e¢\u0006\u0004\b^\u0010\u0019J\u0017\u0010a\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u000eH\u0016¢\u0006\u0004\bc\u0010\u0019J\u0017\u0010e\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020dH\u0016¢\u0006\u0004\be\u0010fJ%\u0010k\u001a\u00020\u000e2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0C2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bk\u0010lJ%\u0010m\u001a\u00020\u000e2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0C2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bm\u0010lJ\u0017\u0010o\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020nH\u0016¢\u0006\u0004\bo\u0010pJ\r\u0010r\u001a\u00020q¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u000e2\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ\u0015\u0010z\u001a\u00020\u000e2\u0006\u0010y\u001a\u00020x¢\u0006\u0004\bz\u0010{J\u001d\u0010~\u001a\u00020\u000e2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020|0CH\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u0019J \u0010\u0082\u0001\u001a\u00020\u000e2\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020D0CH\u0002¢\u0006\u0005\b\u0082\u0001\u0010\u007fJ \u0010\u0083\u0001\u001a\u00020\u000e2\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020D0CH\u0002¢\u0006\u0005\b\u0083\u0001\u0010\u007fJ\u001b\u0010\u0085\u0001\u001a\u00020\u000e2\u0007\u0010\u0084\u0001\u001a\u00020DH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0019J2\u0010\u008b\u0001\u001a\u00020\u000e2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u0088\u0001H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J2\u0010\u008d\u0001\u001a\u00020\u000e2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u0088\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001J2\u0010\u008e\u0001\u001a\u00020\u000e2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u0088\u0001H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008c\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0019J\u001c\u0010\u0092\u0001\u001a\u00020\u000e2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001R*\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R1\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u0012\u0005\b¢\u0001\u0010\u0019\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010¤\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R*\u0010«\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010²\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010¹\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R*\u0010À\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Ç\u0001\u001a\u00030Æ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Î\u0001\u001a\u00030Í\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R1\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010Ô\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R*\u0010Ý\u0001\u001a\u00030Ü\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R*\u0010ä\u0001\u001a\u00030ã\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R\u0018\u0010ë\u0001\u001a\u00030ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0018\u0010î\u0001\u001a\u00030í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0018\u0010ð\u0001\u001a\u00030í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ï\u0001R\u0017\u0010ñ\u0001\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0018\u0010ô\u0001\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u0018\u0010ö\u0001\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0001\u0010õ\u0001R\u0018\u0010÷\u0001\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b÷\u0001\u0010õ\u0001R\u0018\u0010\u0081\u0001\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010ù\u0001R\u0018\u0010ú\u0001\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0001\u0010ù\u0001R\u0018\u0010ü\u0001\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0018\u0010þ\u0001\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ý\u0001R\u0018\u0010\u0080\u0002\u001a\u00030ÿ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0018\u0010\u0083\u0002\u001a\u00030\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0018\u0010\u0086\u0002\u001a\u00030\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0018\u0010\u0089\u0002\u001a\u00030\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0018\u0010\u008b\u0002\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010ù\u0001R\u0018\u0010\u008d\u0002\u001a\u00030\u008c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008e\u0002R\u0018\u0010\u0090\u0002\u001a\u00030\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0018\u0010\u0093\u0002\u001a\u00030\u0092\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0018\u0010\u0095\u0002\u001a\u00030\u0092\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0094\u0002R\u0018\u0010\u0097\u0002\u001a\u00030\u0096\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0099\u0002R\u0018\u0010\u009a\u0002\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010ù\u0001R\u0018\u0010\u009b\u0002\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0002\u0010õ\u0001R\u0018\u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0018\u0010 \u0002\u001a\u00030\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0018\u0010£\u0002\u001a\u00030¢\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R\u0018\u0010¥\u0002\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010ý\u0001R\u0018\u0010§\u0002\u001a\u00030¦\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R\u0018\u0010ª\u0002\u001a\u00030©\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0002\u0010«\u0002R\u0018\u0010\u00ad\u0002\u001a\u00030¬\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R\u0018\u0010¯\u0002\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010ý\u0001R\u0017\u0010°\u0002\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0002\u0010ò\u0001R\u0018\u0010±\u0002\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010ý\u0001R\u0017\u0010²\u0002\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0002\u0010ò\u0001R\u0017\u0010³\u0002\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0002\u0010ò\u0001R\u0017\u0010´\u0002\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0002\u0010ò\u0001R\u0017\u0010µ\u0002\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010ò\u0001R\u001b\u0010¶\u0002\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010ò\u0001R\u0018\u0010·\u0002\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0002\u0010¸\u0002R\u0018\u0010º\u0002\u001a\u00030¹\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u0018\u0010½\u0002\u001a\u00030¼\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010¾\u0002R\u001a\u0010À\u0002\u001a\u00030¿\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u001a\u0010Â\u0002\u001a\u00030¿\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010Á\u0002R\u001c\u0010Ä\u0002\u001a\u0005\u0018\u00010Ã\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002¨\u0006Æ\u0002"}, d2 = {"Lcom/yandex/go/taxi/order/rate/RateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lg7i0;", "Logg0;", "Lyc11;", "Lnwy0;", "Landroid/content/Context;", "context", "Lfxx0;", "component", "<init>", "(Landroid/content/Context;Lfxx0;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "Lg7i0$a;", "callback", "resume", "(Lg7i0$a;)V", "pause", "()V", "Lru/yandex/taxi/order/view/FeedbackView;", "feedbackView", "()Lru/yandex/taxi/order/view/FeedbackView;", "onAttachedToWindow", "onDetachedFromWindow", "closeView", "", "title", "showSafetyCenter", "(Ljava/lang/String;)V", "hideSafetyCenter", "Lxkw0;", "uiState", "showSupportChatButton", "(Lxkw0;)V", "Loqk0;", ClidProvider.STATE, "renderRideSupportState", "(Loqk0;)V", "Lv6j;", "renderPaymentState", "(Lv6j;)V", "Lc5j;", "renderCompleteButton", "(Lc5j;)V", "Lxim;", "renderDriverPhoneButton", "(Lxim;)V", "isEnabled", "setFeedbackSectionBottomPadding", "(Z)V", "Lb980;", "orderTitles", "setTitles", "(Lb980;)V", "Ln470;", "viewModel", "setCostCenterState", "(Ln470;)V", "showNavigationIcon", "showSubtitleNavigationIcon", "", "Lv7s;", "priceDetails", "isNewScreenEnabled", "showPriceDetails", "(Ljava/util/List;Z)V", "hidePriceDetails", "Lcom/yandex/go/taxi/order/api/titles/OrderTitles$Alignment;", "alignment", "setTitlesAlignment", "(Lcom/yandex/go/taxi/order/api/titles/OrderTitles$Alignment;)V", "Lf6j;", "renderDriverSection", "(Lf6j;)V", "Lt0q0;", "renderSectionDetail", "(Lt0q0;)V", "Lx4j;", "renderButtonsState", "(Lx4j;)V", "reportButtonsVisibility", "classic", "switchTitlesContainer", "isClickable", "setSubtitleIsClickable", Constants.KEY_MESSAGE, "showPriceMessage", "resetScroll", "Llgg0;", "model", "showQualityQuestionButton", "(Llgg0;)V", "hideQualityQuestionButton", "Lt6j;", "renderInfoState", "(Lt6j;)V", "Lkpf0;", "plaques", "Lo2y0;", "orderHolder", "renderPromoPlaquesTopSection", "(Ljava/util/List;Lo2y0;)V", "renderPromoPlaquesBottomSection", "Ld8j;", "renderUpsell", "(Ld8j;)V", "Landroid/view/View;", "getTitlesContainer", "()Landroid/view/View;", "Lqim;", "driver", "showDriver", "(Lqim;)V", "Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;", "mode", "handleOrderViewMode", "(Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;)V", "Lad11;", "travelCompanions", "renderCompanionCard", "(Ljava/util/List;)V", "setAccessibilityHelpers", "details", "fillNewCostDetails", "fillCostDetails", "detail", "addNewListItemComponent", "(Lv7s;)V", "updateHeaderDividersVisibility", "", "visibleButtons", "invisibleButtons", "appendDriverSectionVisibility", "(Ljava/util/List;Ljava/util/List;)V", "appendHorizontalButtonsVisibility", "appendCircleButtonsVisibility", "invalidateDetailsContainer", "", "scrollY", "onScrollChanged", "(I)V", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "Ltse;", "coroutineScope", "Ltse;", "getCoroutineScope", "()Ltse;", "setCoroutineScope", "(Ltse;)V", "getCoroutineScope$annotations", "Lcom/yandex/go/taxi/order/rate/c;", "presenter", "Lcom/yandex/go/taxi/order/rate/c;", "getPresenter", "()Lcom/yandex/go/taxi/order/rate/c;", "setPresenter", "(Lcom/yandex/go/taxi/order/rate/c;)V", "Lqn70;", "orderCardStateRepository", "Lqn70;", "getOrderCardStateRepository", "()Lqn70;", "setOrderCardStateRepository", "(Lqn70;)V", "Lz0a0;", "paymentIconLoader", "Lz0a0;", "getPaymentIconLoader", "()Lz0a0;", "setPaymentIconLoader", "(Lz0a0;)V", "Lpav;", "imageLoader", "Lpav;", "getImageLoader", "()Lpav;", "setImageLoader", "(Lpav;)V", "Lk7x0;", "tagUrlFormatter", "Lk7x0;", "getTagUrlFormatter", "()Lk7x0;", "setTagUrlFormatter", "(Lk7x0;)V", "Lru/yandex/taxi/combo/ui/a;", "travelCompanionDetailPresenter", "Lru/yandex/taxi/combo/ui/a;", "getTravelCompanionDetailPresenter", "()Lru/yandex/taxi/combo/ui/a;", "setTravelCompanionDetailPresenter", "(Lru/yandex/taxi/combo/ui/a;)V", "Lip11;", "typefaceDelegate", "Lip11;", "getTypefaceDelegate", "()Lip11;", "setTypefaceDelegate", "(Lip11;)V", "Lyvf0;", "Lru/yandex/taxi/combo/ui/TravelCompanionStatusView;", "travelCompanionStatusViewProvider", "Lyvf0;", "getTravelCompanionStatusViewProvider", "()Lyvf0;", "setTravelCompanionStatusViewProvider", "(Lyvf0;)V", "Lhtc;", "communicationsAdapterFactory", "Lhtc;", "getCommunicationsAdapterFactory", "()Lhtc;", "setCommunicationsAdapterFactory", "(Lhtc;)V", "Lcom/yandex/go/taxi/order/view/driver/DriverCircleButton;", "driverCircleButton", "Lcom/yandex/go/taxi/order/view/driver/DriverCircleButton;", "getDriverCircleButton", "()Lcom/yandex/go/taxi/order/view/driver/DriverCircleButton;", "setDriverCircleButton", "(Lcom/yandex/go/taxi/order/view/driver/DriverCircleButton;)V", "Lcom/yandex/go/taxi/order/details/v1/elements/upsell/UpsellView;", "upsell", "Lcom/yandex/go/taxi/order/details/v1/elements/upsell/UpsellView;", "Lru/yandex/taxi/widget/RobotoTextView;", "titleView", "Lru/yandex/taxi/widget/RobotoTextView;", "subtitleView", "subtitleNavigationIcon", "Landroid/view/View;", "Landroid/widget/LinearLayout;", "titlesContainer", "Landroid/widget/LinearLayout;", "subtitleContainer", "detailsContainer", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardListItem;", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardListItem;", "rideSupport", "Landroid/view/ViewGroup;", "costDetailsLayout", "Landroid/view/ViewGroup;", "newCostDetailsLayout", "Landroid/widget/TextView;", "messageView", "Landroid/widget/TextView;", "Lcom/yandex/go/taxi/order/communications/FramedRecyclerView;", "promoPlaqueTopSection", "Lcom/yandex/go/taxi/order/communications/FramedRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "promoPlaqueBottomSection", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/yandex/go/taxi/order/quality_question/ui/QualityQuestionButton;", "qualityQuestionButton", "Lcom/yandex/go/taxi/order/quality_question/ui/QualityQuestionButton;", "paymentMethod", "Lru/yandex/taxi/costcenters/ride/OpenCostCenterListItem;", "costCenter", "Lru/yandex/taxi/costcenters/ride/OpenCostCenterListItem;", "Landroid/view/ViewStub;", "driverStub", "Landroid/view/ViewStub;", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "safetyCenterButton", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "supportCircleButton", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "Lru/yandex/taxi/order/view/FeedbackView;", "driverPhoneComponent", "feedbackSection", "Lcom/yandex/go/taxi/order/details/v1/ui/DriverSectionView;", "driverSectionView", "Lcom/yandex/go/taxi/order/details/v1/ui/DriverSectionView;", "Lcom/yandex/go/taxi/order/details/v1/ui/SectionDetailView;", "sectionDetailView", "Lcom/yandex/go/taxi/order/details/v1/ui/SectionDetailView;", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardHorizontalButtons;", "horizontalButtons", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardHorizontalButtons;", "topButtons", "Lru/yandex/taxi/design/ButtonComponent;", "doneButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/combo/ui/TravelCompanionDetailView;", "travelCompanionDetailView", "Lru/yandex/taxi/combo/ui/TravelCompanionDetailView;", "Lru/yandex/taxi/design/AutoDividerComponentList;", "autoDividerComponentList", "Lru/yandex/taxi/design/AutoDividerComponentList;", "cardContainer", "bottomSheetCard", "doneButtonContainer", "topDivider", "subtitleGroup", "accessibilityScrollDownHelper", "accessibilityScrollUpHelper", "lastFocusedView", "orderScreensCardElevation", CA20Status.STATUS_USER_I, "Landroid/view/View$OnScrollChangeListener;", "onScrollChangedListener", "Landroid/view/View$OnScrollChangeListener;", "Lmx60;", "onBackPressedCallback", "Lmx60;", "Lcom/yandex/go/taxi/order/communications/g;", "promoPlaqueTopAdapter", "Lcom/yandex/go/taxi/order/communications/g;", "promoPlaqueBottomAdapter", "Ll8x;", "orderCardStateJob", "Ll8x;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RateView extends ConstraintLayout implements g7i0, ogg0, yc11, nwy0 {
    public static final int $stable = 8;
    private final View accessibilityScrollDownHelper;
    private final View accessibilityScrollUpHelper;
    public Activity activity;
    private final AutoDividerComponentList autoDividerComponentList;
    private final View bottomSheetCard;
    private final ViewGroup cardContainer;
    public htc communicationsAdapterFactory;
    public tse coroutineScope;
    private final OpenCostCenterListItem costCenter;
    private final ViewGroup costDetailsLayout;
    private final DetailsCardListItem details;
    private final LinearLayout detailsContainer;
    private final ButtonComponent doneButton;
    private final ViewGroup doneButtonContainer;
    public DriverCircleButton driverCircleButton;
    private final DetailsCardListItem driverPhoneComponent;
    private final DriverSectionView driverSectionView;
    private final ViewStub driverStub;
    private final LinearLayout feedbackSection;
    private final FeedbackView feedbackView;
    private final DetailsCardHorizontalButtons horizontalButtons;
    public pav imageLoader;
    private View lastFocusedView;
    private final TextView messageView;
    private final ViewGroup newCostDetailsLayout;
    private final mx60 onBackPressedCallback;
    private final View.OnScrollChangeListener onScrollChangedListener;
    private l8x orderCardStateJob;
    public qn70 orderCardStateRepository;
    private final int orderScreensCardElevation;
    public z0a0 paymentIconLoader;
    private final DetailsCardListItem paymentMethod;
    public c presenter;
    private g promoPlaqueBottomAdapter;
    private final RecyclerView promoPlaqueBottomSection;
    private g promoPlaqueTopAdapter;
    private final FramedRecyclerView promoPlaqueTopSection;
    private final QualityQuestionButton qualityQuestionButton;
    private final DetailsCardListItem rideSupport;
    private final IconCircleButton safetyCenterButton;
    private final NestedScrollView scrollView;
    private final SectionDetailView sectionDetailView;
    private final LinearLayout subtitleContainer;
    private final View subtitleGroup;
    private final View subtitleNavigationIcon;
    private final RobotoTextView subtitleView;
    private final IconCircleButton supportCircleButton;
    public k7x0 tagUrlFormatter;
    private final RobotoTextView titleView;
    private final LinearLayout titlesContainer;
    private final ViewGroup topButtons;
    private final View topDivider;
    public ru.yandex.taxi.combo.ui.a travelCompanionDetailPresenter;
    private final TravelCompanionDetailView travelCompanionDetailView;
    public yvf0 travelCompanionStatusViewProvider;
    public ip11 typefaceDelegate;
    private final UpsellView upsell;

    public RateView(Context context, fxx0 fxx0Var) {
        super(context);
        this.orderScreensCardElevation = tje.r(wug0.order_screens_card_elevation, getContext());
        this.onScrollChangedListener = new gk1(6, this);
        this.onBackPressedCallback = new qc(17, this);
        ru.yandex.taxi.design.utils.c.q(this, zkh0.rate_view, true);
        n0g n0gVar = (n0g) fxx0Var;
        c0g c0gVar = n0gVar.c;
        this.activity = c0gVar.w;
        this.coroutineScope = (tse) c0gVar.B.get();
        l0g l0gVar = n0gVar.f;
        ix70 ix70Var = l0gVar.a;
        o2y0 o2y0Var = ix70Var.a;
        q5z.i(o2y0Var);
        zzf zzfVar = n0gVar.b;
        wze0 wze0Var = (wze0) zzfVar.E4.get();
        ci70 ci70Var = (ci70) zzfVar.Ma.get();
        dm21 dm21Var = (dm21) zzfVar.D7.get();
        vtq vtqVar = (vtq) zzfVar.yr.get();
        y180 y180Var = (y180) zzfVar.K4.get();
        tt2 tt2Var = (tt2) zzfVar.n.get();
        ysg ysgVar = (ysg) zzfVar.I2.get();
        f0g f0gVar = n0gVar.e;
        xhm N = f0gVar.N();
        ru.yandex.taxi.apprate.common.domain.a L = f0gVar.L();
        d980 d980Var = (d980) n0gVar.x.get();
        t48 C1 = c0gVar.C1();
        zuj0 zuj0Var = (zuj0) zzfVar.W.get();
        ru.yandex.taxi.widget.c cVar = (ru.yandex.taxi.widget.c) zzfVar.Ze.get();
        d49 d49Var = (d49) c0gVar.Iu.get();
        lg21 lg21Var = (lg21) zzfVar.u5.get();
        ru.yandex.taxi.costcenters.ride.c cVar2 = (ru.yandex.taxi.costcenters.ride.c) zzfVar.mr.get();
        o2y0 o2y0Var2 = ix70Var.a;
        q5z.i(o2y0Var2);
        kdd0 kdd0Var = new kdd0(o2y0Var2, (dm21) zzfVar.D7.get(), f0gVar.Z(), (vtq) zzfVar.yr.get());
        d0g d0gVar = c0gVar.a;
        iqz w = xpb1.w((t2g) d0gVar.b.bm.get());
        q5z.i(w);
        this.presenter = new c(o2y0Var, wze0Var, ci70Var, dm21Var, vtqVar, y180Var, tt2Var, ysgVar, N, L, d980Var, C1, zuj0Var, cVar, d49Var, lg21Var, cVar2, kdd0Var, w, n0gVar.d(), (k48) d0gVar.C5.get(), f0gVar.s1(), (p4j) n0gVar.h.get(), n0gVar.a(), f0gVar.t1(), n0gVar.h(), d0gVar.S(), (ysg) zzfVar.I2.get());
        this.orderCardStateRepository = (qn70) l0gVar.m.get();
        this.paymentIconLoader = (z0a0) zzfVar.fi.get();
        this.imageLoader = (pav) zzfVar.p3.get();
        this.tagUrlFormatter = (k7x0) zzfVar.M3.get();
        this.travelCompanionDetailPresenter = n0gVar.g();
        this.typefaceDelegate = (ip11) zzfVar.uf.get();
        this.travelCompanionStatusViewProvider = n0gVar.v;
        this.communicationsAdapterFactory = (htc) f0gVar.R5.a;
        this.driverCircleButton = new DriverCircleButton((Context) c0gVar.U.get(), (tse) c0gVar.B.get(), (tt2) zzfVar.n.get(), (pav) zzfVar.p3.get(), f0gVar.N(), zzfVar.x());
        ru.yandex.taxi.design.utils.c.t(this, p8h0.safety_center, new t7i0(this, 2));
        int i = 3;
        ru.yandex.taxi.design.utils.c.t(this, p8h0.order_screens_subtitle_group, new t7i0(this, i));
        int i2 = p8h0.upsell;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.upsell = (UpsellView) ((View) rp31.d(this, i2));
        RobotoTextView robotoTextView = (RobotoTextView) ((View) rp31.d(this, p8h0.order_screens_title));
        this.titleView = robotoTextView;
        this.subtitleView = (RobotoTextView) ((View) rp31.d(this, p8h0.order_screens_subtitle));
        this.subtitleNavigationIcon = (View) rp31.d(this, p8h0.order_screens_cashback_navigation_icon);
        this.titlesContainer = (LinearLayout) ((View) rp31.d(this, p8h0.titles_container));
        this.subtitleContainer = (LinearLayout) ((View) rp31.d(this, p8h0.order_screens_subtitle_group));
        this.detailsContainer = (LinearLayout) ((View) rp31.d(this, p8h0.details_container));
        this.details = (DetailsCardListItem) ((View) rp31.d(this, p8h0.details));
        this.rideSupport = (DetailsCardListItem) ((View) rp31.d(this, p8h0.ride_support));
        this.costDetailsLayout = (ViewGroup) ((View) rp31.d(this, p8h0.cost_details_layout));
        this.newCostDetailsLayout = (ViewGroup) ((View) rp31.d(this, p8h0.new_cost_details_layout));
        this.messageView = (TextView) ((View) rp31.d(this, p8h0.cost_message));
        FramedRecyclerView framedRecyclerView = (FramedRecyclerView) ((View) rp31.d(this, p8h0.promo_plaque_top_section));
        this.promoPlaqueTopSection = framedRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, p8h0.promo_plaque_bottom_section));
        this.promoPlaqueBottomSection = recyclerView;
        this.qualityQuestionButton = (QualityQuestionButton) ((View) rp31.d(this, p8h0.quality_question_banner));
        this.paymentMethod = (DetailsCardListItem) ((View) rp31.d(this, p8h0.payment_method));
        OpenCostCenterListItem openCostCenterListItem = (OpenCostCenterListItem) ((View) rp31.d(this, p8h0.cost_center));
        this.costCenter = openCostCenterListItem;
        ViewStub viewStub = (ViewStub) ((View) rp31.d(this, p8h0.driver_stub));
        this.driverStub = viewStub;
        this.safetyCenterButton = (IconCircleButton) ((View) rp31.d(this, p8h0.safety_center));
        this.supportCircleButton = (IconCircleButton) ((View) rp31.d(this, p8h0.support_chat_button));
        NestedScrollView nestedScrollView = (NestedScrollView) ((View) rp31.d(this, p8h0.rate_scroll_view));
        this.scrollView = nestedScrollView;
        FeedbackView feedbackView = (FeedbackView) ((View) rp31.d(this, p8h0.feedback_rate_view));
        this.feedbackView = feedbackView;
        this.driverPhoneComponent = (DetailsCardListItem) ((View) rp31.d(this, p8h0.driver_phone_number_component));
        this.feedbackSection = (LinearLayout) ((View) rp31.d(this, p8h0.feedback_section));
        this.driverSectionView = (DriverSectionView) ((View) rp31.d(this, p8h0.driver_section));
        this.sectionDetailView = (SectionDetailView) ((View) rp31.d(this, p8h0.section_detail));
        this.horizontalButtons = (DetailsCardHorizontalButtons) ((View) rp31.d(this, p8h0.horizontal_buttons));
        this.topButtons = (ViewGroup) ((View) rp31.d(this, p8h0.rate_top_buttons));
        this.doneButton = (ButtonComponent) ((View) rp31.d(this, p8h0.done));
        this.travelCompanionDetailView = (TravelCompanionDetailView) ((View) rp31.d(this, p8h0.travel_companion_detail_view));
        this.autoDividerComponentList = (AutoDividerComponentList) ((View) rp31.d(this, p8h0.auto_divider_component));
        this.cardContainer = (ViewGroup) ((View) rp31.d(this, p8h0.card_container));
        this.bottomSheetCard = (View) rp31.d(this, p8h0.bottom_sheet_card);
        this.doneButtonContainer = (ViewGroup) ((View) rp31.d(this, p8h0.done_button_frame));
        this.topDivider = (View) rp31.d(this, p8h0.top_divider);
        this.subtitleGroup = (View) rp31.d(this, p8h0.order_screens_subtitle_group);
        this.accessibilityScrollDownHelper = (View) rp31.d(this, p8h0.accessibility_scroll_down_helper);
        this.accessibilityScrollUpHelper = (View) rp31.d(this, p8h0.accessibility_scroll_up_helper);
        feedbackView.init(fxx0Var);
        feedbackView.setOnCommentClickListener(new s7i0(this, i));
        feedbackView.setRatingBarChangeListener(new d(getPresenter()));
        feedbackView.setOnRatingReasonClickListener(new e(this));
        setClickable(true);
        setImportantForAccessibility(2);
        ru.yandex.taxi.design.utils.c.w(viewStub, getDriverCircleButton());
        int i3 = 0;
        openCostCenterListItem.setDebounceClickListener(new t7i0(this, i3));
        setAccessibilityHelpers();
        androidx.core.view.b.q(robotoTextView, true);
        this.promoPlaqueTopAdapter = ((jtc) getCommunicationsAdapterFactory()).a(new u7i0(this, i3));
        this.promoPlaqueBottomAdapter = ((jtc) getCommunicationsAdapterFactory()).a(new u7i0(this, 1));
        framedRecyclerView.setAdapter(this.promoPlaqueTopAdapter);
        recyclerView.setAdapter(this.promoPlaqueBottomAdapter);
        int r = tje.r(usg0.bottom_sheet_corner_radius, getContext());
        nestedScrollView.setBackgroundResource(0);
        nestedScrollView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(r));
        nestedScrollView.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RateView rateView) {
        c presenter = rateView.getPresenter();
        presenter.T.c("SafetyCenter");
        presenter.d0.Q7(presenter.x.b().a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(RateView rateView) {
        OrderStatusInfo.CashbackDetails cashbackDetails;
        c presenter = rateView.getPresenter();
        OrderStatusInfo.CostMessageDetails costMessageDetails = presenter.x.b().V().T;
        if (costMessageDetails == null || (cashbackDetails = costMessageDetails.c) == null) {
            return;
        }
        OrderStatusInfo.CashbackDetails.Action action = cashbackDetails.a;
        if ((action != null ? action.a : null) == OrderStatusInfo.CashbackDetails.ActionType.BUY_PLUS) {
            d49 d49Var = presenter.L;
            d49Var.getClass();
            d49.d(d49Var, CashbackCardContext.ORDER_COMPLETE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(RateView rateView, View view) {
        c presenter = rateView.getPresenter();
        ci70 ci70Var = presenter.z;
        o2y0 o2y0Var = presenter.x;
        ci70Var.e(o2y0Var.b().a);
        presenter.d0.Y8(o2y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(RateView rateView) {
        c presenter = rateView.getPresenter();
        presenter.d0.openCostCenter(presenter.x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$4(RateView rateView, fpf0 fpf0Var) {
        c presenter = rateView.getPresenter();
        presenter.V.a(fpf0Var, PromoPlaqueAnalytics$Screen.DETAILS_TOP);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$5(RateView rateView, fpf0 fpf0Var) {
        c presenter = rateView.getPresenter();
        presenter.V.a(fpf0Var, PromoPlaqueAnalytics$Screen.DETAILS);
        return zy11.a;
    }

    private final void addNewListItemComponent(v7s detail) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, getContext()));
        listItemComponent.setTitleTypeface(0);
        listItemComponent.setTitleLineSpacing(tje.r(mrg0.component_list_item_line_spacing, getContext()), 0.0f);
        listItemComponent.setTrailTextStyle(3);
        listItemComponent.setTrailTextSize(tje.r(mrg0.component_text_size_body, getContext()));
        listItemComponent.setTrailLetterSpacing(0.01f);
        listItemComponent.setTrailTextColor(qje.t(xng0.textMain, getContext()));
        listItemComponent.setTrailCompanionText(detail.c);
        listItemComponent.setTitle(detail.a);
        listItemComponent.setSubtitle(detail.b);
        listItemComponent.setMinHeight(tje.r(wug0.detail_list_item_min_height, getContext()));
        listItemComponent.setPadding(tje.r(wug0.detail_list_item_horizontal_padding, getContext()), 0, tje.r(wug0.detail_list_item_horizontal_padding, getContext()), 0);
        listItemComponent.setVerticalPadding(tje.r(wug0.detail_list_item_vertical_padding, getContext()));
        this.newCostDetailsLayout.addView(listItemComponent);
    }

    private final void appendCircleButtonsVisibility(List<String> visibleButtons, List<String> invisibleButtons) {
        if (this.topButtons.getVisibility() == 0) {
            if (ru.yandex.taxi.design.utils.c.r(getDriverCircleButton())) {
                visibleButtons.add("Driver");
            } else {
                invisibleButtons.add("Driver");
            }
            if (ru.yandex.taxi.design.utils.c.r(this.safetyCenterButton)) {
                visibleButtons.add("SafetyCenter");
            } else {
                invisibleButtons.add("SafetyCenter");
            }
            if (ru.yandex.taxi.design.utils.c.r(this.supportCircleButton)) {
                visibleButtons.add("SupportChat");
            } else {
                invisibleButtons.add("SupportChat");
            }
        }
    }

    private final void appendDriverSectionVisibility(List<String> visibleButtons, List<String> invisibleButtons) {
        boolean z = this.driverSectionView.getVisibility() == 0;
        if (z && ru.yandex.taxi.design.utils.c.r(this.driverSectionView)) {
            visibleButtons.add("Driver");
            visibleButtons.add("CopyMenu");
        } else if (z) {
            invisibleButtons.add("Driver");
            invisibleButtons.add("CopyMenu");
        }
    }

    private final void appendHorizontalButtonsVisibility(List<String> visibleButtons, List<String> invisibleButtons) {
        if (this.horizontalButtons.getVisibility() == 0) {
            visibleButtons.addAll(this.horizontalButtons.getVisibleButtons());
            invisibleButtons.addAll(this.horizontalButtons.getInvisibleButtons());
        }
    }

    private final void fillCostDetails(List<v7s> details) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.detailsContainer.getLayoutParams();
        marginLayoutParams.leftMargin = tje.r(wug0.driver_profile_name_margin_top, getContext());
        marginLayoutParams.rightMargin = tje.r(wug0.driver_profile_name_margin_top, getContext());
        this.detailsContainer.setLayoutParams(marginLayoutParams);
        this.newCostDetailsLayout.setVisibility(8);
        this.costDetailsLayout.setVisibility(0);
        this.costDetailsLayout.removeAllViews();
        updateHeaderDividersVisibility();
        for (v7s v7sVar : details) {
            CostDetailsView costDetailsView = new CostDetailsView(getContext(), null, 0, 0, 14, null);
            costDetailsView.setData(evu0.k0(v7sVar.a.toString()).toString(), v7sVar.c);
            this.costDetailsLayout.addView(costDetailsView);
        }
    }

    private final void fillNewCostDetails(List<v7s> details) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.detailsContainer.getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        this.detailsContainer.setLayoutParams(marginLayoutParams);
        this.costDetailsLayout.setVisibility(8);
        this.newCostDetailsLayout.setVisibility(0);
        this.newCostDetailsLayout.removeAllViews();
        updateHeaderDividersVisibility();
        Iterator<v7s> it = details.iterator();
        while (it.hasNext()) {
            addNewListItemComponent(it.next());
        }
    }

    public static /* synthetic */ void getCoroutineScope$annotations() {
    }

    private final void invalidateDetailsContainer() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.detailsContainer.getLayoutParams();
        marginLayoutParams.topMargin = (int) tje.x(getContext(), 8.0f);
        boolean z = this.costDetailsLayout.getVisibility() == 0 || this.newCostDetailsLayout.getVisibility() == 0 || this.messageView.getVisibility() == 0 || this.sectionDetailView.getVisibility() == 0;
        this.detailsContainer.setLayoutParams(marginLayoutParams);
        this.detailsContainer.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(RateView rateView, View view) {
        c presenter = rateView.getPresenter();
        presenter.T.c("Driver");
        presenter.S.B(presenter.x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$2(RateView rateView, ibk0 ibk0Var) {
        rateView.getPresenter().Mg(ibk0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onCarNumberClick(c cVar, View view) {
        zuj0 zuj0Var = cVar.J;
        q48 a = cVar.I.a(cVar.x.b(), false);
        if (web1.i(a)) {
            cVar.T.c("CopyMenu");
            avj0 avj0Var = (avj0) zuj0Var;
            ((m48) cVar.R).b(a, view, -tje.u(24, avj0Var.a), tje.u(24, avj0Var.a), CopySource.DETAILS, 8388661);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrollChanged(int scrollY) {
        if (scrollY >= 0) {
            float f = scrollY;
            this.upsell.setAlpha(1.0f - (f / 100.0f));
            int i = this.orderScreensCardElevation;
            this.upsell.setElevation(Math.max(i - ((i * f) / 100.0f), 0.0f));
            this.upsell.setEnabled(scrollY <= 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderCompleteButton$lambda$0(RateView rateView, c5j c5jVar) {
        rateView.getPresenter().Mg(c5jVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderDriverPhoneButton$lambda$0(RateView rateView, vim vimVar) {
        rateView.getPresenter().Mg(vimVar.c);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderInfoState$lambda$0(RateView rateView) {
        c presenter = rateView.getPresenter();
        ci70 ci70Var = presenter.z;
        String str = presenter.x.b().a;
        yh70 yh70Var = ci70Var.f;
        yh70Var.getClass();
        yh70Var.a.a("openOrderInfo", new HashMap(), 1, new HashMap());
        to31 to31Var = ci70Var.w;
        to31Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        to31Var.a.a("view.order_info", hashMap, 1, new HashMap());
        presenter.d0.showOrderInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderRideSupportState$lambda$0(RateView rateView, mqk0 mqk0Var) {
        rateView.getPresenter().Mg(mqk0Var.d);
    }

    private final void setAccessibilityHelpers() {
        if (!tje.J(getContext())) {
            this.accessibilityScrollUpHelper.setVisibility(8);
            this.accessibilityScrollDownHelper.setVisibility(8);
            return;
        }
        androidx.core.view.b.p(this.cardContainer, new mg(26, this));
        hg.a(this.accessibilityScrollDownHelper);
        hg.a(this.accessibilityScrollUpHelper);
        this.accessibilityScrollDownHelper.setVisibility(0);
        this.accessibilityScrollUpHelper.setVisibility(8);
        this.accessibilityScrollDownHelper.setOnClickListener(new s7i0(this, 0));
        this.accessibilityScrollUpHelper.setOnClickListener(new s7i0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAccessibilityHelpers$lambda$0(RateView rateView, View view) {
        rateView.scrollView.smoothScrollTo(0, rateView.cardContainer.getBottom());
        View view2 = rateView.lastFocusedView;
        if (view2 != null) {
            view2.requestFocusFromTouch();
        }
        rateView.accessibilityScrollDownHelper.setVisibility(8);
        rateView.accessibilityScrollUpHelper.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAccessibilityHelpers$lambda$1(RateView rateView, View view) {
        rateView.scrollView.smoothScrollTo(0, rateView.cardContainer.getTop());
        rateView.accessibilityScrollDownHelper.setVisibility(0);
        rateView.accessibilityScrollUpHelper.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDriver$lambda$0(RateView rateView) {
        c presenter = rateView.getPresenter();
        presenter.F.b(presenter.x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDriver$lambda$1(RateView rateView, qim qimVar) {
        rateView.getPresenter().d0.w5(qimVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showQualityQuestionButton$lambda$0(RateView rateView, lgg0 lgg0Var, View view) {
        c presenter = rateView.getPresenter();
        ((mg21) presenter.M).c(lgg0Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSupportChatButton$lambda$0(RateView rateView, xkw0 xkw0Var) {
        c presenter = rateView.getPresenter();
        ibk0 ibk0Var = xkw0Var.b;
        presenter.T.c("SupportChat");
        presenter.Mg(ibk0Var);
    }

    private final void updateHeaderDividersVisibility() {
        if (this.newCostDetailsLayout.getVisibility() == 0 || this.costDetailsLayout.getVisibility() == 0 || this.messageView.getVisibility() == 0) {
            this.topDivider.setVisibility(0);
            return;
        }
        int visibility = this.driverSectionView.getVisibility();
        View view = this.topDivider;
        if (visibility == 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        xvy0.a(qje.t(xng0.cardDivider, getContext()), this.cardContainer);
        this.bottomSheetCard.setBackground(vng.t(n4h0.bg_rounded_top, getContext()));
        ViewGroup viewGroup = this.cardContainer;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                xvy0.a(qje.t(xng0.bgMain, getContext()), this.doneButtonContainer);
                this.promoPlaqueBottomSection.setBackground(getContext().getDrawable(f1h0.round_section_bg));
                this.qualityQuestionButton.setBackground(getContext().getDrawable(n4h0.ic_complete_section_background));
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                if (!childAt.equals(this.promoPlaqueBottomSection)) {
                    xvy0.a(qje.t(xng0.bgMain, getContext()), childAt);
                }
                i = i2;
            }
        }
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void closeView() {
        c presenter = getPresenter();
        ci70 ci70Var = presenter.z;
        o2y0 o2y0Var = presenter.x;
        String str = o2y0Var.b().a;
        x4e.B(ci70Var.n.a, "Complete.DidTapCancelButton", new HashMap(), 1);
        presenter.B.a(o2y0Var.b().a);
        presenter.Lg();
    }

    /* renamed from: feedbackView, reason: from getter */
    public final FeedbackView getFeedbackView() {
        return this.feedbackView;
    }

    public final Activity getActivity() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        return null;
    }

    public final htc getCommunicationsAdapterFactory() {
        htc htcVar = this.communicationsAdapterFactory;
        if (htcVar != null) {
            return htcVar;
        }
        return null;
    }

    public final tse getCoroutineScope() {
        tse tseVar = this.coroutineScope;
        if (tseVar != null) {
            return tseVar;
        }
        return null;
    }

    public final DriverCircleButton getDriverCircleButton() {
        DriverCircleButton driverCircleButton = this.driverCircleButton;
        if (driverCircleButton != null) {
            return driverCircleButton;
        }
        return null;
    }

    public final pav getImageLoader() {
        pav pavVar = this.imageLoader;
        if (pavVar != null) {
            return pavVar;
        }
        return null;
    }

    public final qn70 getOrderCardStateRepository() {
        qn70 qn70Var = this.orderCardStateRepository;
        if (qn70Var != null) {
            return qn70Var;
        }
        return null;
    }

    public final z0a0 getPaymentIconLoader() {
        z0a0 z0a0Var = this.paymentIconLoader;
        if (z0a0Var != null) {
            return z0a0Var;
        }
        return null;
    }

    public final c getPresenter() {
        c cVar = this.presenter;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final k7x0 getTagUrlFormatter() {
        k7x0 k7x0Var = this.tagUrlFormatter;
        if (k7x0Var != null) {
            return k7x0Var;
        }
        return null;
    }

    public final View getTitlesContainer() {
        return this.titlesContainer;
    }

    public final ru.yandex.taxi.combo.ui.a getTravelCompanionDetailPresenter() {
        ru.yandex.taxi.combo.ui.a aVar = this.travelCompanionDetailPresenter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final yvf0 getTravelCompanionStatusViewProvider() {
        yvf0 yvf0Var = this.travelCompanionStatusViewProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public final ip11 getTypefaceDelegate() {
        ip11 ip11Var = this.typefaceDelegate;
        if (ip11Var != null) {
            return ip11Var;
        }
        return null;
    }

    public final void handleOrderViewMode(OrderStateView.Mode mode) {
        c presenter = getPresenter();
        pze0 b = presenter.y.b(presenter.x.b());
        d980 d980Var = presenter.H;
        d980Var.d(((avj0) presenter.J).i(mode.getCompleteStateTitleId(), b.a));
        d980Var.c(((avj0) d980Var.f).h(mode.getRateSubtitleId()));
    }

    @Override // defpackage.g7i0
    public void hidePriceDetails() {
        this.costDetailsLayout.setVisibility(8);
        this.newCostDetailsLayout.setVisibility(8);
    }

    @Override // defpackage.ogg0
    public void hideQualityQuestionButton() {
        this.qualityQuestionButton.setVisibility(8);
    }

    public void hideSafetyCenter() {
        this.safetyCenterButton.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c presenter = getPresenter();
        OrderStateView.Mode mode = presenter.c0;
        dm21 dm21Var = presenter.A;
        d980 d980Var = presenter.H;
        com.yandex.go.taxi.order.details.v1.domain.a aVar = presenter.Q;
        presenter.Bg(this);
        o2y0 o2y0Var = presenter.x;
        TaxiOrder b = o2y0Var.b();
        pze0 b2 = presenter.y.b(b);
        List list = b2.c;
        int i = 3;
        if (list.isEmpty()) {
            ((g7i0) presenter.Dg()).hidePriceDetails();
        } else {
            com.yandex.go.coroutines.b.g(presenter.Jg(), null, null, new RatePresenter$showPriceDetails$1(presenter, list, null), 3);
        }
        OrderStatusInfo V = presenter.x.b().V();
        V.getClass();
        if (!V.f(SimpleBooleanExperiment.NEW_COST_BREAKDOWN)) {
            showPriceMessage(b2.b);
        }
        showDriver(rim.a(b));
        presenter.T.b("Driver");
        tje.N(presenter.Jg(), null, null, new RatePresenter$subscribe$$inlined$safeCollectIn$1(presenter.N.a(o2y0Var), null, presenter), 3);
        com.yandex.go.taxi.order.feedback.domain.b bVar = (com.yandex.go.taxi.order.feedback.domain.b) dm21Var;
        com.yandex.go.coroutines.b.h(presenter.Jg(), new o(new jqr(bVar.a(o2y0Var.b().a), new RatePresenter$subscribe$2(presenter, null), i), new RatePresenter$subscribe$3(presenter, null)));
        ((jqz) presenter.P).a.c();
        tje.N(presenter.Jg(), null, null, new RatePresenter$subscribeToOrderHolder$$inlined$safeCollectIn$1(o2y0Var.a(), null, presenter), 3);
        switchTitlesContainer(true);
        int i2 = 2;
        d980Var.p = new dgb(i2, presenter);
        d980Var.u = true;
        d980Var.x = true;
        boolean z = false;
        qyy0.c(new kz8(i2, d980Var, z, z));
        d980Var.d(((avj0) presenter.J).i(mode.getCompleteStateTitleId(), b2.a));
        d980Var.c(((avj0) d980Var.f).h(mode.getRateSubtitleId()));
        aVar.a();
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeUpsell$$inlined$safeCollectIn$1(new jqr(aVar.B, new RatePresenter$observeUpsell$1(presenter, null), i), null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeDriverSection$$inlined$safeCollectIn$1(aVar.l, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeDriverSection$$inlined$safeCollectIn$2(aVar.m, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeDriverSection$$inlined$safeCollectIn$3(aVar.x, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeDriverSection$$inlined$safeCollectIn$4(aVar.n, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeDriverSection$$inlined$safeCollectIn$5(aVar.s, null, presenter), 3);
        com.yandex.go.coroutines.b.g(presenter.Jg(), null, null, new RatePresenter$observeDriverSection$6(presenter, null), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observePromoPlaques$$inlined$safeCollectIn$1(aVar.v, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observePromoPlaques$$inlined$safeCollectIn$2(aVar.w, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeSupportButton$$inlined$safeCollectIn$1(aVar.y, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeRideSupportState$$inlined$safeCollectIn$1(aVar.z, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observePaymentUpdates$$inlined$safeCollectIn$1(aVar.r, null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeCompleteButton$$inlined$safeCollectIn$1(new m0(aVar.D, bVar.a(o2y0Var.b().a), new RatePresenter$observeCompleteButton$1(3, null)), null, presenter), 3);
        gci0 gci0Var = aVar.E;
        presenter.D.getClass();
        sjh sjhVar = uyj.a;
        tje.N(presenter.Jg(), null, null, new RatePresenter$observeDriverPhone$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(gci0Var, mdh.b), null, presenter), 3);
        getTravelCompanionDetailPresenter().Kg(this);
        this.driverSectionView.setDriverClickListener(new s7i0(this, i2));
        this.driverSectionView.setCarPlateClickListener(new d5b0(26, getPresenter()));
        this.orderCardStateJob = tje.N(getCoroutineScope(), null, null, new RateView$onAttachedToWindow$$inlined$safeCollectIn$1(getOrderCardStateRepository().b, null, this), 3);
        ((g1a0) getPaymentIconLoader()).a();
        this.upsell.setActionHandler(new u7i0(this, i2));
        tje.a0(getContext(), this.onBackPressedCallback);
        this.titleView.setText("");
        this.scrollView.setOnScrollChangeListener(this.onScrollChangedListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().Cg();
        getTravelCompanionDetailPresenter().Cg();
        l8x l8xVar = this.orderCardStateJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        ((g1a0) getPaymentIconLoader()).d();
        this.onBackPressedCallback.g();
        this.scrollView.setOnScrollChangeListener((View.OnScrollChangeListener) null);
    }

    public final void pause() {
        c presenter = getPresenter();
        presenter.getClass();
        presenter.d0 = (g7i0.a) ((zxf0) pwf0.c(g7i0.a.class));
    }

    @Override // defpackage.g7i0
    public void renderButtonsState(x4j state) {
        if (state instanceof v4j) {
            this.topButtons.setVisibility(8);
            this.horizontalButtons.setVisibility(8);
        } else if (state instanceof u4j) {
            this.topButtons.setVisibility(0);
            this.horizontalButtons.setVisibility(8);
        } else {
            if (!(state instanceof w4j)) {
                w511.b();
                return;
            }
            this.topButtons.setVisibility(8);
            this.horizontalButtons.setVisibility(0);
            this.horizontalButtons.render((w4j) state);
        }
    }

    @Override // defpackage.yc11
    public void renderCompanionCard(List<ad11> travelCompanions) {
        this.travelCompanionDetailView.setVisibility(!travelCompanions.isEmpty() ? 0 : 8);
        this.autoDividerComponentList.setTopDivider(DividerType.NONE);
        this.travelCompanionDetailView.setCompanionCards(getTravelCompanionStatusViewProvider(), travelCompanions);
    }

    @Override // defpackage.g7i0
    public void renderCompleteButton(c5j state) {
        this.doneButton.setText(state.a);
        this.doneButton.setDebounceClickListener(new xmf0(6, this, state));
    }

    @Override // defpackage.g7i0
    public void renderDriverPhoneButton(xim state) {
        boolean z = state instanceof vim;
        DetailsCardListItem detailsCardListItem = this.driverPhoneComponent;
        if (!z) {
            detailsCardListItem.setVisibility(8);
            return;
        }
        vim vimVar = (vim) state;
        detailsCardListItem.applyStyle(vimVar.d);
        this.driverPhoneComponent.setClickActionListener(new agc0(19, this, vimVar));
        this.driverPhoneComponent.setBackground(null);
        this.driverPhoneComponent.setTitle(vimVar.a);
        this.driverPhoneComponent.setSubtitle(vimVar.b);
        this.driverPhoneComponent.setVisibility(0);
    }

    @Override // defpackage.g7i0
    public void renderDriverSection(f6j state) {
        this.driverSectionView.render(state);
        updateHeaderDividersVisibility();
    }

    @Override // defpackage.g7i0
    public void renderInfoState(t6j state) {
        boolean z = state instanceof r6j;
        DetailsCardListItem detailsCardListItem = this.details;
        if (!z) {
            detailsCardListItem.setVisibility(8);
            return;
        }
        r6j r6jVar = (r6j) state;
        detailsCardListItem.setTitle(r6jVar.a);
        this.details.setSubtitle(r6jVar.b);
        this.details.setLeadImage(r6jVar.d);
        this.details.applyStyle(r6jVar.c);
        this.details.setDebounceClickListener(new t7i0(this, 1));
        this.details.setVisibility(0);
    }

    @Override // defpackage.g7i0
    public void renderPaymentState(v6j state) {
        DetailsCardListItem detailsCardListItem = this.paymentMethod;
        boolean z = state.a;
        t0a0 t0a0Var = state.f;
        detailsCardListItem.setVisibility(z ? 0 : 8);
        this.paymentMethod.setTitle(state.d);
        this.paymentMethod.setSubtitle(state.e);
        this.paymentMethod.applyStyle(state.g);
        if (t0a0Var != null) {
            ((g1a0) getPaymentIconLoader()).b(this.paymentMethod.getLeadImageView(), t0a0Var);
        }
    }

    @Override // defpackage.g7i0
    public void renderPromoPlaquesBottomSection(List<kpf0> plaques, o2y0 orderHolder) {
        this.promoPlaqueBottomSection.setVisibility(!plaques.isEmpty() ? 0 : 8);
        this.promoPlaqueBottomAdapter.l(plaques, orderHolder, PromoPlaqueAnalytics$Screen.DETAILS);
    }

    @Override // defpackage.g7i0
    public void renderPromoPlaquesTopSection(List<kpf0> plaques, o2y0 orderHolder) {
        this.promoPlaqueTopSection.setVisibility(!plaques.isEmpty() ? 0 : 8);
        this.promoPlaqueTopAdapter.l(plaques, orderHolder, PromoPlaqueAnalytics$Screen.DETAILS_TOP);
    }

    @Override // defpackage.g7i0
    public void renderRideSupportState(oqk0 state) {
        boolean z = state instanceof mqk0;
        DetailsCardListItem detailsCardListItem = this.rideSupport;
        if (!z) {
            detailsCardListItem.setVisibility(8);
            return;
        }
        mqk0 mqk0Var = (mqk0) state;
        detailsCardListItem.setTitle(mqk0Var.a);
        this.rideSupport.setLeadImage(mqk0Var.c);
        this.rideSupport.applyStyle(mqk0Var.b);
        this.rideSupport.setDebounceClickListener(new xmf0(5, this, mqk0Var));
        this.rideSupport.setVisibility(0);
    }

    @Override // defpackage.g7i0
    public void renderSectionDetail(t0q0 state) {
        boolean z = state instanceof o0q0;
        SectionDetailView sectionDetailView = this.sectionDetailView;
        if (z) {
            sectionDetailView.setVisibility(0);
            this.sectionDetailView.render((o0q0) state);
        } else {
            sectionDetailView.setVisibility(8);
        }
        invalidateDetailsContainer();
    }

    @Override // defpackage.g7i0
    public void renderUpsell(d8j state) {
        if (state instanceof c8j) {
            this.upsell.setVisibility(8);
        } else if (state instanceof b8j) {
            this.upsell.setVisibility(0);
            this.upsell.render((b8j) state);
        }
    }

    @Override // defpackage.g7i0
    public void reportButtonsVisibility() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        appendDriverSectionVisibility(arrayList, arrayList2);
        appendHorizontalButtonsVisibility(arrayList, arrayList2);
        appendCircleButtonsVisibility(arrayList, arrayList2);
        getPresenter().T.d(arrayList, arrayList2);
    }

    public final void resetScroll() {
        NestedScrollView nestedScrollView = this.scrollView;
        Rect rect = xw31.a;
        nestedScrollView.smoothScrollTo(0, 0);
        nestedScrollView.smoothScrollTo(0, 0);
    }

    public final void resume(g7i0.a callback) {
        getPresenter().d0 = callback;
        requestFocus();
    }

    public final void setActivity(Activity activity) {
        this.activity = activity;
    }

    public final void setCommunicationsAdapterFactory(htc htcVar) {
        this.communicationsAdapterFactory = htcVar;
    }

    public final void setCoroutineScope(tse tseVar) {
        this.coroutineScope = tseVar;
    }

    @Override // defpackage.g7i0
    public void setCostCenterState(n470 viewModel) {
        this.costCenter.setVisibility(viewModel.a.length() > 0 ? 0 : 8);
        this.costCenter.setTitle(viewModel.a);
        this.costCenter.setSubtitle(viewModel.b);
    }

    public final void setDriverCircleButton(DriverCircleButton driverCircleButton) {
        this.driverCircleButton = driverCircleButton;
    }

    @Override // defpackage.g7i0
    public void setFeedbackSectionBottomPadding(boolean isEnabled) {
        this.feedbackSection.setPadding(0, tje.r(wug0.order_state_view_top_padding, getContext()), 0, isEnabled ? tje.r(wug0.order_state_view_top_padding, getContext()) : 0);
    }

    public final void setImageLoader(pav pavVar) {
        this.imageLoader = pavVar;
    }

    public final void setOrderCardStateRepository(qn70 qn70Var) {
        this.orderCardStateRepository = qn70Var;
    }

    public final void setPaymentIconLoader(z0a0 z0a0Var) {
        this.paymentIconLoader = z0a0Var;
    }

    public final void setPresenter(c cVar) {
        this.presenter = cVar;
    }

    @Override // defpackage.g7i0
    public void setSubtitleIsClickable(boolean isClickable) {
        this.subtitleGroup.setClickable(isClickable);
    }

    public final void setTagUrlFormatter(k7x0 k7x0Var) {
        this.tagUrlFormatter = k7x0Var;
    }

    @Override // defpackage.g7i0
    public void setTitles(b980 orderTitles) {
        RobotoTextView robotoTextView = this.titleView;
        String str = orderTitles.a;
        CharSequence charSequence = orderTitles.c;
        robotoTextView.setText(str);
        this.titleView.setTextColor(orderTitles.b);
        RobotoTextView robotoTextView2 = this.titleView;
        String str2 = orderTitles.a;
        robotoTextView2.setVisibility(str2 != null && str2.length() != 0 ? 0 : 8);
        this.subtitleView.setText(charSequence);
        this.subtitleView.setTextColor(orderTitles.d);
        this.subtitleView.setVisibility((charSequence == null || charSequence.length() == 0) ? false : true ? 0 : 8);
    }

    @Override // defpackage.g7i0
    public void setTitlesAlignment(OrderTitles$Alignment alignment) {
        OrderTitles$Alignment orderTitles$Alignment = OrderTitles$Alignment.START;
        RobotoTextView robotoTextView = this.titleView;
        if (alignment == orderTitles$Alignment) {
            robotoTextView.setGravity(8388611);
            this.subtitleView.setGravity(8388611);
            this.titlesContainer.setGravity(8388611);
            this.subtitleContainer.setGravity(8388611);
            return;
        }
        robotoTextView.setGravity(1);
        this.subtitleView.setGravity(1);
        this.titlesContainer.setGravity(1);
        this.subtitleContainer.setGravity(1);
    }

    public final void setTravelCompanionDetailPresenter(ru.yandex.taxi.combo.ui.a aVar) {
        this.travelCompanionDetailPresenter = aVar;
    }

    public final void setTravelCompanionStatusViewProvider(yvf0 yvf0Var) {
        this.travelCompanionStatusViewProvider = yvf0Var;
    }

    public final void setTypefaceDelegate(ip11 ip11Var) {
        this.typefaceDelegate = ip11Var;
    }

    @Override // defpackage.g7i0
    public void showDriver(qim driver) {
        getDriverCircleButton().show(driver, new v7i0(this));
        getDriverCircleButton().setOnClickListener(driver, new xmf0(8, this, driver));
    }

    @Override // defpackage.g7i0
    public void showPriceDetails(List<v7s> priceDetails, boolean isNewScreenEnabled) {
        if (priceDetails.isEmpty()) {
            hidePriceDetails();
        } else if (isNewScreenEnabled) {
            fillNewCostDetails(priceDetails);
        } else {
            fillCostDetails(priceDetails);
        }
        invalidateDetailsContainer();
    }

    @Override // defpackage.g7i0
    public void showPriceMessage(String message) {
        if (message == null || message.length() == 0) {
            this.messageView.setVisibility(8);
        } else {
            this.messageView.setVisibility(0);
            this.messageView.setText(message);
        }
        invalidateDetailsContainer();
    }

    @Override // defpackage.ogg0
    public void showQualityQuestionButton(lgg0 model) {
        this.qualityQuestionButton.setVisibility(0);
        this.qualityQuestionButton.setOnClickListener(new fx00(29, this, model));
        String str = model.b;
        if (str != null && str.length() != 0) {
            String a = ((m7x0) getTagUrlFormatter()).a(str);
            nac nacVar = (nac) getImageLoader().a(this.qualityQuestionButton.getLeadImageView());
            nacVar.e(n4h0.ic_secret_shopper);
            nacVar.c(a);
        }
        String str2 = model.c;
        if (str2.length() != 0) {
            this.qualityQuestionButton.setTitle(str2);
        }
    }

    public void showSafetyCenter(String title) {
        this.safetyCenterButton.setVisibility(0);
        this.safetyCenterButton.setTitle(title);
        getPresenter().T.b("SafetyCenter");
    }

    @Override // defpackage.g7i0
    public void showSubtitleNavigationIcon(boolean showNavigationIcon) {
        this.subtitleNavigationIcon.setVisibility(showNavigationIcon ? 0 : 8);
    }

    @Override // defpackage.g7i0
    public void showSupportChatButton(xkw0 uiState) {
        boolean z = uiState.c;
        this.supportCircleButton.setVisibility(z ? 0 : 8);
        if (z) {
            this.supportCircleButton.setTitle(uiState.a);
            getPresenter().T.b("SupportChat");
            ru.yandex.taxi.design.utils.c.t(this, p8h0.support_chat_button, new xmf0(7, this, uiState));
        }
    }

    @Override // defpackage.g7i0
    public void switchTitlesContainer(boolean classic) {
        this.titlesContainer.setVisibility(classic ? 0 : 8);
    }
}
